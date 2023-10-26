import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        double preco = 0.75;

        Scanner p = new Scanner(System.in);
        System.out.println("Digite o valor que você possui");
        double valor = p.nextDouble();

        if (valor < preco) {
            System.out.println("Seu saldo é insuficiente !");
        } else {
            System.out.println("Você pode comprar pão !");
        }
    }
}