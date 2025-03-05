import base.*;
import uni.*;

import static uni.Professor.ProfessorsList;
import static uni.Student.StudentsList;

public class Main {
    public static void main(String[] args) {
        Major math = new Major("math" , 15);
        Major science = new Major("science" , 10);
        Person majid = new Person("majid" ,1);
        Person mamad = new Person("mamad" , 2);
        Person ali = new Person("ali" , 3);
        Person hosein = new Person("hosein" , 4);
        Person gholi = new Person("gholi" , 5);
        Student majidS = new Student(1 , 1401 , 1);
        Student mamadS = new Student(2 , 1402 , 0);
        Student aliS = new Student(3 , 1402 , 0);
        for(Student student : StudentsList) {
            System.out.println(student.Id);
            Person person = Person.findPersonbyId(student.Id);
            System.out.println(person.name);
        }
        Professor hoseinP = new Professor(4 , 1);
        Professor gholiP = new Professor(5 , 1);
        for(Professor professor : ProfessorsList){
            System.out.println(professor.Id);
            Person person = Person.findPersonbyId(professor.Id);
            System.out.println(person.name);
        }
        Course Ap = new Course("ap" , 3);
        Course mathcourse = new Course("math" , 3);
        Course varzesh = new Course("varzesh" , 2);
        PresentedCourse ApP = new PresentedCourse(0 , 4 , 10);
        PresentedCourse mathcourseP = new PresentedCourse( 1 , 4 , 7);
        PresentedCourse varzeshP = new PresentedCourse(2 , 5 , 5);
        ApP.addStudent(0);
        ApP.addStudent(1);
        mathcourseP.addStudent(0);
        mathcourseP.addStudent(1);
        mathcourseP.addStudent(2);
        varzeshP.addStudent(2);
        Transcript transcript1 = new Transcript(0);
        Transcript transcript2 = new Transcript(1);
        Transcript transcript3 = new Transcript(2);
        transcript1.setGrade(0 , 19);
        transcript1.setGrade(1 , 18.5);
        transcript2.setGrade(0, 17);
        transcript2.setGrade(1 , 15.5);
        transcript3.setGrade(1 ,20);
        transcript3.setGrade(2,20);
        transcript1.printTranscript();
        transcript2.printTranscript();
        transcript3.printTranscript();
        transcript1.getGpa();
        transcript2.getGpa();
        transcript3.getGpa();




    }
}