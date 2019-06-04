package com.jhl.StudyBoard.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jhl.StudyBoard.entity.Photo;

@Repository
public interface PhotoRepository extends JpaRepository<Photo, Long> {
	
}
