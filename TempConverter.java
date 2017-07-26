import java.util.Scanner; //
public class FinalTemp {

	public static void main(String[] args) {
		double res, ex;
		String degrees, answer;
		
		do {
			System.out.println("Enter temperature:");
			Scanner Keyboard = new Scanner(System.in);
			ex = Keyboard.nextDouble();
			
			System.out.println("Enter C to convert to Celcius or F to Fahrenheit:");
			degrees= Keyboard.next();
			
			if (degrees.equalsIgnoreCase("C") || degrees.equalsIgnoreCase("c")) {
				res = 5 * (ex - 32) / 9;
				System.out.println("The temperature converted to Celsius is: " + res);
			} else if (degrees.equalsIgnoreCase("F") || degrees.equalsIgnoreCase("f")) {
					res = (9*(ex)/5) +32;
					System.out.println("The temperature converted to Fahrenheit is: " + res);
			}
			
			System.out.println("Enter Yes to retry, Q to Stop");
			Keyboard.nextLine();
			answer = Keyboard.nextLine();
				}while (answer.equalsIgnoreCase("Yes"));
			System.out.println("Hello Instructor Alkilani, this is the INF231 Final Assignemnt for: Alysia Petti");
		}
		
		

	}