package be.abis.exercise;

import be.abis.exercise.model.Course;
import be.abis.exercise.service.CourseService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.hamcrest.Matchers.greaterThan;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestCourseService {
	
	@Autowired
	@Qualifier("abisCourseService")
	CourseService courseService;
	
	@Test
	public void course7900isWorkshopSQL() {
		Course c = courseService.findCourse(7900);
		assertEquals("WORKSHOP SQL",c.getShortTitle().toUpperCase());
	}
	
	@Test
	public void course7900costsMoreThan400() {
		Course c = courseService.findCourse(7900);
		assertThat(c.getPricePerDay(),greaterThan(400.0));
	}
	
	

}
