class Produtos {
    private String nome;
    private float preco;

    Produtos(String nome, float preco){
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public float getPreco(){
        return this.preco;
    }

    public void setPreco(float preco){
        this.preco = preco;
    }

    public void exibirInfo(){
        System.out.println("Nome do produto: " +this.getNome());
        System.out.println("Preco do produto: " +this.getPreco());
    }
}