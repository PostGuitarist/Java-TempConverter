import java.util.Scanner;

class Main{  
  
  public static void fahrenToCel(double x){
    x -= 32;
    x *= 0.5556;
    System.out.println(x);
  }
  
  public static void celToFah(double y){
    y *= 1.8;
    y += 32;
    System.out.println(y);
  }  
  
  public static void main(String args[]) { 
    Scanner scan = new Scanner(System.in);

    int choice = 0;
    
    while(choice != 3){
      System.out.println("Please choose which conversion you want to do: ");
      System.out.println("1 - Fahrenheit to Celsius *** 2 - Celcius to Fahrenheit *** 3 - Quit");
      choice = scan.nextInt();
      if(choice == 1){
        System.out.println("Fahrenheit to Celsius");
        System.out.println("Please enter degrees F as an integer.");
        double degreesF = scan.nextDouble();        
        fahrenToCel(degreesF);
      }
      else if(choice == 2){
        System.out.println("Celcius to Fahrenheit");
        System.out.println("Please enter degrees C as an integer.");
        double degreesC = scan.nextDouble();        
        celToFah(degreesC);        
        
      }  
    }  
  }
}
