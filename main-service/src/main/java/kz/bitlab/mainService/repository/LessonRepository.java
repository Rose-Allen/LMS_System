package kz.bitlab.mainService.repository;


import kz.bitlab.mainService.entity.Lesson;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LessonRepository extends JpaRepository<Lesson, Long> {
    List<Lesson> findAllLessonsByChapterId(Long chapterId);
}
