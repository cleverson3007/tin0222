import javax.swing.JOptionPane;
public class ExemploJOptionPane {
	public static void main(String[] args) {
		String nota, carinha;
		double valNota = 0,
		media;
		int i;
		for (i = 1; i <= 3; i++){
			nota = JOptionPane.showInputDialog("Digite a "+i+"ª nota");
			valNota += Double.parseDouble(nota);
		}
		media = valNota / i;
		if (media >= 60) {
			carinha = " :)";
		}else {
			carinha = " :(";
		}
		JOptionPane.showMessageDialog(null,"A média do aluno é "+ media+carinha,"Média",JOptionPane.INFORMATION_MESSAGE);
	}
}