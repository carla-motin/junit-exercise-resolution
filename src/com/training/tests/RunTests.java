package com.training.tests;

import com.training.main.Example;
import com.training.main.PersonController;
import com.training.model.Person;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        Example.class,
        PersonController.class
})
public class RunTests {

}
