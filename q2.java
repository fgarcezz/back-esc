import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {

        Scanner id = new Scanner(System.in);
        System.out.println("Digite sua idade: ");
        int idade = id.nextInt();

        if (idade > 16){
            System.out.println("Pode participar do concurso !");
        }else{
            System.out.println("A idade mínima para participar é de 16 anos");
        }
    }
}