class Funcionario extends Pessoa {

    private String cargo;
    Funcionario (String nome, String cargo, int idade){

    super(nome, idade);
    this.cargo = cargo;
    }

    public String getCargo(){
        return this.cargo;
    }

    public void setCargo(String cargo){
        this.cargo = cargo;
    }
    
    @Override
    public void exibirDados(){
        System.out.println("Nome do funcionario: " +this.getName());
        System.out.println("Idade do funcionario: " +this.getIdade());
        System.out.println("Cargo do funcionario: " +this.cargo);
    }


}
