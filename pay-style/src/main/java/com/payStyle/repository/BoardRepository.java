package com.payStyle.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.payStyle.model.Board;

public interface BoardRepository extends JpaRepository<Board, Integer> {

}
