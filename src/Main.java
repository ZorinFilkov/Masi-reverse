
public class Main {

	public static void main(String[] args) {
		int[] ourArray = new int[] { 1, 2, 3, 4, 5, 6 };
		int[] reversed = new int[ourArray.length];
		for (int index = 0; index < ourArray.length; index++) {
			reversed[ourArray.length - index - 1] = ourArray[index];
		}
		for (int index = 0; index < ourArray.length; index++) {
			System.out.print(reversed[index] + " ");
		}
	}

}
