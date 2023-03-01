import java.util.Scanner;
public class LE03_Q11_Rev01 {
	public static void main(String[] args) {
		int cont=1;
		int num=0;
		int numMaior8 = 0;
		Scanner lerNum = new Scanner(System.in);
		while(cont <= 20) {
			System.out.print("Número: ");
			num = lerNum.nextInt();
			if(num > 8) {
				numMaior8++;
			}
			cont++;
		}
		System.out.println("Há "+numMaior8+" números maiores que 8.");
		lerNum.close();
	}
}