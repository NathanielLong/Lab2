//@author : Nathaniel Long
import java.util.Scanner;
public class Perimeter_Area {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String userAnswer; 
		String userAnswer2;
		boolean possibleRepeat;
		boolean possibleVolume;
		
		do {
		System.out.println("Welcome to Grand Circus' Room Detail Generator! ");
		System.out.println("Enter length: ");
		double roomLength = scan.nextDouble();
		System.out.println("Enter width: ");
		double roomWidth = scan.nextDouble();
		
		double roomArea = roomLength * roomWidth;
		double roomPerimeter = (roomLength * 2) + (roomWidth * 2);
		
		
		System.out.println("Area: " + roomArea);
		System.out.println("Perimeter: " + roomPerimeter);
		System.out.println("Would you like the volume of the room as well, please answer yes or no: ");
		userAnswer2 = scan.next();
		possibleVolume = userAnswer2.equalsIgnoreCase("yes");
		if (possibleVolume == true) {
			System.out.println("Enter Height: ");
			double roomHeight = scan.nextDouble();
			double roomVolume = roomLength * roomWidth * roomHeight;
			System.out.println("Volume: " + roomVolume);
		}
		else {
			System.out.println("Alright, no room volume for you then...");
		}
		
		System.out.println("Would you like to enter new values, please answer  yes or no: ");
		userAnswer = scan.next();
		possibleRepeat = userAnswer.equalsIgnoreCase("yes");
		
		} while(possibleRepeat);
	
		scan.close();
		
	}

}
