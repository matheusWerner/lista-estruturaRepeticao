import javax.swing.JOptionPane;

 public class ex3{

     public static void main (String[] args){

         
         double peso = Double.parseDouble(JOptionPane.showInputDialog("Digite seu peso"));
         

         int contador = 0;

         while (peso > 0 && peso < 300){

         contador = contador + 1;
 
         peso = Double.parseDouble(JOptionPane.showInputDialog("Digite seu peso"));

        

         }

         JOptionPane.showMessageDialog(null, "O numero de pessoas que informaram o peso é: " + contador);

     }
 }