import java.util.*;
import java.lang.*;

public class MultiThreadingDemo{
    public static void main(String[] args) {
        Thread t = Thread.currentThread();
        System.out.println("Current Thread : " + t);
        System.out.println("Name : " + t.getName());
        System.out.println("Priority : " + t.getPriority());
        t.setName("Demo");
        t.setPriority(7);
        System.out.println("Updated Name : " + t.getName());
        System.out.println("Updated Priority : " + t.getPriority());
    }
}