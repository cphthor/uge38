import java.util.Scanner;
public class ComputeSum {
  public static void main(String[] args) {
    System.out.println("Indast et heltal: ");
    Scanner myScan = new Scanner(System.in);
    int userInt = myScan.nextInt();
    System.out.printf("Tværsummen er: %d%n",computeSum(userInt));
  }
  public static int computeSum(int number){
    int sum = 0;
    int counter = 0;
    int rest = 0;
    // 345
    while(number > 0) {
      counter++;
      rest = number%10;//5,4,3
      number = number/10;//34,3,0
      sum = sum + rest;//5,9,12
      if (sum > 10 && number == 0) {
        System.out.printf("Efter %d iterationer er Mellemtværsum: %d%n",counter,sum);
        number = sum;
        sum = 0;
      }
    }
    return sum;
  }
}
