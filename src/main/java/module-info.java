module Gunn {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.media;
    opens gunn.student_grades_project to javafx.fxml;
    exports gunn.student_grades_project;
}