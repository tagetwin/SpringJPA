package com.star.blog.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.star.blog.domain.dto.ReqSaveDto;
import com.star.blog.domain.dto.ResDetailDto;
import com.star.blog.domain.dto.ResListDto;
import com.star.blog.service.BoardService;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Controller
public class BoardController {
	
	private BoardService boardService;
	
	@GetMapping("/")
	public String home(Model model) {
		
		List<ResListDto> board = boardService.findAllDesc();
		model.addAttribute("board", board);
		
		return "home"; 
	}
	
	@GetMapping("/write") 
	public String write() {
		
		return "write";
	}
	
	
	@PostMapping("/write")
	public String writeProc(ReqSaveDto dto) {
		
		boardService.save(dto);
		
		return "redirect:/";
	}
	
	@GetMapping("/delete/{id}")
	public String del(@PathVariable long id) {
		
		boardService.delBoard(id);
		
		return "redirect:/";
	}
	
	@GetMapping("/update/{id}") 
	public String update(@PathVariable long id, Model model) {
		
		ResDetailDto dto = boardService.findById(id);
		model.addAttribute("board", dto);
		
		return "update";
	}
	
	@PutMapping("/update")
	public @ResponseBody String update(@RequestBody ReqSaveDto dto) {
		
		ResDetailDto board= boardService.findById(dto.getId());
		board.setTitle(dto.getTitle());
		board.setContent(dto.getContent());
//		boardService.update(board);
		boardService.save(dto);
		return "ok";
	}
	
}


