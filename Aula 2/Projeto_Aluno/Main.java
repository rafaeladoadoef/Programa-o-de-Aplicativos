class Main{
    public static void main(String[] args){
        Aluno a = new Aluno();

        a.setNome("Albert");

        System.out.println(a.getNome());

        Aluno a2 = new Aluno( "joao", 30, "12345678");

        System.out.println(a2.getNome() + " " + a2.getAge() + " Matricula do aluno: " + a2.getMatricula());
    }
}