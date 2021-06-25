package com.example.demo.app.index.Repository;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.app.index.Question;

@Repository
public interface QuestionRepository extends JpaRepository<Question, Integer>,JpaSpecificationExecutor<Question> {
	
	@Query("select p from Question p where p.id like %:id% order by p.id asc")
	public List<Question> findId(@Param("id")String id);
	
	@Query("select p from Question p where p.type like %:type% order by p.id asc")
	public List<Question> findType(@Param("type")String type);

	@Query("select p from Question p where p.type like %:type% order by p.id asc")
	public List<Question> findType(@Param("type")String type, Pageable pageble);
}
