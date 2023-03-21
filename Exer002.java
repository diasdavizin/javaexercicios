package exer002;
import java.util.Scanner;
public class Exer002 {
      public static void main(String[] args) {
        
        //variaveis
        float numero,porcentagem;
        Scanner scanner=new Scanner(System.in);
           
        //entrada de dados
        System.out.print("Digite um número: ");
        numero=scanner.nextFloat();
             
             
        //processamentos
        porcentagem=numero*25/100;
             
        //saida
        System.out.print("A porcentagem é de: "+ porcentagem);
        System.out.println("%");
      }
    
}