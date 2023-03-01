import java.util.Scanner;
public class LE03_Q12_Rev01 {
	public static void main(String[] args) {
		int cont=0;
		int numPar=0;
		float num=0;
		Scanner lerNum = new Scanner(System.in);
		for(cont = 1; cont <= 20; cont++) {
			System.out.print("Numero: ");
			num = lerNum.nextFloat();
			if((num % 2)== 0) {
				numPar++;
			}
		}
		System.out.println("Há "+numPar+" números pares.");
		lerNum.close();
	}
}