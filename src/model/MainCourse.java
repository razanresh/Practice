package model;

import model.CourseFormat;
import model.Course;
public class MainCourse {
    public static void main(String[] args) {

        Course course = new Course();
        course.setName("Java");
        course.setPrice(15000);

        CourseFormat bootcamp = new CourseFormat();
        bootcamp.setFormat("Bootcamp ");
        bootcamp.setId(1);
        bootcamp.setDurationInWeek(5);
        bootcamp.setOnline(true);
        bootcamp.setLessonCountPerWeek(5);
        bootcamp.setLessonDuration(3);
        course.setCourseFormat(bootcamp);
        System.out.println(course.toString());
    }
}
