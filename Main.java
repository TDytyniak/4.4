/*
Kod bazowy programu Commit4_0: 
• Program dodaje do prostej bazy danych (pliku db.txt) dane odnośnie Studentów.
• Studenci dodawani są w klasie Main.
• Wszyscy studenci są wypisywani na końcu klasy Main.
• Klasa Service obsługuje odczyt i zapis do pliku bazy danych.
• Klasa Student reprezentuje pojedynczego studenta (Imię, Wiek).
*/

import java.io.IOException;
import java.util.Scanner;

class Main {
  public static void main(String[] argst) {
    Scanner imie=new Scanner(System.in);
    Scanner wyb=new Scanner(System.in);
    Scanner wiek=new Scanner(System.in);
    System.out.println("Wybierz opcje\n 0.Zamknij program\n 1. Dodaj studenta.\n 2. Dodaj studenta.\n");
    int wy=wyb.nextInt();
    switch(wy)
      {
        case 0:
          System.exit(0);
          break;
        case 1:
          System.out.println("Podaj imie:");
    String i=imie.nextLine();
    System.out.println("Podaj wiek:");
      int w=wiek.nextInt();
          
    try {
      Service s = new Service();
      s.addStudent(new Student(i,w));
     

      
     break;} 
      catch (IOException e){}
    case 2:    Service s = new Service();  
     try {
     
     s.addStudent(new Student(i,w));
     var students = s.getStudents();
       int w=wiek.nextInt();
      for(Student current : students) {
        System.out.println(current.ToString()); 
       
      }
    } catch (IOException e) {
      
    }
        
    }
}
      
  
}