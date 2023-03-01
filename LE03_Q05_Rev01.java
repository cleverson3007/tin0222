import java.util.Scanner;

public class LE03_Q05_Rev01 {
	public static void main(String[] args) {
		int cont=1;
		int num=0;
		int soma=0;
		Scanner sc = new Scanner(System.in);
		while(cont <= 10) {
			System.out.println("Numero: ");
			num = sc.nextInt();
			soma = soma + num;
			cont++;
		}
		System.out.println("Soma dos 10 é: " + soma);
		sc.close();
	}
}