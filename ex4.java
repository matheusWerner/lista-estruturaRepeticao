import javax.swing.JOptionPane;

 public class ex4{

     public static void main (String[] args){

         int quantidade = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de carros que deseja cadastrar"));

         int ano = 0;
         double valor = 0;
         String modelo  = " ";

         int mediaAno = 0;
         double mediaValor = 0;

         int totalAno = 0;
         double totalValor = 0;
         
         int atual = quantidade;

         char letra;
         

         int contaModeloA = 0;
         int contaModeloG = 0;
         


         while (quantidade > 0){
            
            quantidade = quantidade - 1;

            modelo = JOptionPane.showInputDialog("Diga o modelo do carro");

            ano = Integer.parseInt(JOptionPane.showInputDialog("Diga o ano do carro"));

            valor = Double.parseDouble(JOptionPane.showInputDialog("Diga o valor do carro"));


           totalAno = totalAno + ano;
           totalValor = totalValor + valor;
           letra = modelo.charAt(0);
         
    if (letra == 'A' || letra == 'a'){
            contaModeloA = contaModeloA + 1;
           } else if (letra == 'G' || letra == 'g'){
            contaModeloG = contaModeloG + 1;

           }
            
        } 

        mediaAno = totalAno / atual;
        mediaValor = totalValor / atual;

        JOptionPane.showMessageDialog(null, "Média dos anos: " + mediaAno +
                                            "\nMédia dos valores: R$" + mediaValor +
                                            "\nCarros com A: " + contaModeloA +
                                            "\nCarros com G: " + contaModeloG);


     }

 }