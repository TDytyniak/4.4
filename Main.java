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
  Service s = new Servive();
  try{
    Scanner imie=new Scanner(System.in);
     Scanner wiek=new Scanner(System.in);
    Scanner wyb=new Scanner(System.in);
    Scanner nazwisko=new Scanner(System.in);
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
    System.out.println("Podaj nazwisko:");
    String n=nazwisko.nextLine();
    System.out.println("Podaj wiek:");
      int w=wiek.nextInt();
          
           s.addStudent(new Student(i,n,w));
           break;
    
    case 2:    
   
     
     var students = s.getStudents();
      for(Student current : students) 
        System.out.println(current.ToString()); 
        break;
      }
      } catch (IOException e) {}
        
    }
}
      
  
