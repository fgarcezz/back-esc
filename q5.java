import java.util.Scanner;

public class q5 {
    public static void main(String[] args) {
        Scanner id = new Scanner(System.in);

        int idade;
        System.out.println("Digite sua idade");
        idade = id.nextInt();

        if (idade > 15 && idade < 70){
            System.out.println("Você pode doar sangue");
        }else{
            System.out.println("Você não pode doar sangue");
        }
    }
}
