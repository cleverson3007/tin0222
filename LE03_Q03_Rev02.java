import java.util.Scanner;
public class LE03_Q03_Rev02 {
	public static void main(String[] args) {
		int cont = 1;
		Scanner nomeEmpresa = new Scanner(System.in);
        System.out.println("Entre com o nome: ");
        String nome = nomeEmpresa.nextLine();
        do{
            System.out.println(cont + " Empresa: " + nome);
            cont++;
        }while(cont <= 15);
        nomeEmpresa.close();
	}
}