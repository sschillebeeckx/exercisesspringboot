package be.abis.exercise;

import be.abis.exercise.model.Course;
import be.abis.exercise.model.Person;
import be.abis.exercise.service.AbisTrainingService;
import be.abis.exercise.service.TrainingService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.hamcrest.Matchers.greaterThan;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestTrainingService {
	
	@Autowired
	TrainingService trainingService;


	@Test
	public void testWelcomeMessage(){
		assertEquals("Welcome to the Abis Training Service",trainingService.getWelcomeMessage());
	}
	@Test
	public void course7900isWorkshopSQL() {
		Course c = trainingService.getCourseService().findCourse(7900);
		assertEquals("WORKSHOP SQL",c.getShortTitle().toUpperCase());
	}

	@Test
	public void testPersonViaEmailPassword(){
		Person p = trainingService.getPersonService().findPerson("mjones@abis.be","abc123");
		assertEquals("Mary",p.getFirstName());
	}
	

	
	

}
