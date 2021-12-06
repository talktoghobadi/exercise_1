import java.util.Scanner; public class Main {
public static void main(String[] args){ Scanner scan = new Scanner(System.in);
    int input = 0;
    int sum = 0;
    int count = 1;
while(input != 999 && count < 6){ System.out.print("Please enter a number: ");
input = scan.nextInt();
      if(input != 999){
        sum += input;
        count++;
} }
System.out.println("The sum of the numbers is " + sum); }
}