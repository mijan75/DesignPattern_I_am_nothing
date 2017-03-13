/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;

/**
 *
 * @author mijan
 */
public interface StudentDao {
    public List<Student> getAllStudent();
    public Student getStudent(int roll);
    public void updateStudent(Student student);
    public void DeleteStudent(Student student);
}
