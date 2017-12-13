public class GugudanMain {
	public static void main(String[] args) {
		String inputValue=GugudanInput.input(args);
		String[] splitedValue=inputValue.split("/");
		int first=Integer.parseInt(splitedValue[0]);
		int second=Integer.parseInt(splitedValue[1]);
		if(first<2||second<1)
			System.out.println("2↑/1↑으로 입력해주세요.");
		else
			Gugudan.calculate(first,second);
	}
}