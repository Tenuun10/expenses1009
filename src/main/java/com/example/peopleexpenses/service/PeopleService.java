package com.example.peopleexpenses.service;

import com.example.peopleexpenses.entity.People;
import com.example.peopleexpenses.model.AddNewPersonRequest;
import com.example.peopleexpenses.model.UpdatePeople;
import com.example.peopleexpenses.repository.PeopleRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PeopleService {
    private final PeopleRepository peopleRepository;


    public PeopleService(PeopleRepository peopleRepository) {
        this.peopleRepository = peopleRepository;
    }

    public People createNewPerson(AddNewPersonRequest addNewPersonRequest){
        People people = new People();


        people.setId(addNewPersonRequest.getId());
        people.setName(addNewPersonRequest.getName());
        people.setBirthDate(addNewPersonRequest.getBirthDate());
        people.setBirthPlace(addNewPersonRequest.getBirthPlace());
        people.setEmail(addNewPersonRequest.getEmail());

        return this.peopleRepository.save(people);
    }

    public People updatePerson(Integer id, UpdatePeople updatePeople){
        People people = peopleRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Nincs ilyen halo!"));

        people.setName(updatePeople.getEmail());
        people.setBirthPlace(updatePeople.getBirthPlace());
        people.setBirthDate(updatePeople.getBirthDate());
        people.setEmail(updatePeople.getEmail());

        return peopleRepository.save(people);
    }



}
