import java.util.Scanner;

public class GugudanMain {
	public static void main(String[] args) {
		while(true) {
			System.out.println("몇/몇 단을 출력하시겠습니까?: \n(\"end\"를 치시면 종료됩니다.)");
			Scanner scanner = new Scanner(System.in);
			String inputValue=scanner.nextLine();
			if(inputValue.equals("end")) {
				System.out.println("끝!");
				break;
			}
			String[] splitedValue=inputValue.split("/");
			int first=Integer.parseInt(splitedValue[0]);
			int second=Integer.parseInt(splitedValue[1]);
			if(first<2||second<1)
				System.out.println("2↑/1↑으로 입력해주세요.");
			else
				Gugudan.calculate(first,second);
		}
	}
}