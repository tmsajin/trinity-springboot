package com.learning.data.repository;


import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.learning.data.model.Students;
@Repository
public interface StudentsRepository extends JpaRepository<Students, Long> {

	public List<Students> findByS0studentName(String S0studentName);
	
	@Query(value="select * from Students s "
			+ "where s.s1mark1+s.s2mark2>=?1 and s.s1mark1+s.s2mark2<?2",nativeQuery=true )
	public Students findByGrade(long m1,long m2);
}
