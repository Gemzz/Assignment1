import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int choice=0;
		do
		{
			System.out.println("Enter the choice:");
			System.out.println("1.Question 1\n2.Question 2\n3. Question 3\n4. Question 4\n5. Question 5\n6. Exit");
			Scanner scanner = new Scanner(System. in); 
			choice = Integer.parseInt(scanner. nextLine());
			switch(choice) {
				case 1:
					Question1.answer1();
					break;
				case 2: 
					Question2.answer2();
					break;
				case 3: 
					Question3.answer3();
					break;
				case 4: 
					Question4.answer4();
					break;
				case 5: 
					Question5.answer5();
					break;
				case 6:
					System.out.println("Exiting");
					break;
			}
		}while(choice!=6);
	}

}
