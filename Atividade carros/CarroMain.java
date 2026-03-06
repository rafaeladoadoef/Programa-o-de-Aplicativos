public class MainCarros {
    public static void main(String [] args){

        Carros carrinho = new Carros ("Fiat", 0, 100);

        System.out.println(carrinho.getVelocidade_atual());
        carrinho.acelerar(30);
        carrinho.acelerar(50);
        System.out.println(carrinho.getVelocidade_atual());

        carrinho.Frear(38);
    }
}