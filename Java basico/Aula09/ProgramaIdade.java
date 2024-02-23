import java.util.Scanner;

public class ProgramaIdade {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        System.out.println("Em que ano voce nasceu? ");
        int nasc = t.nextInt();
        int i = 2015-nasc;
        System.out.println("Sua idade e " + i);
        if (i>=18) {
            System.out.println("maior de Idade");
        } else {
            System.out.println("Menor de Idade");
        }
    }
}
