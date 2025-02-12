package org.example.module3_ecosystem.c02_enum_optional;

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


