import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {

        int temperatura;
        Scanner temp = new Scanner(System.in);

        System.out.println("Digite a temperatura de hoje:");
        temperatura = temp.nextInt();

        if (temperatura < 30){
            System.out.println("Não há necessidade de guarda-sol !");
        }else{
            System.out.println("Recomenda-se uso de guarda-sol !");
        }

    }
}