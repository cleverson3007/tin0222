import java.util.Scanner;
public class LE03_Q08_Rev01 {

	public static void main(String[] args) {
		int cont=1;
		int idade=0;
		int somaMaiorIdade=0;
		Scanner sc = new Scanner(System.in);
		while(cont <= 20) {
			System.out.println(cont + "a. Idade: ");
			idade = sc.nextInt();
			if(idade >= 18) {
				somaMaiorIdade = somaMaiorIdade + 1;
			}
			cont++;
		}
		System.out.println("Quant. Pessoas Maiores de Idade: " + somaMaiorIdade);
		sc.close();
	}
}