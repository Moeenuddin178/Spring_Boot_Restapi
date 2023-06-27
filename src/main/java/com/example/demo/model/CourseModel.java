package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "course_info")
public class CourseModel {
    @Id
    private String id;
    private String name;
    private String author;
    private String coursePrice;


    public CourseModel(String id, String name, String author, String coursePrice) {
        super();
        this.id = id;
        this.name = name;
        this.author = author;
        this.coursePrice = coursePrice;
    }

    public CourseModel() {
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getCoursePrice() {
        return coursePrice;
    }

    public void setCoursePrice(String coursePrice) {
        this.coursePrice = coursePrice;
    }
}