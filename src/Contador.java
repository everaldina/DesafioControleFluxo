import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Desafio para prática de controle de fluxo em Java
 * Um programa que solicita ao usuário dois parâmetros inteiros e realiza um for para imprimir N numeros, onde N é a diferença entre o segundo e o primeiro parâmetro.
 * link: https://github.com/digitalinnovationone/trilha-java-basico/tree/main/desafios/controle-fluxo
 * 
 * @author: everaldina
 * @version: 1.0.0
 * @since: 2022-07-15
 */


public class Contador {
    public static void main(String[] args) {
		Scanner terminal = new Scanner(System.in);
        int parametroUm;
        int parametroDois;

        try{
            System.out.print("Digite o primeiro parâmetro: ");
            parametroUm = terminal.nextInt();
            System.out.print("Digite o segundo parâmetro: ");
            parametroDois = terminal.nextInt();
        }catch (InputMismatchException e){
            System.out.println("Tipo de parâmetro inválido.");
            terminal.close();
            return;
        }
		
		try {
			contar(parametroUm, parametroDois);
		}catch (ParametrosInvalidosException exception) {
			System.out.println(exception.getMessage());
		}

        terminal.close();
		
	}
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException();
        }

        int contagem = parametroDois - parametroUm;

        for (int i = 1; i <= contagem; i++) {
            System.out.println("Imprimindo o número "+ i);
        }
	}
}
