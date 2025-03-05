package uni;

import base.Person;

import java.util.ArrayList;
import java.util.Random;

import static base.Person.*;

public class Student {
    public int Id;
    Random random = new Random();
    public static ArrayList<Student> StudentsList;
    public int PersonId;
    public final int entranceYear;
    public int majorId;
    public int StudentId;
    public Student(int personId , int entranceyear , int majorid){
        majorId = majorid ;
        PersonId = personId;
        entranceYear = entranceyear ;
        Major major = Major.findMajorbyID(majorId);
        major.addStudent();
        StudentsList.add(this);
        Id = major.numberOfStudents;
        setStudentCode();
    }
    public static Student findbyId(int Id){
        for (Student student : StudentsList){
            if(student.Id == Id) return student;
        }
        return null;
    }
    public void setStudentCode(){
        this.StudentId = entranceYear*10000 + majorId*100 + Id;

    }



}
