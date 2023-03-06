package dao;

import model.Mentor;

import java.io.IOException;

public interface MentorDao {
    void save(Mentor mentor) throws IOException;
    Mentor[] findAll() throws IOException;
}