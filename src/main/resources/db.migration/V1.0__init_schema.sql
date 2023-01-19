--This script includes additional columns to store properties specific to the three activities you specified: "CREATE_LEARNING_PLAN", "ADD_COURSE_TO_LEARNING_PLAN", and "COURSE_LEARNING_PROGRESS".
--
--For "CREATE_LEARNING_PLAN" activity, it added columns for "plan_name", "plan_description", "plan_learning_hours", and "plan_content_type".
--
--For "ADD_COURSE_TO_LEARNING_PLAN" activity, it added columns for "course_id", "course_name", "course_description", "course_mentor" and "course_duration"
--
--For "COURSE_LEARNING_PROGRESS" activity, it added columns for "course_id", "course_name" and "learning_time"
--
--Note that, I have made activity_duration and activity_notes are not mandatory fields, as they might not be used for all activities.

CREATE TABLE learning_activity_history (
    id SERIAL PRIMARY KEY,
    activity_name VARCHAR(255) NOT NULL,
    activity_type VARCHAR(255) NOT NULL,
    activity_date TIMESTAMP NOT NULL,
    activity_duration INTEGER,
    activity_notes TEXT,
    student_id INTEGER NOT NULL,
    plan_name VARCHAR(255),
    plan_description TEXT,
    plan_learning_hours INTEGER,
    plan_content_type VARCHAR(255),
    course_id INTEGER,
    course_name VARCHAR(255),
    course_description TEXT,
    course_mentor VARCHAR(255),
    course_duration INTEGER,
    course_learning_hours INTEGER
);
