
import java.util.Scanner;

public class lab01 {
    
    public static void main(String[] args){
    Scanner input  = new Scanner(System.in);
    System.out.print("Enter a Number(1-20): ");
    int n = input.nextInt();

      for(int i = 1 ; i<=n ; i++){//row
        for(int j = 1 ; j <= n ; j++){//column
          int value = i + (j - 1) * n;
          System.out.print("1");
          //System.out.printf("%4d", value);
        }
        System.out.println();
      }
  }

    
}
//2-1, 1+(1)*3 i = 1 until row completed