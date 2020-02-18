package com.star.blog.domain.dto;

import com.star.blog.domain.entity.Board;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ResDetailDto {

	private Long id;
	private String title;
	private String content;
	
	public ResDetailDto(Board entity) {
		id = entity.getId();
		title = entity.getTitle();
		content = entity.getContent();
	}
}
