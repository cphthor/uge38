import java.util.Scanner;
public class ComputeSum {
  public static void main(String[] args) {
    Scanner myScan = new Scanner(System.in);
    int userInt = myScan.nextInt();
    int sum = computeSum(userInt);
  }
  public static int computeSum(int number){
    int sum = 0;
    int rest = 0;
    while(number > 0) {
      rest = number%10;
      number = number/10;
      sum = sum + rest;
    }
    return sum;
  }
}
