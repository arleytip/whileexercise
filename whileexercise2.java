import java.util.Scanner;

public class whileexercise2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		int y = sc.nextInt();
		
		while(x != 0 || y != 0) {
			if(x < y) {
				System.out.println("primeiro");
			}else if(x > y) {
				System.out.println("segundo");
			}else if(-x < y) {
				System.out.println("terceiro");
			}else if(x > -y) {
				System.out.println("quarto");
			}else 
				System.out.println("Nothing");
			 x = sc.nextInt();
			 y = sc.nextInt();
		}
		
		sc.close();
		
	}

}
