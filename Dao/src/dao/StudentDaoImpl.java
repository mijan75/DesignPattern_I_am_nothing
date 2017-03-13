/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mijan
 */
public class StudentDaoImpl implements StudentDao{
    
    List<Student> students = new ArrayList<Student>();

    public StudentDaoImpl() {
        Student student1 = new Student("Mijanur Rahaman", 0);
        Student student2 = new Student("Monirul Hasan", 1);
        students.add(student1);
        students.add(student2);
    }
    
    @Override
    public List<Student> getAllStudent() {
        return students;
    }

    @Override
    public Student getStudent(int roll) {
        return students.get(roll);
    }

    @Override
    public void updateStudent(Student student) {
        students.get(student.getId()).setName(student.getName());
        System.out.println(student.getId() + " is updated in database");
    }

    @Override
    public void DeleteStudent(Student student) {
        students.remove(student.getId());
        System.out.println(student.getName() + " is deleted from the database");
    }
    
}
