package com.example.demo.controller;

import com.example.demo.model.CourseModel;
import com.example.demo.serive.CloudCourseService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/courses")
public class CourseController {


    CloudCourseService cloudCourseService;

    public CourseController(CloudCourseService cloudCourseService) {
        this.cloudCourseService = cloudCourseService;
    }

    @GetMapping("{id}")
    public CourseModel getCourse(@PathVariable("id") String id) {
        return cloudCourseService.getCourse(id);
    }

    @GetMapping()
    public List<CourseModel> getAllCourse() {
        return cloudCourseService.getAllCourse();
    }

    @PostMapping()
    public String insertCourse(@RequestBody CourseModel courseModel) {
        return cloudCourseService.createCourse(courseModel);

    }

    @DeleteMapping("{id}")
    public String deleteCourse(@PathVariable("id") String id) {
        cloudCourseService.deleteCourse(id);
        return "Cloud Vendor Deleted Successfully";
    }

    @PutMapping()
    public String updateCourse(@RequestBody CourseModel courseModel) {

         cloudCourseService.updateCourse(courseModel);
        return "Cloud Vendor Update Successfully";
    }


}
