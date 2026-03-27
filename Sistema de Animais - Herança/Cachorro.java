class Cachorro extends Animais {
    
    Cachorro(String nome, int vezes){
        super(nome, vezes);
    }

    @Override
    public void emitirSom(){
    System.out.println("au au " + this.getVezes());
}
}