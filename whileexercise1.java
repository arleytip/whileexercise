import java.util.Scanner;

public class whileexercise1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		
		while (x != 2002) {
			if (x == 2002) {
				System.out.println("Senha Válida");
			}
			else {
				System.out.println("Senha invalida");
			}
			x = sc.nextInt();
		}
		
		sc.close();
		
	}

}
