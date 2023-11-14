package com.project.schoolmanagment.repository.business;

import com.project.schoolmanagment.entity.concretes.businnes.Meet;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MeetingRepository extends JpaRepository<Meet,Long> {

	//check the method names and try to understand many possible solutions

	List<Meet>findByStudentList_IdEquals(Long studentId);

	//@Query("SELECT m from Meet m where m.advisoryTeacher.id in ?1")
	List<Meet> getByAdvisoryTeacher_IdEquals(Long teacherId);

	Page<Meet> getByAdvisoryTeacher_IdEquals(Long userId, Pageable pageable);

}