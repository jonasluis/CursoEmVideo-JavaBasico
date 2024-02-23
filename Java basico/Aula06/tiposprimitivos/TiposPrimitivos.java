import java.util.Scanner;

public class TiposPrimitivos {
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o nome do aluno: ");
        String nome = teclado.nextLine();
        System.out.print("Digite o valor da nota: ");
        float nota = teclado.nextFloat();
        System.out.format("A nota de %s e %1f \n ", nome, nota);
    }
}
