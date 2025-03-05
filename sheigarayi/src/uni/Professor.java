package uni;

import java.util.ArrayList;
import java.util.Random;

public class Professor {
    public int Id ;
    Random random = new Random();
    public static ArrayList<Professor> ProfessorsList;
    public int personId;
    public int majorId;
    public Professor(int PersonID , int MajorId){
        personId = PersonID;
        majorId = MajorId;
        Id = ProfessorsList.size();
        ProfessorsList.add(this);
    }
    public static Professor findbyId(int ProfessorId){
        for(Professor professor : ProfessorsList){
            if (professor.Id == ProfessorId) return professor;
        }
        return null;
    }

}
