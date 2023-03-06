package AdminInterface;

import dao.*;
import dao.impl.MentorDaoImpl;
import dao.impl.StudentDaoImpl;
import dao.impl.ManagerDaoImpl;
import enums.CommandForDao;
import enums.CommandForEntity;
import exceptions.WrongCommandException;
import model.*;


import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

import static enums.CommandForDao.*;
import static enums.CommandForEntity.*;

public class MainAdmin {
    public static void main(String[] args) throws IOException {

        Example example = new Example();

        Scanner sc = new Scanner(System.in);
        StudentDao studentDao = new StudentDaoImpl();
        ManagerDao managerDao = new ManagerDaoImpl();
        MentorDao mentorDao = new MentorDaoImpl();

        loop:
        while (true) {
            example.crudCommand();
            CommandForDao command = null;

            try {
                command = CommandForDao.valueOf(sc.nextLine());
            } catch (Exception e) {
                throw new WrongCommandException("WRONG COMMAND");
            }
            if (command != null) {
                switch (command) {
                    case CLOSE:
                        example.closeProg();
                        break loop;
                    case SAVE:
                        example.saveEntity();
                        CommandForEntity command1 = CommandForEntity.valueOf(sc.nextLine());
                        switch (command1) {
                            case STUDENT:
                                studentDao.save(example.saveScannerStudent());
                                break loop;
                            case MENTOR:
                                mentorDao.save(example.saveScannerMentor());
                                break loop;
                            case MANAGER:
                                managerDao.save(example.saveScannerManager());
                                break loop;
                            case CLOSE:
                                example.closeProg();
                                break;
                        }
                    case FINDALL:
                        example.findAllEntity();
                        CommandForEntity command2 = CommandForEntity.valueOf(sc.nextLine());
                        switch (command2) {
                            case STUDENT:
                                System.out.println(Arrays.toString(studentDao.findAll()));
                                break loop;
                            case MANAGER:
                                managerDao.findAll();
                                break loop;
                            case MENTOR:
                                System.out.println(Arrays.toString(mentorDao.findAll()));
                                break loop;
                        }
                }
            }
        }
    }
}