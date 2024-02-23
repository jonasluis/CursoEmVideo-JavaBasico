public class Vetor01 {
    public static void main(String[] args) {
        int n[] = {4,2,8,7,5,4};
        System.out.println("O total de casa de N " + n.length);

        for(int c=0; c<=n.length-1; c++){
            System.out.println("Na posicao " + c + " temos o valor " + n[c]);
        }
    }
}
