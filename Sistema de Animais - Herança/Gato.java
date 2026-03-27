class Gato extends Animais {

    Gato(String nome, int vezes){
        super(nome, vezes);
    }
    
    @Override
    public void emitirSom(){
        System.out.println("Miau " + this.getVezes());
    }
}