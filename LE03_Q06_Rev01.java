import java.util.Scanner;

public class LE03_Q06_Rev01 {
	public static void main(String[] args) {
		int cont=1;
		int idade=0;
		int somaIdade=0;
		Scanner sc = new Scanner(System.in);
		while(cont <= 10) {
			System.out.println("Idade: ");
			idade = sc.nextInt();
			somaIdade = somaIdade + idade;
			cont++;
		}
		System.out.println("Soma das Idades: " + somaIdade);
		sc.close();
	}
}