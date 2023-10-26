import java.util.Scanner;

public class q6 {
    public static void main(String[] args) {
        int idade;
        Scanner id = new Scanner(System.in);

        System.out.println("Digite sua idade: ");
        idade = id.nextInt();

        if (idade > 54 && idade < 60){
            System.out.println("Frentista");
        }else if(idade > 59 && idade < 65){
            System.out.println("Médico");
        }else if (idade > 64 && idade < 70){
            System.out.println("Advogado");
        }else if(idade > 49 && idade < 55){
            System.out.println("Programador");
        }
    }
}
