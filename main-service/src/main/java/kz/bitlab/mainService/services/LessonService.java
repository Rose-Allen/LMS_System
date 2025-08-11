package kz.bitlab.mainService.services;


import kz.bitlab.mainService.dto.LessonDto;

import java.util.List;
public interface LessonService {


    List<LessonDto> getAllLessons();


    List<LessonDto> getAllLessonsByChapterId(Long chapterId);


    LessonDto getLessonById(Long id);


    LessonDto createLesson(LessonDto lessonDto);


    LessonDto updateLesson(LessonDto lessonDto);


    void deleteLessonById(Long id);

}
