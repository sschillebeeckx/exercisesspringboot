package be.abis.exercise;

import be.abis.exercise.model.Address;
import be.abis.exercise.model.Company;
import be.abis.exercise.model.Person;
import be.abis.exercise.service.PersonService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.IOException;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
@ActiveProfiles("dev")
public class TestSomePersonService {
	
	@Autowired
	PersonService personService;

	@Test
	public void person4ShouldBeCalledSandy(){
		String firstName = personService.findPerson(4).getFirstName();
		assertEquals("Sandy",firstName);
	}



}
