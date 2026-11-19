package kh.edu.istad.ass_jpa.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "instructor_profiles")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class InstructorProfile {

    @Id
    @Column(nullable = false)
    private String userId;

    private String biography;
    private String facebookLink;
    private String githubLink;
    private String jobTitle;
    private String phoneNumber;

    @OneToMany(mappedBy = "instructor")
    private List<Course> courses;

}