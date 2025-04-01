import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro: ");
        int parametroUm = terminal.nextInt();
        System.out.println("Digite o segundo parâmetro: ");
        int parametroDois = terminal.nextInt();
        try {
            // Chamando o método contendo a lógica de contagem
            contar(parametroUm, parametroDois);
        } catch(ParametrosInvalidosException exception) {
            // Imprimir a mensagem de erro
            System.out.println(exception.getMessage());
        }
        terminal.close();
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        // Validar se parametroUm é maior ou igual a parametroDois e lançar a exceção
        if (parametroUm >= parametroDois) {
            throw new ParametrosInvalidosException();
        }
        
        // Imprimir os números de parametroUm até parametroDois
        for (int i = parametroUm; i <= parametroDois; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }
}




