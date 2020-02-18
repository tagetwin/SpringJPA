package com.star.blog.domain.dto;

import com.star.blog.domain.entity.Board;

import lombok.Getter;

@Getter
public class ResDetailDto {

	private long id;
	private String title;
	private String content;
	
	public ResDetailDto(Board entity) {
		id = entity.getId();
		title = entity.getTitle();
		content = entity.getContent();
	}
}
