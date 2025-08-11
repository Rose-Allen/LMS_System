package kz.bitlab.mainService.services;
import kz.bitlab.mainService.dto.ChapterDto;

import java.util.List;


public interface ChapterService {


    List<ChapterDto> getAllChapters();


    List<ChapterDto> getAllChaptersByCourseId(Long courseId);


    ChapterDto getChapterById(Long id);


    ChapterDto createChapter(ChapterDto chapterDto) ;


    ChapterDto updateChapter(ChapterDto chapterDto) ;


    void deleteChapterById(Long id) ;





}