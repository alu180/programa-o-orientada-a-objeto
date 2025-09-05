package aula4;

public class Medico extends Pessoa{ //coloca a classe medico como uma subclasse de pessoa
    private String crm;
    private String especialidade;
    //atributos privados da classe medico

    Medico(String nome, int idade, String crm, String especialidade) {
        super(nome, idade); //chama o construtor da superclasse pessoa
        this.crm = crm;
        this.especialidade = especialidade;
    }

    public void atender(){

        System.out.println("atendendo paciente...");

    }
    @Override //sobreescreve o metodo comrlimentar de pessoa
    public void comprimentar(){
        //super.comprimentar();
        System.out.println("ola sou dr." +nome +" e tenho a especialidade " +especialidade);

    }




}
