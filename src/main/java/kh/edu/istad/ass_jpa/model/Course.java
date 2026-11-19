package kh.edu.istad.ass_jpa.model;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "courses")
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Integer countRating;

    private LocalDateTime createdAt;

    @Column(length = 255)
    private String description;

    private Float discountPercent;

    private Boolean isDeleted;

    private Boolean isPublished;

    @Column(length = 255)
    private String keyword;

    @Column(length = 255)
    private String level;

    @Column(precision = 8, scale = 2)
    private BigDecimal price;

    @Column(length = 255)
    private String slug;

    private Float starRating;

    @Column(length = 255)
    private String thumbnail;

    @Column(length = 255)
    private String title;

    private Float totalHours;

    private LocalDateTime updatedAt;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;

    @ManyToOne
    @JoinColumn(name = "instructor_id")
    private InstructorProfile instructor;

    @OneToMany(mappedBy = "course")
    private List<Video> videos;

    @OneToMany(mappedBy = "course")
    private List<Enrollment> enrollments;
}
