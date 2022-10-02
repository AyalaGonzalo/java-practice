
import java.util.Scanner;

public class ejercicio_10{
	
	
	public static void main(String[] args){
		
		Scanner Write = new Scanner(System.in);
		
		int sum = 0;
		int limit;
		int num;
		
		System.out.println("Enter a limited number");
		limit = Write.nextInt();
		
		do {
			
			
			
			System.out.println("Enter a number");
			num = Write.nextInt();
			
			sum += num;
			
		} while(sum < limit);
		
		System.out.println("The total sum is: " + sum);
		
	}
	
	
	
}