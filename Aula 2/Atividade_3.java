import java.util.Scanner;

public class Atividade_3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
            
            
            System.out.println("Digite o valor 1: ");
            int valor1 = sc.nextInt();
            
            System.out.println("Digite o valor 2: ");
            int valor2 = sc.nextInt();
            
            System.out.println("Digite o sinal da operacao: (+, /, *, **, -)");
            String sinal = sc.next();
            
            try{
                switch(sinal){
                    case "+":
                        System.out.println("O resultado da soma e: " + (valor1+valor2));
                        break;
                    case "-":
                        System.out.println("O resultado da subtracao e: " + (valor1=valor2));
                        break;
                    case "*":
                        System.out.println("O resultado da multiplicacao e:" + (valor1*valor2) );
                        break;
                    case "/":
                        System.out.println("O resultado da divisao e: " + (valor1/valor2));
                        break;
                    case "**":
                        System.out.println("O resultado e: " + (valor1*valor1) + ", " + (valor2*valor2));
                        break;
                    
                    default: 
                        System.out.println("Impossível realizar a operacao");
                        break;
                    
                } 
            }catch (Exception e){
                System.out.println("Impossivel dividir por zero.");
            }
    }
}
