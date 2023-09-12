import javax.swing.JOptionPane;

public class ExemploIf{
	public static void main(String[] args){
		// decl
		// entr
		double nota = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota:"));
		// proc
		// said
		if(nota >= 70){
			JOptionPane.showMessageDialog(null, "Aprovado");
		} else {
			JOptionPane.showMessageDialog(null, "Reprovado");
		}
	}
}
