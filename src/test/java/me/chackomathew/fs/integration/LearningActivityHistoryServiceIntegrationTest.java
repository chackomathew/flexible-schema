package me.chackomathew.fs.integration;

import static org.assertj.core.api.Assertions.assertThat;

import me.chackomathew.fs.Application;
import me.chackomathew.fs.service.LearningActivityHistoryService;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.testcontainers.containers.PostgreSQLContainer;
import org.testcontainers.junit.jupiter.Container;
import org.testcontainers.junit.jupiter.Testcontainers;

@ExtendWith(SpringExtension.class)
@SpringBootTest(classes = Application.class)
@ActiveProfiles("integration-tests")
@Tag("integration-test")
@Testcontainers
@AutoConfigureTestDatabase(replace = Replace.NONE)
public class LearningActivityHistoryServiceIntegrationTest {

    @Container
    private static final PostgreSQLContainer POSTGRES_SQL_CONTAINER = new PostgreSQLContainer("postgres:latest")
            .withDatabaseName("postgres")
            .withUsername("postgres")
            .withPassword("password");

    @BeforeAll
    static void startContainer() {
        POSTGRES_SQL_CONTAINER.start();
    }

    @AfterAll
    static void stopContainer() {
        POSTGRES_SQL_CONTAINER.stop();
    }

    @Autowired
    private LearningActivityHistoryService learningActivityHistoryService;

    @Test
    public void findTotalLearningHoursByStudentTest() {
        int studentId = 1;
        int expectedTotalHours = 10;

        int totalHours = learningActivityHistoryService.findTotalLearningHoursByStudent(studentId);

        assertThat(totalHours).isEqualTo(expectedTotalHours);
    }
}