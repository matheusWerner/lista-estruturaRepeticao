import javax.swing.JOptionPane;

 public class ex1{

     public static void main (String[] args){


          String nome = JOptionPane.showInputDialog("Digite seu nome");


          while (!nome.equalsIgnoreCase("fim")){


          nome = JOptionPane.showInputDialog("Digite seu nome");

        }

            


     }
 }