package com.sample.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;

@RestController
public class PersonController {
  @Autowired
  private PersonRepository personRepository;

  @PostMapping(path="/add") // Map ONLY POST Requests
  public ResponseEntity addNewPerson (@RequestParam String usualLastName, @RequestParam String birthLastName, @RequestParam String firstName) {
    // @ResponseBody means the returned String is the response, not a view name
    // @RequestParam means it is a parameter from the GET or POST request

    Person p = new Person();
    p.setUsualLastName(usualLastName);
    p.setBirthLastName(birthLastName);
    p.setFirstName(firstName);
    personRepository.save(p);
    return new ResponseEntity("saved", HttpStatus.OK);
  }

  @GetMapping(path="/all")
  public @ResponseBody Iterable<Person> getAllPerson() {
    // This returns a JSON or XML with the users
    return personRepository.findAll();
  }
}