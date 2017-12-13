public class Gugudan {
	public static int[][] calculate(int first, int second) {
		int[][] result=new int[first-1][second];
		for(int i=0;i<first-1;i++) {
			for(int j=0;j<second;j++) {
				result[i][j] = (i+2)*(j+1);
			}
		}
		for(int i=0;i<first-1;i++) {
			System.out.println("<"+(i+2)+"단>");
			for(int j=0;j<second;j++){
				System.out.println(result[i][j]);				
			}
		}
		return result;
	}
}