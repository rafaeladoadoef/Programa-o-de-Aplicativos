class main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        double saque = 0;
        double deposito = 0;


        contaBancaria conta1 = new contaBancaria("9412", "Lobo Santos", 00.00);
        System.out.println(conta1.numeroConta + "do titular " + conta1.titular + " tem um saldo de: " + conta1.saldo());
    }
}