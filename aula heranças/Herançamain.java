public class Herançamain {

    public static void main (String [] args){
        Funcionario funcio1 = new Funcionario("Rafael", "Embaixador", 19);
        Cliente clie1 = new Cliente ("Yu", 19, "inteligencio@gmail.com");

        funcio1.exibirDados();
        clie1.exibirDados();
    }
}