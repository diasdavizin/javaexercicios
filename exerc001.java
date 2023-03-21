package somar;
import java.util.Scanner;
public class exerc001 {
    public static void main(String[] args) {
        float n1,n2,soma;
        Scanner teclado=new Scanner(System.in);
        //entrada de dados
        System.out.println("Digite o primeiro numero: ");
        n1=teclado.nextFloat();
        System.out.println("Digite o outro numero: ");
        n2=teclado.nextFloat();
        
        //processamentos
        soma=n1+n2;
        
        //saida
        System.out.println("A soma dos numeros é: "+soma);
   
    }
    
}
