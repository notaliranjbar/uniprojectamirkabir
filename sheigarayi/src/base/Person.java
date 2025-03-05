package base;
import java.util.List;
import java.util.ArrayList;
import java.util.Random;
public class Person {
    Random random = new Random();
    public int Id;
    public static ArrayList<Person> personList;
    public String name;
    public int nationalId;
    public Person(String newPersonName , int newPersonNationalId){
        name = newPersonName;
        nationalId = newPersonNationalId;
        Id = nationalId;//جون کد ملی یکتاس به نظرم جنریت کردن عدد جدید مناسب نیست
        personList.add(this);
    }
    public static Person findPersonbyId(int PersonId){
        for(Person person : personList){// تو stackoverflow یاد گرفتم
            if(person.Id == PersonId) return person;
        }
        return null;
    }





}
