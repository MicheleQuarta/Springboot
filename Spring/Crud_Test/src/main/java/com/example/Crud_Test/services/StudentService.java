package com.example.Crud_Test.services;

import com.example.Crud_Test.entities.Student;
import com.example.Crud_Test.repositories.StudentRepo;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    @Autowired
    private StudentRepo studentRepository;

    public Student createStudent(Student student) {
        return studentRepository.save(student);
    }

    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    public Optional<Student> getStudentById(Long id) {
        return studentRepository.findById(id);
    }

    public Student updateStudent(Long id, Student updatedStudent) {
        updatedStudent.setId(id);
        return studentRepository.save(updatedStudent);
    }

    public void updateIsWorking(Long id, boolean isWorking) {
        Optional<Student> studentOptional = studentRepository.findById(id);
        if (studentOptional.isPresent()) {
            Student student = studentOptional.get();
            student.setWorking(isWorking);
            studentRepository.save(student);
        } else {
            throw new EntityNotFoundException("Student with id " + id + " not found");
        }
    }

    public void deleteStudent(Long id) {
        studentRepository.deleteById(id);
    }
}