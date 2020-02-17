package com.star.blog.service;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.star.blog.dto.BoardDto;
import com.star.blog.repository.BoardRepository;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class BoardService {

	private BoardRepository boardRepository;
	
	@Transactional
	public Long savePost(BoardDto boardDto) {
		return boardRepository.save(boardDto.toEntity()).getId();
	}
	
}
