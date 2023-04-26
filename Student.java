import java.util.Scanner;
import java.io.FileWriter;
import java.io.I0Exception;



public class Student {




private String Name;
  private int Age;
private String Surname;
  private String Address;
  
  public Student(String name, int age,String surname, String address) {
    Name = name;
    Age = age;
    Surname = surname;
   Address = address;
  }

  public String GetName() {return Name;}
  public String GetSurname() {return Surname;}
  public int GetAge() {return Age;}
public String GetAddress() {return Address;}
  public String ToString() {
    return Name + " " + Surname + " " + Address + " " +Integer.toString(Age);
  }

  public static Student Parse(String str) {
    String[] data = str.split(" ");
    if(data.length != 4) 
      return new Student("Parse Error", -1);
    return new Student(data[0], data[1], Integer.parseInt(data[2]),data[3]);
  }
}