package com.learning.data.repository;


import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.learning.data.model.Scheduler;
@Repository
public interface SchedulerRepository extends JpaRepository<Scheduler, Long> {

	public List<Scheduler> findByScheduleType(String scheduleType);
	
	@Query(value="select * from scheduler_info s "
			+ "where s.schedule_type=?1 and s.id=?2",nativeQuery=true )

	public Scheduler findByScheduleType(String scheduleType,Long id);
}
