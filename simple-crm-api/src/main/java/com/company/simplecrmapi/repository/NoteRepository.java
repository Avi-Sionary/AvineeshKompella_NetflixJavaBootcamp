package com.company.simplecrmapi.repository;

import com.company.simplecrmapi.model.Note;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// by extending JpaRepository, we can use CRUD operations w/o implementing them ourselves
@Repository
public interface NoteRepository extends JpaRepository<Note, Integer> {

}