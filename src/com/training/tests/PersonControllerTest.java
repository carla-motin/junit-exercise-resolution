package com.training.tests;

import com.training.main.PersonController;
import com.training.model.Person;
import org.junit.Assert;
import org.junit.Test;

public class PersonControllerTest {

    PersonController pc = new PersonController();

    @Test
    public void testAddPerson() {
        Person p = new Person();
        p.setName("Test");
        p.setAge(19);
        Assert.assertNotNull(pc.addPerson(p));
    }
}
