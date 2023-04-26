import java.util.Scanner;
import java.io.FileWriter;
import java.io.I0Exception;



public class Student {




private String Name;
  private int Age;
private String Surname;
  public Student(String name, int age,String surname) {
    Name = name;
    Age = age;
    Surname = surname;
  }

  public String GetName() {return Name;}
  public String GetSurname() {return Surname;}
  public int GetAge() {return Age;}

  public String ToString() {
    return Name + " " + Surname + " " + Integer.toString(Age);
  }

  public static Student Parse(String str) {
    String[] data = str.split(" ");
    if(data.length != 2) 
      return new Student("Parse Error", -1);
    return new Student(data[0], Integer.parseInt(data[1]));
  }
}