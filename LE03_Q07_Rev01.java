import java.util.Scanner;

public class LE03_Q07_Rev01 {
	public static void main(String[] args) {
		int cont=1;
		int idade=0;
		int somaIdade=0;
		int mediaIdades=0;
		Scanner sc = new Scanner(System.in);
		while(cont <= 20) {
			System.out.println(cont + "a. Idade: ");
			idade = sc.nextInt();
			somaIdade = somaIdade + idade;
			cont++;
		}
		mediaIdades = somaIdade / 20;
		System.out.println("Media das 20 idades é: " + mediaIdades);
		sc.close();
	}
}