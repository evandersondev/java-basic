package secao8;

public class Funcoes {
    public static void main(String[] args) {
        // Criando minha primeira função
        saudacao();

        // Função com parâmetros
        soma(5, 10);

        // Função com retorno
        int numero = 7;
        int resultadoDobro = dobrar(numero);
        System.out.println("O dobro de " + numero + " é: " + resultadoDobro);
    }

    public static void saudacao() {
        System.out.println("Hello World!");
    }

    public static void soma(int a, int b) {
        int resultado = a + b;
        System.out.println("A soma é: " + resultado);
    }

    public static int dobrar(int numero) {
        return numero * 2;
    }
}
