
import java.util.Scanner;
import java.util.ArrayList;


public abstract class Person {
     
    private String name;
    private String gender;
     
    public Person(String nm, String gen){
        this.name=nm;
        this.gender=gen;
    }
    public String getName(){return name;} 
    public String getGender(){return gender;}
    //abstract method
    public abstract String toString();
}


/*public class Student extends Person {

   public ArrayList<subject> subjecttaken = new ArrayList<subject>();
   Scanner input = new Scanner(System.in);
   int selection = 0;

   Student(String fn , String ln) {
      super(fn,ln);
   }

   public void  Display(){

   while(selection != 4){

      System.out.println("-------Menu---------");
      System.out.println("1.Add Subject ");
      System.out.println("2.Remove subject ");
      System.out.println("3.Show Result");
      System.out.println("4.Quit");
      System.out.print("Enter your choice : ");
      selection = input.nextInt();

      if(selection == 1){
        addSubject(code, grade);
      } else if (selection == 2) {
        removeSubject(code, grade);
      } else if(selection == 3){

      } else if(selection == 4){

      } else {
           System.out.println("Invalid choice:");
      }
      
   }
      
   }

   public void addSubject(String code , char grade ){
      subjecttaken.add(new subject(code,grade));
      

   }

   public void removeSubject(String code , char grade) {

      subjecttaken.remove(new subject(code, grade));
   }

  

}*/



