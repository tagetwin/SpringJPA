package com.star.blog.domain.dto;

import com.star.blog.domain.entity.Board;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ReqUpdateDto {

	private long id;
	private String title;
	private String content;

	public Board toEntity() {
		return Board.builder()
				.title(title)
				.content(content)
				.build();
	}

	 @Builder
		public ReqUpdateDto(String title, String content) {
			this.title = title;
			this.content = content;
		}
}
