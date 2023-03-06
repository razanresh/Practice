package service;

import model.CourseFormat;

public interface CommandService {
    void run();
    CourseFormat[] findAll();
}
