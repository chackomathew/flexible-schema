package me.chackomathew.fs.repository;

import me.chackomathew.fs.domain.LearningActivityHistory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface LearningActivityHistoryRepository extends JpaRepository<LearningActivityHistory, Long> {

    @Query(value = "SELECT SUM(course_learning_hours) FROM learning_activity_history WHERE student_id = ?1", nativeQuery = true)
    int findTotalLearningHoursByStudent(Integer studentId);
}
