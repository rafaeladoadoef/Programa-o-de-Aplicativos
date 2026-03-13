class Cliente extends Pessoa{
    private String email;
    Cliente(String nome, int idade, String email){
        super(nome, idade);
        this.email = email;
    }
    public String getEmail(){
        return this.email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    @Override
    public void exibirDados(){
        System.out.println("Nome do cliente: " +this.getName());
        System.out.println("Idade do cliente: " +this.getIdade());
        System.out.println("email do cliente: " + this.email);
    }
}