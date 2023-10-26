import java.util.Scanner;

public class q10 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        float dt;
        float dd;

        System.out.println("Digite a distância total: ");
        dt = a.nextFloat();
        System.out.println("Digite a distância diária: ");
        dd = a.nextFloat();

        int dpc = (int) (dt / dd);
        System.out.println("Serão necessários " + dpc + " para completar a prova !");
    }
}
