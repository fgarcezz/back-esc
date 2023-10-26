import java.util.Scanner;

public class q4 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);

        float preco;
        int pessoa = 0;
        float total;
        int i;


       do {
           System.out.println("Digite a idade da pessoa: ");
           int idade = a.nextInt();

           if (idade > 18){
               preco = 50;
               System.out.println("Preço = R$50,00");
               pessoa ++;
           }else if(idade > 2 && idade < 19){
               preco = 25;
               System.out.println("Preço = R$25,00");
               pessoa ++;
           } else if (idade < 3) {
               preco = 0;
               System.out.println("Preço = R$0,00");
               pessoa ++;
           }



       }while(pessoa < 5);


    }
}