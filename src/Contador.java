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
		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = terminal.??;
		System.out.println("Digite o segundo parâmetro");
		int parametroDois = terminal.??;
		
		try {
			//chamando o método contendo a lógica de contagem
			contar(parametroUm, parametroDois);
		
		}catch (? exception) {
			//imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
		}
		
	}
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		//validar se parametroUm é MAIOR que parametroDois e lançar a exceção
		
		int contagem = parametroDois - parametroUm;
		//realizar o for para imprimir os números com base na variável contagem
	}
}
