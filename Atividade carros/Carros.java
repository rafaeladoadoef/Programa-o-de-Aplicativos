public class Carros {
    private String marca;
    private int velocidade_atual = 0;
    private int velocidade_maxima;
}

Carros {
    this.velocidade_atual = velocidade_atual;
}

Carros(String marca, int velocidade_atual, int velocidade_maxima ){
    this.marca = marca;
    this.velocidade_atual = velocidade_atual;
    this.velocidade_maxima = velocidade_maxima;
}

public void int acelerar(int aceleracao){
    if(aceleracao + velocidade_atual >= this.velocidade_maxima){
        this.velocidade_atual = velocidade_maxima;
        System.out.println("Velociade atual: " + this.velocidade_atual);
        return; 
    } else {
        this.velocidade_atual += aceleracao;
        System.out.println("Velocidade atual: " + this.velocidade_atual);
    }
}

public void Frear (int aceleracao){
    if(aceleracao < 0){
        this.velocidade_atual = 0;
        System.out.println("Velocidade atual: " + this.velocidade_atual);
        return;
    } else {
        this.velocidade_atual += aceleracao;
        System.out.println("Velocidade atual: " + velocidade_atual);
        return;
    }
}

public int getVelocidade_atual (){
    return this.velocidade_atual;
}