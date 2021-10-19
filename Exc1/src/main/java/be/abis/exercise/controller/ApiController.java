package be.abis.exercise.controller;

import be.abis.exercise.model.Course;
import be.abis.exercise.model.Person;
import be.abis.exercise.service.TrainingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {


    @Autowired
    TrainingService trainingService;

    @GetMapping("/courses/{id}")
    public Course printCourse(@PathVariable("id") int myId){
        Course c = trainingService.getCourseService().findCourse(myId);
        return c;
    }

}
