package kz.bitlab.mainService.repository;

import kz.bitlab.mainService.entity.Chapter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ChapterRepository extends JpaRepository<Chapter, Long> {
    List<Chapter> findChaptersByCourseId(Long id);
}
