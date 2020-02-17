package com.star.blog;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import java.time.LocalDateTime;
import java.util.List;

import org.aspectj.lang.annotation.After;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.star.blog.domain.entity.BoardEntity;
import com.star.blog.repository.BoardRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
class BlogApplicationTests {

	@Autowired
    BoardRepository boardRepository;

    @After(value = "")
    public void cleanup() {
        /** 
        이후 테스트 코드에 영향을 끼치지 않기 위해 
        테스트 메소드가 끝날때 마다 respository 전체 비우는 코드
        **/
    	boardRepository.deleteAll();
    }

    @Test
    public void 게시글저장_불러오기() {
        //given
    	boardRepository.save(BoardEntity.builder()
                .title("테스트 게시글")
                .content("테스트 본문")
                .build());

        //when
        List<BoardEntity> boardList = boardRepository.findAll();

        //then
        BoardEntity boardEntity = boardList.get(0);
        assertThat(boardEntity.getTitle(), is("테스트 게시글"));
        assertThat(boardEntity.getContent(), is("테스트 본문"));
    }
    
    @Test
    public void BaseTimeEntity_등록 () {
        //given
        LocalDateTime now = LocalDateTime.now();
        boardRepository.save(BoardEntity.builder()
                .title("테스트 게시글")
                .content("테스트 본문")
                .build());
        //when
        List<BoardEntity> boardList = boardRepository.findAll();

        //then 
        BoardEntity board = boardList.get(0);
        assertTrue(board.getCreatedDate().isAfter(now));
        assertTrue(board.getModifiedDate().isAfter(now));
    }
    
    

}
