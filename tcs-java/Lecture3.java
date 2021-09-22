import java.util.Scanner; 

class Main {
  public static void main(String[] args) {
Scanner sc = new Scanner(System.in); // constructor 


System.out.println("what is your grade");
int time = sc.nextInt(); // next integer input after sysout 


    
    if (time < 18) {
      System.out.println("Good day.");
    } 
    
    
    else if (time >= 20 ){
      System.out.print(("elif statement "));
    }
  
    else {
      System.out.println("Good evening.");
    }  



  }
}
