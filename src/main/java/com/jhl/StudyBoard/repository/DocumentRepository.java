package com.jhl.StudyBoard.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jhl.StudyBoard.entity.Document;

@Repository
public interface DocumentRepository extends JpaRepository<Document, Long> {
	
}
