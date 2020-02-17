package com.star.blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.star.blog.dto.BoardDto;
import com.star.blog.service.BoardService;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Controller
public class BoardController {
	
	BoardService boardSevice;
	
	@GetMapping("/")
	public String home(Model model) {
		
		return "home";
	}
	
	@GetMapping("/write")
	public String write() {
		
		return "write";
	}
	
	
	@PostMapping("/write")
	public String writeProc(BoardDto boardDto) {
		
		boardSevice.savePost(boardDto);
		System.out.println("2222222222222222");
		return "write";
	}
}
