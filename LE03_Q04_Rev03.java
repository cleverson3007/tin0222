//Lista de Exercícios 03 - Questão 04 - Abordagem utilizando do...while.
import java.util.Scanner;

public class LE03_Q04_Rev03 {
    public static void main(String[] args) {
        int cont=1;
        int num=0;
        Scanner nomeUsuario = new Scanner(System.in);
        Scanner numVezes = new Scanner(System.in);
                        
        System.out.println("Nome do Usuário: ");
        String nome = nomeUsuario.nextLine();
        
        System.out.println("Informe o Número de Vezes: ");
        num = numVezes.nextInt();

        do {
        	System.out.println("Usuário: " + nome);
        	cont++;
        }while(cont <= num);
        
        nomeUsuario.close();
        numVezes.close();
    }
}