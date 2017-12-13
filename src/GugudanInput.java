import java.util.Scanner;

public class GugudanInput {
	public static String input(String[] args) {		
	System.out.println("몇/몇 단을 출력하시겠습니까?: ");
	Scanner scanner = new Scanner(System.in);
	String string=scanner.nextLine();
	
	return string;
	}
}