package com.nttdata.bootcamp.microserviceWebFlux.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.nttdata.bootcamp.microserviceWebFlux.modelo.Person;
import com.nttdata.bootcamp.microserviceWebFlux.service.PersonService;

import reactor.core.publisher.Flux;

@Controller
public class NewController {
	
	@Autowired
	PersonService personService;
	
	@GetMapping(path="/person-list")
	public String personList(final Model model) {
		final Flux<Person> personList=personService.allPersons();
		model.addAttribute("personlist",personList);
		return "personList";
	}
	

}
