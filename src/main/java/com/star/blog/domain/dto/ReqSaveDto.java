package com.star.blog.domain.dto;

import com.star.blog.domain.entity.BoardEntity;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ReqSaveDto {
	
	private Long id;
    private String title;
    private String content;
	
    public BoardEntity toEntity(){
        return BoardEntity.builder()
                .title(title)
                .content(content)
                .build();
    }

    @Builder
	public ReqSaveDto(String title, String content) {
		this.title = title;
		this.content = content;
	}
    
}
