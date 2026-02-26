import java.util.Scanner;

public class Atividade_2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int[] inteiro = new int[4];
        int i = 0;
        int adicao = 0;
        
        while(i < 4){
            int valor = 0;
            System.out.println("Informe o valor: "+ (i+1));
            try {
                valor = sc.nextInt();
                inteiro[i] = valor;
                
                if(valor % 2 == 0){
                    adicao+=valor;
                } 
            } catch (Exception e){
                System.out.println("Digite um valor inteiro");
                
                sc.nextLine();
                continue;
            } i++;
            System.out.println("A soma dos valores pares é: " + adicao);
        }
    }
}
