package com.api.api.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.api.api.model.Note;

@Repository
public interface NoteRepository extends JpaRepository<Note, Long>{
	
	@Query("SELECT n FROM Note n WHERE LOWER (n.status) = lower(:status)")
	public List<Note> findByParam(@Param("status") char status);
}
