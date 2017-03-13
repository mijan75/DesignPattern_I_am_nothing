/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc;

/**
 *
 * @author mijan
 */
public class Controller {
    Student student;
    View view;

    public Controller(Student student, View view) {
        this.student = student;
        this.view = view;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public View getView() {
        return view;
    }

    public void setView(View view) {
        this.view = view;
    }
    
    
    public void setStudentName(String name){
        student.setName(name);		
    }

    public String getStudentName(){
        return student.getName();		
    }

    public void setStudentRollNo(int rollNo){
        student.setId(rollNo);		
    }

    public int getStudentRollNo(){
        return student.getId();		
    }
    
    public void updateView(){
        view.print(student.getId(), student.getName());
    }
    
}
