public class OperadoresAritimeticos {

    public static void main(String[] args) {
        
        // int n1 = 3;
        // int n2 = 5;
        // float m = (n1 + n2)/2;
        // System.out.println("A media e igual a " + m ); 

        // int numero = 5;
        // int valor = 5 + ++numero;
        // System.out.println(valor); = 11


        // int numero = 5;
        // int valor = 5 + numero++;
        // System.out.println(valor); = 10


        // int x = 4;
        // x *= 2;
        // System.out.println(x);

        // float v = 8.9f;
        // int ar = (int) Math.floor(v);
         /*
          * floor = 8 arredonda para baixo
          * ceil = 9 arredonda para cima
          * round = 9 arredonda pro mais proximo
          */
        // System.out.println(ar);

        double ale = Math.random();
        //Math.random() gera um numero entre 0 e 1
        int n = (int) (5 + ale * (10 - 5));
        System.out.println(n);

    }
}