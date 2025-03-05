package uni;

import java.util.ArrayList;
import java.util.Random;
public class Major {
    public int Id;
    public static ArrayList<Major> majorList;
    public String name ;
    public final int capacity;
    public int numberOfStudents = 0;
    Random random = new Random();
    public Major(String newMajorName , int newMajorcapacity){
        name = newMajorName;
        capacity = newMajorcapacity;
        Id = majorList.size();//یکک عدد که به هیچ عدد دیگری نسبت داده نمیشود
        majorList.add(this);
    }

    public static Major findMajorbyID(int majorId){
        for(Major major : majorList ) {
            if (major.Id == majorId) return major;
        }
        return null;
    }
    public void addStudent(){
        if(this.numberOfStudents < this.capacity) this.numberOfStudents++;
        else System.out.println("Sorry! cant add any new Students to this major");
    }
}