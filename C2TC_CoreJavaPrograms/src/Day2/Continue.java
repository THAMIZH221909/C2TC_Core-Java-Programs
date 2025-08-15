package Day2;

public class Continue {
	public static void main(String[] args) {
		for (int k = 5; k < 15; k++)
		{
			if (k%2 != 0)    // Odd numbers are skipped
		    continue;       // Even numbers are printed
		    System.out.println(k + " ");
		}
	}
}
