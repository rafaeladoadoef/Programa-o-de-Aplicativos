public class contaBancaria {
    private String numeroConta;
    private String titular;
    private double saldo;
    private double valor;

}

contaBancaria(){

}

public contaBancaria(String numeroConta, String titular, double saldo){
    this.numeroConta = numeroConta;
    this.titular = titular;
    this.saldo = saldo;
}

public void depositar(double valor){
    if(valor > 0){
        this.saldo += valor;
        System.out.println("Deposito realizado com sucesso");
        return;
    }

    System.out.println("Deposito não realizado");

}

public void sacar(double valor){
    if(valor > this.saldo){
        System.out.println("Valor insuficiente");
    }

    this.saldo -= valor;
    
    int c100, c50, c20, c10, c5, c2, c1;
    int r100, r50, r20, r10, r5, r2;

    c100 = (int)valor / 100;
    r100 = (int)valor % 100;

    c50 = (int)c100 / 50;
    r50 = (int)r100 % 50;

    c20 = (int)c50 / 20;
    r20 = (int)r50 % 20;

    c10 = (int)c20 / 10;
    r10 = (int)r20 % 10;

    c5 = (int)c10 / 5;
    r5 = (int)r10 % 5;

    c2 = (int)c5 / 2;
    c2 = (int)r5 % 2;

    c1 = (int)r2 / 1;

    System.out.println("Saque realizado com sucesso");
    System.out.println(r100 + "Cedulas de 100");
    System.out.println(r50 + "Cedulas de 50");
    System.out.println(r20 + "Cedulas de 20");
    System.out.println(r10 + "Cedulas de 10");
    System.out.println(r5 + "Cedulas de 5");
    System.out.println(r2 + "Cedulas de 2");
    System.out.println(r1 + "Cedulas de 1");
}


    public double getSaldo(){
        return this.saldo;
    }


}