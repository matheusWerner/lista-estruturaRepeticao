import javax.swing.JOptionPane;

 public class ex6{

     public static void main (String[] args){


        int opcao = 0;
 
        double contaTotal = 0;

        int produtos = 0;

        int bolo = 0, sanduiche = 0, pizza = 0, doce = 0;


         while (opcao != 16){

        opcao = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o código do pedido desejado: \n\nCÓDIGO     TIPOS                    NOME                                                                                      VALOR\n\n1 -                BOLOS -              Bolo Brigadeiro -                                                               R$ 29.50\n2 -                BOLOS -              Bolo Floresta Negra -                                                         R$ 2.00\n3 -                BOLOS -              Bolo Leite com Nutell -                                                     R$ 29.23\n4 -                BOLOS -              Bolo Mousse de Chocolate -                                             R$ 7.10\n5 -                BOLOS -              Bolo Nega Maluca -                                                            R$ 19.33\n6 -                DOCES -              Bomba de Creme -                                                             R$ 17.71\n7 -                DOCES -              Bomba de Morango -                                                           R$ 4.82\n8 -                SANDUÍCHES -   Filé Mignon com fritas e cheddar -                                R$ 21.16\n9 -                SANDUÍCHES -   Hamburguer com queijos, champignon e rúcula -    R$ 12.70\n10 -              SANDUÍCHES -   Provolone com salame                                                    R$ 19.70\n11 -              SANDUÍCHES -   Vegetariao de berinjela -                                                 R$ 28.22\n12 -              PIZZAS -              Calabresa -                                                                           R$ 8.98\n13 -              PIZZAS -              Napolitana -                                                                          R$ 0.42\n14 -              PIZZAS -              Peruana -                                                                            R$ 18.36\n15 -              PIZZAS -              Portuguesa -                                                                      R$ 27.50\n\n16 -              SAIR para ver o valor total"));

        if (opcao == 1){
             contaTotal = contaTotal + 29.50;
             produtos = produtos + 1;
             bolo = bolo + 1;
         }
           
        if (opcao == 2){
             contaTotal = contaTotal + 2.00;
             produtos = produtos + 1;
             bolo = bolo + 1;
        }

        if (opcao == 3){
             contaTotal = contaTotal + 29.23;
             produtos = produtos + 1;
             bolo = bolo + 1;
        }

        if (opcao == 4){
             contaTotal = contaTotal + 7.10;
             produtos = produtos + 1;
             bolo = bolo + 1;
        }

        if (opcao == 5){
             contaTotal = contaTotal + 19.33;
             produtos = produtos + 1;
             bolo = bolo + 1;
        }

        if (opcao == 6){
             contaTotal = contaTotal + 17.71;
             produtos = produtos + 1;
             doce = doce + 1;
        }

        if (opcao == 7){
             contaTotal = contaTotal + 4.82;
             produtos = produtos + 1;
             doce = doce + 1;
        }

        if (opcao == 8){
             contaTotal = contaTotal + 21.16;
             produtos = produtos + 1;
             sanduiche = sanduiche + 1;
        }

        if (opcao == 9){
             contaTotal = contaTotal + 12.70;
             produtos = produtos + 1;
             sanduiche = sanduiche + 1;
        }

        if (opcao == 10){
             contaTotal = contaTotal + 19.70;
             produtos = produtos + 1;
             sanduiche = sanduiche + 1;
        }

        if (opcao == 11){
             contaTotal = contaTotal + 28.22;
             produtos = produtos + 1;
             sanduiche = sanduiche + 1;
        }

        if (opcao == 12){
             contaTotal = contaTotal + 8.98;
             produtos = produtos + 1;
             pizza = pizza + 1;
        }

        if (opcao == 13){
             contaTotal = contaTotal + 0.42;
             produtos = produtos + 1;
             pizza = pizza + 1;
        }

        if (opcao == 14){
             contaTotal = contaTotal + 18.36;
             produtos = produtos + 1;
             pizza = pizza + 1;
        }

        if (opcao == 15){
             contaTotal = contaTotal + 27.50;
             produtos = produtos + 1;
             pizza = pizza + 1;
        }

        
         }

         JOptionPane.showMessageDialog(null, "Sua conta total foi: R$" + contaTotal+
                                             "\nTotal de Produtos: " + produtos +
                                             "\nTotal de Bolos: " + bolo +
                                             "\nTotal de Doces: " + doce +
                                             "\nTotal de Sanduíches: " + sanduiche +
                                             "\nTotal de Pizzas: " + pizza +
                                             "\nMédia dos Produtos: R$" + contaTotal/produtos);

     }

 }     