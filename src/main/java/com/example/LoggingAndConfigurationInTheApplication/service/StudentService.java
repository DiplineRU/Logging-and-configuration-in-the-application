package com.example.LoggingAndConfigurationInTheApplication.service;

import com.example.LoggingAndConfigurationInTheApplication.model.Student;
import com.example.LoggingAndConfigurationInTheApplication.repository.StudentByCategory;
import com.example.LoggingAndConfigurationInTheApplication.repository.StudentRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;

@Service
@Profile("production")
public class StudentService {

    Logger logger = LoggerFactory.getLogger(StudentService.class);
    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public Student createStudent(Student student) {
        logger.info("Was invoked method for create student");
        return studentRepository.save(student);
    }

    public Student findStudent(long id) {
        logger.info("Was invoked method for find student");
        return studentRepository.findById(id).get();
    }

    public Student editStudent(Student student) {
        logger.info("Was invoked method for edit student");
        return studentRepository.save(student);
    }

    public void deleteStudent(long id) {
        logger.info("Was invoked method for delete student");
        studentRepository.deleteById(id);
    }


    public Collection<Student> getAllStudent() {
        logger.info("Was invoked method for get all student");
        return studentRepository.findAll();
    }


    public Student findByName(String name) {
        logger.info("Was invoked method for find by name");
        return studentRepository.findByNameIgnoreCase(name);
    }

    public Collection<Student> findStudentByName(String name) {
        logger.info("Was invoked method for find by name");

        return studentRepository.findStudentByNameContainsIgnoreCase(name);
    }

    public Collection<Student> findAllByNameContains(String namePart) {
        logger.info("Was invoked method for find by name");

        return studentRepository.findAllByNameContainsIgnoreCase(namePart);
    }

    public Collection<Student> findByAgeBetween(int minAge, int maxAge) {
        logger.info("Was invoked method for find by name");

        return studentRepository.findByAgeBetween(minAge, maxAge);
    }

    public List<StudentByCategory> getStudentsCount() {
        logger.info("Was invoked method for find by name");

        return studentRepository.getStudentsCount();
    }

    public double avgAgeByStudents() {
        logger.info("Was invoked method for find by name");

        return studentRepository.avgAgeByStudents();
    }

    public List<StudentByCategory> getLastFiveStudent() {
        logger.info("Was invoked method for find by name");

        return studentRepository.getLastFiveStudent();
    }
}

