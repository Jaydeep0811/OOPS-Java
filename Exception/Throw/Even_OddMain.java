package Exception.Throw;

import java.util.Scanner;

public class Even_OddMain {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Even Number : ");
		int number=sc.nextInt();
		
		Even_OddNumber evenObj= new Even_OddNumber("Number is not Even");

		evenObj.numberIsEvenOrNot(number);
	}

}
