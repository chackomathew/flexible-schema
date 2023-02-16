package me.chackomathew.fs.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Entity
@Table(name = "learning_activity_history")
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class LearningActivityHistoryJson {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "activity_name", nullable = false)
    private String activityName;

    @Column(name = "activity_type", nullable = false)
    private String activityType;

    @Column(name = "activity_date", nullable = false)
    private Date activityDate;

    @Column(name = "activity_duration")
    private Integer activityDuration;

    @Column(name = "activity_notes")
    private String activityNotes;

    @Column(name = "student_id", nullable = false)
    private Integer studentId;

    @Column(name = "plan_name")
    private String planName;

    @Column(name = "plan_description")
    private String planDescription;

    @Column(name = "plan_learning_hours")
    private Integer planLearningHours;

    @Column(name = "plan_content_type")
    private String planContentType;

    @Column(name = "course_id")
    private Integer courseId;

    @Column(name = "course_name")
    private String courseName;

    @Column(name = "course_description")
    private String courseDescription;

    @Column(name = "course_mentor")
    private String courseMentor;

    @Column(name = "course_duration")
    private Integer courseDuration;

    @Column(name = "course_learning_hours")
    private Integer courseLearningHours;

}
