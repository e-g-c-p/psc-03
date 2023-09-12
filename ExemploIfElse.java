//import java.util.Scanner;
public class ExemploIfElse{
	public static void main(String[] args){
		// vari
		java.util.Scanner scan = new java.util.Scanner(System.in);
		System.out.print("Insira nota: ");
		double nota = scan.nextDouble();
		// proc
		if (nota >= 70){
			System.out.println("Aprovado");
		} else {
			System.out.println("Reprovado");
		}
	}
}
