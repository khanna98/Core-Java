import java.util.*;
import java.lang.*;
import java.io.*;

class Student{
    int rollno;
    String name;
    String city;

    public Student(int rollno, String name, String city){
        this.rollno = rollno;
        this.name = name;
        this.city = city;
    }

    public String toString(){
        return this.rollno + " " + this.name + " " + this.city;
    }
}

class SortByRoll implements Comparator<Student>{
    public int compare(Student a,Student b){
        return a.name.compareTo(b.name);
    }
}
public class ComparatorDemo{

}