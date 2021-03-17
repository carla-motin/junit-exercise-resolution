package com.training.main;

import com.training.model.Person;

public class PersonController {

    public Person addPerson(Person person) {
        Person newPerson = new Person();

        if(person.getName() != null) {
            newPerson.setId(person.getId());
            newPerson.setName(person.getName());
            newPerson.setAge(person.getAge());

            System.out.println("New Person Added!");
            return newPerson;
        }

        return null;
    }
}
