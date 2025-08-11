package kz.bitlab.mainService.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(
        name = "lessons",
        uniqueConstraints = {
                @UniqueConstraint(name = "uq_chapter_lesson_order", columnNames = {"chapter_id", "lesson_order"})
        },
        indexes = {
                @Index(name = "idx_lessons_chapter_id", columnList = "chapter_id")
        }
)
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Lesson {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name; // = lessonName

    @Column(name = "description", columnDefinition = "TEXT")
    private String description; // = lessonDescription

    @Column(name = "content", columnDefinition = "TEXT")
    private String content; // = lessonContent

    @Column(name = "lesson_order")
    private int order; // порядок урока внутри главы

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "chapter_id", nullable = false)
    private Chapter chapter;

    @CreationTimestamp
    @Column(name = "createTime", nullable = false, updatable = false)
    private LocalDateTime createTime;

    @UpdateTimestamp
    @Column(name = "updateTime")
    private LocalDateTime updateTime;

    @OneToMany(
            mappedBy = "lesson",
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY,
            orphanRemoval = true
    )
    @OrderBy("id ASC")
    private List<Attachment> attachments;


}
