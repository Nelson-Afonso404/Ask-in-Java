package gitproject;

import java.util.Scanner;

public class JavaProject17 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//declaring the type of variable
		char escolha;
		System.out.println(" Indique, entre as op��es abaixo, um animal considerado invertebrado:\r\n"
				+ "(a) lesmas\r\n"
				+ "(b) ostras\r\n"
				+ "(c) cachorro\r\n"
				+ "(d) gato\r\n");
		//getting the value user value of type char
		escolha = input.next().charAt(0);
		//making the conditionals for the answers
		switch (escolha) {
		case 'a': case 'b':
			System.out.println("Alternativa correta! pontua��o: 1");
			break;
		case 'c': case 'd':
			System.out.println("Alternativa errada! pontua��o: 0");
			break;
			default:
				System.out.println("A alternativa n�o existe");
		}
		input.close();
	}

}
