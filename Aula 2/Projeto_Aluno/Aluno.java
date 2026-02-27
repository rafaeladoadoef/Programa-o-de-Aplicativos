public class Aluno{
        private String nome;
        private int age;
        private String matricula;

        public  Aluno(){

        }
        public Aluno(String nome, int age, String matricula){
          this.nome = nome;
          this.age = age;
          this.matricula = matricula;  
        }

        public String getNome(){
          return this.nome;
        }

        public void setNome(String nome){
          this.nome = nome;
        }

        public int getAge(){
          return this.age;
        }
        
        public void setAge(int age){
          this.age = age;
        }

        public String getMatricula(){
          return this.matricula;
        }

        public void setMatricula(String matricula){
          this.matricula = matricula;
        }
}       
