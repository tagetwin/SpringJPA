package com.star.blog.service;

import java.util.List;
import java.util.stream.Collectors;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.star.blog.domain.dto.ReqSaveDto;
import com.star.blog.domain.dto.ReqUpdateDto;
import com.star.blog.domain.dto.ResDetailDto;
import com.star.blog.domain.dto.ResListDto;
import com.star.blog.repository.BoardRepository;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class BoardService {

	BoardRepository boardRepository;
	
	@Transactional
	public Long save(ReqSaveDto dto) {
		return boardRepository.save(dto.toEntity()).getId();
	}
	
//	@Transactional
//	public List<BoardEntity> findAll() {
//		List<BoardEntity> boards = boardRepository.findAll();
//		return boards;
//	}
	
	
	 //람다식
	@Transactional
	public List<ResListDto> findAllDesc(){
		return boardRepository.findAllDesc()
				.map(ResListDto :: new)
				.collect(Collectors.toList());
		
	}
	
	@Transactional
	public void delBoard(long id) {
		boardRepository.deleteById(id);
	}
	
	@Transactional
	public ResDetailDto findById(long id) {
		return boardRepository.findById(id).map(ResDetailDto :: new).get();
		
	}
	
	@Transactional
	public Long update(ReqUpdateDto dto) {
		return boardRepository.save(dto.toEntity()).getId();
	}
	
}
