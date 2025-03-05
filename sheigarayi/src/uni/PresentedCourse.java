package uni;

import java.util.ArrayList;
import java.util.Random;

public class PresentedCourse {
    public int Id;
    public static ArrayList<PresentedCourse> presentedCoursesList;
    public int CourseId;
    public int ProfessorId ;
    public int capacity;
    public ArrayList<Integer> StudentsIds;
    public PresentedCourse(int courseId , int professorId , int maxcapacity){
        ProfessorId = professorId;
        CourseId = courseId;
        capacity = maxcapacity;
        presentedCoursesList.add(this);

    }
    public static PresentedCourse findbyId(int courseId){
        for(PresentedCourse course : presentedCoursesList){
            if(course.Id == courseId) return course;
        }
        return null;
    }
    public void addStudent(int studentId){
        if(StudentsIds.size()< capacity) StudentsIds.add(studentId);
        else System.out.println("Sorry! limit is reached cant add more Students");
    }


}
