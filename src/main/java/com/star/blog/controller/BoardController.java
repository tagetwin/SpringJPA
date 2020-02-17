package com.star.blog.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.star.blog.domain.dto.ReqSaveDto;
import com.star.blog.domain.entity.BoardEntity;
import com.star.blog.repository.BoardRepository;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Controller
public class BoardController {
	
	BoardRepository boardRepository;
	
	@GetMapping("/")
	public String home(Model model) {
		
		List<BoardEntity> board = boardRepository.findAll();
		model.addAttribute("board", board);
		
		return "home";
	}
	
	@GetMapping("/write")
	public String write() {
		
		return "write";
	}
	
	
	@PostMapping("/write")
	public String writeProc(ReqSaveDto dto) {
		
		boardRepository.save(dto.toEntity());
		
		return "redirect:/";
	}
}
