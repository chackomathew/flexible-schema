CREATE TABLE learning_activity_history_json (
    id SERIAL PRIMARY KEY,
    activity_name VARCHAR(255) NOT NULL,
    activity_type VARCHAR(255) NOT NULL,
    activity_date TIMESTAMP NOT NULL,
    activity_duration INTEGER,
    activity_notes TEXT,
    student_id INTEGER NOT NULL,
    /*plan_name VARCHAR(255),
    plan_description TEXT,
    plan_learning_hours INTEGER,
    plan_content_type VARCHAR(255),
    course_id INTEGER,
    course_name VARCHAR(255),
    course_description TEXT,
    course_mentor VARCHAR(255),
    course_duration INTEGER,
    course_learning_hours INTEGER*/
    activity_properties jsonb NOT NULL
);
