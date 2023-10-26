import java.util.Scanner;

public class q8 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);

        int preco = 500;
        int mesada = 50;
        int meses = (preco / mesada);

        System.out.println("Ele precisará de " + meses + " meses para conseguir comprar o Videogame");
    }
}
