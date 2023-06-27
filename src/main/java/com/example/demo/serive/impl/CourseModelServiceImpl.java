package com.example.demo.serive.impl;

import com.example.demo.model.CourseModel;
import com.example.demo.repository.CourseRepository;
import com.example.demo.serive.CloudCourseService;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseModelServiceImpl implements CloudCourseService {

    CourseRepository courseRepository;

    public CourseModelServiceImpl(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;

    }

    @Override
    public String createCourse(CourseModel courseModel) {

        courseRepository.save(courseModel);
        return "Success";

    }

    @Override
    public String updateCourse(CourseModel courseModel) {

        courseRepository.save(courseModel);
        return "Success";

    }

    @Override
    public String deleteCourse(String courseID) {
        courseRepository.deleteById(courseID);
        return "Success";
    }

    @Override
    public CourseModel getCourse(String courseID) {

        return courseRepository.findById(courseID).get();

    }

    @Override
    public List<CourseModel> getAllCourse() {
        return courseRepository.findAll();
    }
}
