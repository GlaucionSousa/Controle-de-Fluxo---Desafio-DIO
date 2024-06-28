import java.util.Random;

public class ContadorRandom {
    public static void main(String[] args) {
        int parametroUm = gerarNumeroAleatorio(1, 30);
        System.out.println("O primeiro número foi: " + (gerarNumeroAleatorio(parametroUm, parametroUm)));
        int parametroDois = gerarNumeroAleatorio(1, 30);
        System.out.println("O Segundo número foi: " + (gerarNumeroAleatorio(parametroDois, parametroDois)));
        System.out.println();

        try {
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException e) {
            System.out.println(e.getMessage());
        }
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        if (parametroUm >= parametroDois) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro!!");
        }

        int contagem = parametroDois - parametroUm;
        
        for (int i = parametroUm; i <= parametroDois; i++) {
            System.out.println("Imprimindo o número " + i);
        }

        System.out.println();
        System.out.println("Total de números impressos: " + contagem);
    }

    static int gerarNumeroAleatorio(int min, int max) {
        Random random = new Random();
        return random.nextInt((max - min) + 1) + min;
    }

}
