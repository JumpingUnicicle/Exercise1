import java.util.Scanner; 
		
public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Hello ASE2017 - How are you now? :)");

		System.out.println("Please enter your name: ");
		Scanner scan = new Scanner(System.in);
		String userName = scan.next();
		HelloUser.greetUser(userName);
		

	}

}
