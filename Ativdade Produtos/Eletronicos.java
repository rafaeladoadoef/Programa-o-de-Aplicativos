class Eletronicos extends Produtos { 
    private String garantia;
    Eletronicos(String nome, float preco, String garantia){
        super(nome, preco);
        this.garantia = garantia;
    }

    public String getGarantia(){
        return this.garantia;
    }

    public void setGarantia(String garantia){
        this.garantia = garantia;
    }

    @Override
    public void exibirInfo(){
        System.out.println("Nome do Eletronico: " + this.getNome());
        System.out.println("Preco do Eletronico: " +this.getPreco());
        System.out.println("Tempo de Garantia: " +this.garantia);
    }

}