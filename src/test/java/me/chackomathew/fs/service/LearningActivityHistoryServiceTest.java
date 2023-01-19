package me.chackomathew.fs.service;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

import me.chackomathew.fs.repository.LearningActivityHistoryRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class LearningActivityHistoryServiceTest {

    @Mock
    private LearningActivityHistoryRepository learningActivityHistoryRepository;

    @InjectMocks
    private LearningActivityHistoryService learningActivityHistoryService;

    @Test
    public void findTotalLearningHoursByStudentTest() {
        int studentId = 1;
        int expectedTotalHours = 120;
        when(learningActivityHistoryRepository.findTotalLearningHoursByStudent(studentId)).thenReturn(expectedTotalHours);

        int totalHours = learningActivityHistoryService.findTotalLearningHoursByStudent(studentId);

        assertThat(totalHours).isEqualTo(expectedTotalHours);
    }

}
