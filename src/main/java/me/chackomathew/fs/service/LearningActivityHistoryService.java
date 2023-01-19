package me.chackomathew.fs.service;


import me.chackomathew.fs.repository.LearningActivityHistoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LearningActivityHistoryService {

    private final LearningActivityHistoryRepository learningActivityHistoryRepository;

    @Autowired
    public LearningActivityHistoryService(LearningActivityHistoryRepository learningActivityHistoryRepository) {
        this.learningActivityHistoryRepository = learningActivityHistoryRepository;
    }

    public int findTotalLearningHoursByStudent(Integer studentId) {
        return learningActivityHistoryRepository.findTotalLearningHoursByStudent(studentId);
    }
}


