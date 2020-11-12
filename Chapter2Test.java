import java.util.Scanner;

public class Chapter2Test {
  public static void main(String[] args) {
  Scanner scan = new Scanner(System.in);
  System.out.println("what number do you want");
  int num1 = scan.nextInt();
  System.out.println("what other number do you want");
  int num2 = scan.nextInt();

  double num15 = (double) num1;
  double num16 = (double) num2;

  double x = (num15 + num16)/ 2;

  System.out.println("The averge of the numbers is" + x);
  }
}