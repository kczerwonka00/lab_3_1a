import java.io.IOException;
import java.util.Scanner;


class Main {
  public static void main(String[] args) {
    try {
      Service1 s = new Service1();
      Scanner read = new Scanner(System.in);
      int choose = 0;
      while (choose!=3);
      System.out.println("***MENU***");
      System.out.println("1 - Wpisz studenta");
      System.out.println("2 - Lista studenta");
      System.out.println("3 - Powrót do MENU");
      choose=read.nextInt();
      switch(choose){
        case 1:{
          System.out.println("Podaj imie: ");
          String imie=read.next();
          System.out.println("Podaj wiek: ");
          int wiek=read.nextInt();
        
      
      s.addStudent(new Student(imie, wiek ));
      System.out.println("Dodano studenta, powrót do MENU");
      break;
            }
          }
        read.close();
        
      
    } catch (IOException e) {

    }
  }
}
