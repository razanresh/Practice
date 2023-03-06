package dao;

import model.Student;

import java.io.IOException;

public interface StudentDao {
    void save(Student student) throws IOException;
    Student[] findAll() throws IOException;
    Student[] deleteAll() throws IOException;
}