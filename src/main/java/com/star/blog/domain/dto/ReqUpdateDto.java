package com.star.blog.domain.dto;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ReqUpdateDto {

	private Long id;
	private String title;
	private String content;

	public ReqUpdateDto toEntity() {
		return ReqUpdateDto.builder().title(title).content(content).build();
	}

	@Builder
	public ReqUpdateDto(String title, String content) {
		this.title = title;
		this.content = content;
	}
}
