package kh.edu.istad.ass_jpa.model;


import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "student_profiles")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class StudentProfile {

    @Id
    @Column(nullable = false)
    private String userId;

    private String biography;
    private String facebookLink;
    private String githubLink;
    private String major;
    private String phoneNumber;
    private String university;

    @OneToMany(mappedBy = "student")
    private List<Enrollment> enrollments;
}
