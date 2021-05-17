import java.util.Scanner;

class Main {  

  public int fahTocel(int x){
    x-= 32;
    x *= 0.5556;
    return x;
  }
  
  public static void main(String args[]) { 
    Scanner scan = new Scanner(System.in);

    System.out.println("Fahrenheit to Celsius");
    System.out.println("Please enter degrees F as an integer.");
    int degreesF = scan.nextInt;

    fahTocel(degreesF);
  }
}
