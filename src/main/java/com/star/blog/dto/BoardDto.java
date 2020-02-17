package com.star.blog.dto;

import com.star.blog.entity.BoardEntity;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@NoArgsConstructor
public class BoardDto {
	
	private Long id;
    private String title;
    private String content;
	
    public BoardEntity toEntity(){
        BoardEntity build = BoardEntity.builder()
                
                .title(title)
                .content(content)
                .build();
        return build;
    }

    @Builder
	public BoardDto(Long id, String title, String content) {
		this.id = id;
		this.title = title;
		this.content = content;
	}
    
}
