import java.util.Scanner;

public class q7 {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);

        float d;
        float velocidade;

        System.out.println("Digite a distãncia em quilômetros: ");
        d = t.nextFloat();
        System.out.println("Digite a velocidade em quilômetros por hora:");
        velocidade = t.nextFloat();

        float tempo = (d / velocidade);
        System.out.println("A viagem irá durar " + tempo + " horas");

        if (tempo > 3){
            System.out.println("Recomenda-se uma pausa para descanso");
        }else{
            System.out.println("");
        }

    }
}
