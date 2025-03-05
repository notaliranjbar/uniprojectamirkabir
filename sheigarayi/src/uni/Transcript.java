package uni;

import base.Person;

import java.util.HashMap;

public class Transcript {
    public int StudentId;
    public HashMap<Integer , Double> transcript;
    public Transcript(int studentId){
        StudentId = studentId;
        HashMap<Integer , Double> transcript;
    }
    public void setGrade(int presentedcourseId ,double grade){
        PresentedCourse presentedCourse = PresentedCourse.findbyId(presentedcourseId);
        if (presentedCourse.StudentsIds.contains(StudentId)) {
            transcript.put(presentedcourseId , grade);
        }else System.out.println("the Student is not included in the course");
    }
    public void printTranscript(){
        String studentname = Person.findPersonbyId(StudentId).name;
        System.out.println(studentname + StudentId + "transcript:");
        for(int courseId : transcript.keySet()){
            String couresname = Course.findbyId(courseId).title;
            System.out.print(couresname + " : ");
            Double coursegrade = transcript.get(courseId);
            System.out.println(coursegrade);
        }
    }
    public double getGpa(){
        double sum = 0;
        int count = 0;
        for(int Id : transcript.keySet()){
            sum += transcript.get(Id);
            Course course = Course.findbyId(Id);
            count+= course.units;
        }
        return (sum/count);
    }



}
