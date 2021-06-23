package com.example.demo.app.index.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.app.index.Problem;

@Repository
public interface ProblemRepository extends JpaRepository<Problem, Integer>,JpaSpecificationExecutor<Problem> {
	
	@Query("select a from Problem a where a.id like %:id% order by a.id asc")
	public List<Problem> findId(@Param("id")String id);
	
	@Query("select a from Problem a where a.type like %:type% order by a.id asc")
	public List<Problem> findType(@Param("type")String type);
}
