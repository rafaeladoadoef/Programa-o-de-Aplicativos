class Animais {

    private String nome;
    private int vezes;

    Animais(String nome, int vezes){
        this.nome = nome;
        this.vezes = vezes;
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public int getVezes(){
        return this.vezes;
    }

    public void setVezes(int vezes){
        this.vezes = vezes;
    }

    

    public void emitirSom(){
}
}