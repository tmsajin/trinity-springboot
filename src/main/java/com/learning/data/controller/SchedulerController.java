package com.learning.data.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.learning.data.model.Scheduler;
import com.learning.data.repository.SchedulerRepository;

@RestController
public class SchedulerController {

	@Autowired
	private SchedulerRepository schedulerRepo;
	
	@GetMapping(value="/test")
	public String printTest()
	{
		return "test";
	}
	
	@PostMapping(value="/save")
	public ResponseEntity<?> saveSchedulerDetails(@RequestBody Scheduler scheduler )
	{
		schedulerRepo.save(scheduler);
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	@GetMapping(value="/findByType")
	public ResponseEntity<?> findByType(@RequestParam String value)
	{
		List<Scheduler> schedulers=schedulerRepo.findByScheduleType(value);
		return new ResponseEntity<>(schedulers,HttpStatus.OK);
	}
	
	@GetMapping(value="/findByQuery")
	public ResponseEntity<?> findByQuery(@RequestParam String type,@RequestParam Long id)
	{
		Scheduler schedulers=schedulerRepo.findByScheduleType(type,id);
		return new ResponseEntity<>(schedulers,HttpStatus.OK);
	}
	
	@DeleteMapping(value="/deleteById")
	public ResponseEntity<?> deleteById(@RequestParam Long id)
	{
		schedulerRepo.deleteById(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	@GetMapping(value="/findAll")
	public ResponseEntity<?> findAll()
	{
		List<Scheduler> schedulers=schedulerRepo.findAll();
		return new ResponseEntity<>(schedulers,HttpStatus.OK);
	}
	
	
}
