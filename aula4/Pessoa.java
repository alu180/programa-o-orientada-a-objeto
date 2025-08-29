package aula4;

public class Pessoa {
    protected String nome;
    private int idade;

    Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void comprimentar() {
        System.out.println("ola, tudo bem?, meu nome e " +nome + " e tenho " + idade +" anos." );

    }

}
