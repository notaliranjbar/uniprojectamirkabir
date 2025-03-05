package uni;

import java.util.ArrayList;
import java.util.Random;

public class Course {
    public int Id ;
    Random random = new Random();
    public static ArrayList<Course> CoursesList;
    public String title;
    public int units;
    public Course(String Title , int Units){
        units = Units;
        title = Title;
        CoursesList.add(this);
        Id = CoursesList.size();
    }
    public static Course findbyId(int courseId){
        for (Course course : CoursesList){
            if(course.Id == courseId) return course;
        }
        return null;
    }

}
