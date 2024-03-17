package com.example.demo;

import java.util.Optional;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonalInfoController {
	private final PersonalInfoRepository personalInfoRepository;
	
	public PersonalInfoController(PersonalInfoRepository personalInfoRepository) {
		 this.personalInfoRepository = personalInfoRepository;
	}
	
	@RequestMapping(value = "/workers", method = RequestMethod.GET)
	public Iterable<PersonalInfo> findAllWorkers() {
		return this.personalInfoRepository.findAll();
	}
	
	@RequestMapping(value = "/workers/{id}", method = RequestMethod.GET)
	public Optional<PersonalInfo> findWorkerById(@PathVariable Integer id) {
		return this.personalInfoRepository.findById(id);
	}
	
	@PostMapping("/worker")
	public PersonalInfo addWoker(@RequestBody PersonalInfo personalInfo) {
		return this.personalInfoRepository.save(personalInfo);
	}
}
