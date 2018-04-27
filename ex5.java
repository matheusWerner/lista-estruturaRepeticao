import javax.swing.JOptionPane;

 public class ex5{

     public static void main (String[] args){

        int numerosoma;
        int numerosub;
        int numeromulti;
        int numerodivi;

        int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
        int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro número"));

        int opcao = Integer.parseInt(JOptionPane.showInputDialog("1 - Somar" + 
                                                   "\n2 - Subtrair" +
                                                   "\n3 - Multiplicar" +
                                                   "\n4 - Dividir" +
                                                   "\n5 - Sair"));


        while (opcao != 5){

            if (opcao == 1){
                 numerosoma = numero1 + numero2;
                 JOptionPane.showMessageDialog(null, "A soma é: " + numerosoma);
             } else if (opcao == 2){
                 numerosub = numero1 - numero2;
                 JOptionPane.showMessageDialog(null, "A subtração é: " + numerosub);

             }else if (opcao == 3){
                 numeromulti = numero1 * numero2;
                 JOptionPane.showMessageDialog(null, "A multiplicação é: " + numeromulti);

             }else if (opcao == 4){
                 numerodivi = numero1 / numero2;
                 JOptionPane.showMessageDialog(null, "A divisão é: " + numerodivi);
             }

 opcao = Integer.parseInt(JOptionPane.showInputDialog("1 - Somar" + 
                                                      "\n2 - Subtrrir" +
                                                      "\n3 - Multiplicar" +
                                                      "\n4 - Dividir" +
                                                      "\n5 - Sair"));


            

        }




     }

 }     