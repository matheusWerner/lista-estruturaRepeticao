import javax.swing.JOptionPane;

 public class ex7{

     public static void main (String[] args){


         String nome = "";
         String sexo = "";
         double peso = 0;
         int idade = 0;
         double altura = 0;
         int gols = 0;
         int vermelho = 0;
         int amarelo = 0;
         int contador = 0;
         double menorPeso = 0;
         double maiorAltura = 0;
         String maiorNome = "";
         int qtdMasc = 0;
         int qtdFem = 0;
         int menorAmarelo = 0;
         String menorNome = "";
         double maiorPeso = 0;
         int maiorVermelho = 0;
         int maiorAmarelo = 0;
         int menorVermelho = 0;



         while (contador <= 2){

             nome = JOptionPane.showInputDialog("Digite seu nome");
             sexo = JOptionPane.showInputDialog("Digite seu sexo");
             peso = Double.parseDouble(JOptionPane.showInputDialog("Digite seu peso"));
             idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade"));
             altura = Double.parseDouble(JOptionPane.showInputDialog("Digite sua altura"));
             gols = Integer.parseInt(JOptionPane.showInputDialog("Gols marcados"));
             vermelho = Integer.parseInt(JOptionPane.showInputDialog("Cartões vermelhos"));
             amarelo = Integer.parseInt(JOptionPane.showInputDialog("Cartõe amarelos"));

             contador = contador + 1;

         if (maiorPeso < peso){
             maiorPeso = peso;
         } 


         if (maiorAltura < altura){
             maiorAltura = altura;
         }

         if (sexo.equals("Feminino") || sexo.equals("feminino")){
             qtdFem = qtdFem + 1;

         }
         if (sexo.equals("Masculino") || sexo.equals("masculino")){
             qtdMasc = qtdMasc + 1;

         }

         }


         JOptionPane.showMessageDialog(null, "Maior Peso: " + maiorPeso +
                                             "\nMenor Peso: " + menorPeso +
                                             "\nMaior Altura: " + maiorAltura +
                                             "\nAtletas Masculinos: " + qtdMasc +
                                             "\nAtletas Femininos: " + qtdFem);


     }

 }