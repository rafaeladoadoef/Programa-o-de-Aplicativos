public class AnimalMain {

    public static void main(String [] args){
        Animais cat1 = new Gato("Mingau", 3);
        Animais dog1 = new Cachorro("Pops", 4);

        dog1.emitirSom();
        cat1.emitirSom();
    }
}