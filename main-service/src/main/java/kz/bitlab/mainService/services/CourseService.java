package kz.bitlab.mainService.services;

import kz.bitlab.mainService.dto.CourseDto;

import java.util.List;


public interface CourseService {



    List<CourseDto> getAllCourses ();


    CourseDto getCourseById(Long id);


    CourseDto createCourse(CourseDto courseDto);


    CourseDto updateCourse(CourseDto courseDto);


    void deleteCourseById(Long id);


}