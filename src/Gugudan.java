import java.util.Scanner;

public class Gugudan {
	public static void main(String[] args) {
		while(true) {
			System.out.println("구구단 중 출력할 단은?:");
			Scanner scanner = new Scanner(System.in);
			int number=scanner.nextInt();
			if(number<2||number>9)
				System.out.println("Error: 2이상, 9이하의 값만 입력할 수 있습니다.");
			else {
				System.out.println("<"+number+"단>");
				for(int i=1;i<10;i++) {
				System.out.println(number*i);
				}
			}
		}
	}
}