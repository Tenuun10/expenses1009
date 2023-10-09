package com.example.peopleexpenses.controller;

import com.example.peopleexpenses.entity.People;
import com.example.peopleexpenses.model.AddNewPersonRequest;
import com.example.peopleexpenses.model.UpdatePeople;
import com.example.peopleexpenses.repository.PeopleRepository;
import com.example.peopleexpenses.service.PeopleService;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/people")
public class PeopleController {
    private final PeopleService peopleService;

    public PeopleController(PeopleService peopleService) {
        this.peopleService = peopleService;
    }

    @PostMapping("/new")
    public People newPerson(@RequestBody AddNewPersonRequest body){
        return peopleService.createNewPerson(body);
    }

    @PostMapping("/update")
    public People updatePerson(@PathVariable int id,@RequestBody UpdatePeople body){
        return peopleService.updatePerson(id,body);
    }

    @GetMapping("/listpeople")
    public String showGuest(Model model) {
        List<People> people = peopleService;
        model.addAttribute("people", people);
        return "guest";
    }
}
