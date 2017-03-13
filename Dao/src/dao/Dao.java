/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

/**
 *
 * @author mijan
 */
public class Dao {
    
    private Dao(){
        StudentDao studentDao = new StudentDaoImpl();
        
        studentDao.getAllStudent().forEach(System.out:: println);
        
        Student student = studentDao.getStudent(0);
        student.setName("Mijan");
        studentDao.updateStudent(student);
        studentDao.DeleteStudent(studentDao.getAllStudent().get(0));
        studentDao.getAllStudent().forEach(System.out:: println);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new Dao();
    }
    
}
