import java.util.Scanner;
public class LE03_Q13_Rev01 {
	public static void main(String[] args) {
		int cont=0;
		int numEntre=0;
		int num=0;
		Scanner lerNum = new Scanner(System.in);
		for(cont = 1; cont <= 20; cont++) {
			System.out.print("Numero: ");
			num = lerNum.nextInt();
			if((num >= 0) && (num <= 100)) {
				numEntre++;
			}
		}
		System.out.println("Há "+numEntre+" números entre 0 e 100.");
		lerNum.close();
	}
}