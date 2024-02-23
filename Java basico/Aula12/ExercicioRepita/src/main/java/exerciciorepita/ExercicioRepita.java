/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package exerciciorepita;

import javax.swing.JOptionPane;

/**
 *
 * @author Jonas
 */
public class ExercicioRepita {

    public static void main(String[] args) {
       int n, s = 0;
       do{
           n = Integer.parseInt(JOptionPane.showInputDialog(null, 
                   "<html>Informe um numero: <br><em>(valor 0 interrompe)</em></html> "));
           s += n;
       } while (n != 0);
       JOptionPane.showInputDialog(null, "<html>Resultado final <br>--------------" +
               "<br>Somatorio vale " + s);
    }
}
