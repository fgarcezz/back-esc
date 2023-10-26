import java.util.Scanner;

public class q9 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        float kmd;
        int semana = 7;

        System.out.println("Digite a distância em quilômetros percorrida no dia: ");
        kmd = a.nextFloat();
        float totals = kmd * semana;

        System.out.println("Ela irá percorrer " + totals + " KM durante a semana !");
    }
}
