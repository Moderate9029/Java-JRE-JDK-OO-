package moderate;

public class ArrayPrint {

	public static void main(String[] args) {
		int[] x = new int[50];
		
		for (int i = 0; i < x.length; i++) {
			x[i] = i;
			System.out.println(x[i]);
		}
	}
}
