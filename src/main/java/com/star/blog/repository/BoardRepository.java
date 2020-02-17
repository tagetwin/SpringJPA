package com.star.blog.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.star.blog.domain.entity.BoardEntity;

public interface BoardRepository extends JpaRepository<BoardEntity, Long> {

}
