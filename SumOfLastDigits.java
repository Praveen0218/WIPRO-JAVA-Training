import java.util.*;
public class SumOfLastDigits
{
	public static void main(String[] args) 
	{
		int num1, num2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number: ");
		num1 = sc.nextInt();
		System.out.println("Enter second number: ");
		num2 = sc.nextInt();
		addLastDigit(num1,num2);
    }
	public static void addLastDigit(int input1, int input2)
	{
		int rem1 = input1 % 10;
		int rem2 = input2 % 10;
		int sum = rem1 + rem2;
		System.out.println("Sum of "+rem1+"  and "+rem2+ " is = "+sum);
    }

}