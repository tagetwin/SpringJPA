package com.star.blog.domain.dto;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Optional;

import com.star.blog.domain.entity.Board;

import lombok.Getter;

@Getter
public class ResListDto {

	private long id;
	private String title;
	private String content;
	private String modifiedDate;
	
	public ResListDto(Board entity) {
		id = entity.getId();
		title = entity.getTitle();
		content = entity.getContent();
		modifiedDate = toStringDateTime(entity.getModifiedDate());
	}
	
	private String toStringDateTime(LocalDateTime localDateTime) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		return Optional.ofNullable(localDateTime)
				.map(formatter::format)
				.orElse("");
	}
	
}
