package org.example.module3.c02_enum_optional;

import org.example.module2_object_orientation.c09_recap_project.Order;

import java.util.*;

public class PersonRepository {
    private List<Person> personRepoList;

    public PersonRepository() {
        this.personRepoList = new ArrayList<>();
    }

    public Optional<Person> getPersonById(String id){
        for (Person person : personRepoList) {
            if (person.id().equals(id)) {
                return Optional.of(person);
            }
        }
        return Optional.empty();
    }

    public void add(Person newPerson) {
        personRepoList.add(newPerson);
    }
}


