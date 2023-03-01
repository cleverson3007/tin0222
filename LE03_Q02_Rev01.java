public class LE03_Q02_Rev01 {
	public static void main(String[] args) {
		int cont = 0;
		int soma = 0;
		while(cont <= 15) {
			soma = soma + cont;
			cont++;
		}
		System.out.println("Soma de 1 a 15 é: " + soma);
	}
}