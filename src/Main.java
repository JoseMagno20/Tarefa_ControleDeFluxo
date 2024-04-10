import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Digite a nota da AV1?");
        long av1 = s.nextLong();

        System.out.println("Digite a nota da AV2?");
        long av2 = s.nextLong();

        System.out.println("Digite a nota da AV3?");
        long av3 = s.nextLong();

        System.out.println("Digite a nota da AV4?");
        long av4 = s.nextLong();

        long media = (av1+av2+av3+av4)/4;

        if(media>=7){
            System.out.println("Voce está aprovado!");
        }else if(media>=5 && media<7){
            System.out.println("Voce vai para recuperação!");
        }else{
            System.out.println("Voce está reprovado!");
        }

    }
}