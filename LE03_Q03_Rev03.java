import java.util.Scanner;
public class LE03_Q03_Rev03 {
	public static void main(String[] args) {
		int cont;
		Scanner nomeEmpresa = new Scanner(System.in);
        System.out.println("Entre com o nome: ");
        String nome = nomeEmpresa.nextLine();
        for(cont = 1; cont <= 10; cont++){
            System.out.println(cont + " Empresa: " + nome);
        }
        nomeEmpresa.close();
	}
}