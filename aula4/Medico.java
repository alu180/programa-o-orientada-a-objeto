package aula4;

public class Medico extends Pessoa{
    private String crm;
    private String especialidade;

    Medico(String nome, int idade, String crm, String especialidade) {
        super(nome, idade);
        this.crm = crm;
        this.especialidade = especialidade;
    }

    public void atender(){

        System.out.println("atendendo paciente...");

    }
    //Override

    public void comprimentar(){
        super.comprimentar();
        System.out.println("ola sou dr." +nome +" e tenho a especialidade " +especialidade);

    }




}
