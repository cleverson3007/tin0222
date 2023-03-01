import java.util.Scanner;
public class LE03_Q03_Rev01 {
	public static void main(String[] args) {
		int cont = 1;
		Scanner nomeEmpresa = new Scanner(System.in);
        System.out.println("Entre com o nome: ");
        String nome = nomeEmpresa.nextLine();
        while(cont <= 15){
            System.out.println(cont + " Empresa: " + nome);
            cont++;
        }
        nomeEmpresa.close();
	}
}