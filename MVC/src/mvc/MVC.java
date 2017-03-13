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
public class MVC {

    public MVC() {
        Student student = getStudent();
        View view = new View();
        Controller controller = new Controller(student,view);
        controller.updateView();
        controller.setStudentName("Mijan");
        controller.updateView();
    }
    
    public Student getStudent(){
        Student student = new Student();
        student.setId(0);
        student.setName("Mijanur Rahaman");
        return student;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new MVC();
    }
    
}
