package com.star.blog.repository;

import java.util.stream.Stream;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.star.blog.domain.entity.Board;

@Repository
public interface BoardRepository extends JpaRepository<Board, Long> {

	// 제공하지 않는 쿼리 사용법
	@Query("SELECT b FROM Board b ORDER BY b.id DESC")
	Stream<Board> findAllDesc();
	
	
}
