package exerc001s;
import java.util.Scanner;
public class Exerc001S {
    public static void main(String[] args) {
        
        //variaveis
        double salario,salarionovo;
        Scanner teclado=new Scanner (System.in);

                
        //entrada de dados
        System.out.println("Digite seu salário: ");
        salario=teclado.nextDouble();
        
        //processamentos
        if (salario>=1000){
        salarionovo=salario+(salario*0.10);
        System.out.println("O valor do seu salário é de: "+salarionovo);
        
        }else { 
        salarionovo=salario+(salario*0.35);
        System.out.println("O valor do seu salário é de:  "+salarionovo);
        
        }
     
        }
         
    }
