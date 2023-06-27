package com.example.demo.serive;

import com.example.demo.model.CourseModel;

import java.util.List;

// bussines layer for writing all methods
public interface CloudCourseService {

    public String createCourse(CourseModel courseModel);

    public String updateCourse(CourseModel courseModel);

    public String deleteCourse(String courseID);

    public CourseModel getCourse(String courseID);

    public List<CourseModel> getAllCourse();

}
