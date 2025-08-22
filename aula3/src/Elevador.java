public class Elevador {
    private int capacidadeMaxima;
    private int andarAtual;
    private int totalAndares;
    private int quantidadePessoas;

    int entrar() {
        if (quantidadePessoas < capacidadeMaxima) {
            quantidadePessoas++;
            return quantidadePessoas;
        } else {
            System.out.println("Elevador cheio.");
            return quantidadePessoas;
        }
    }

    int sair() {
        if (quantidadePessoas > 0) {
            quantidadePessoas--;
            return quantidadePessoas;
        } else {
            System.out.println("Elevador vazio.");
            return quantidadePessoas;
        }
    }

    int subir() {
        if (andarAtual < totalAndares) {
            andarAtual++;
            return andarAtual;
        } else {
            System.out.println("Já está no último andar");
            return andarAtual;
        }
    }

    int descer() {
        if (andarAtual > 0) {
            andarAtual--;
            return andarAtual;
        } else {
            System.out.println("Já está no térreo");
            return andarAtual;
        }
    }


    public Elevador() {
        this.capacidadeMaxima = 10;
        this.andarAtual = 0;
        this.totalAndares = 6;
        this.quantidadePessoas = 0;
    }

    
    public static void main(String[] args) {
        
        Elevador elevador = new Elevador();

        
        System.out.println("Entrando no elevador: " + elevador.entrar());
        System.out.println("Subindo: " + elevador.subir());
        System.out.println("Entrando no elevador: " + elevador.entrar());
        System.out.println("Saindo do elevador: " + elevador.sair());
        System.out.println("Descendo: " + elevador.descer());
        System.out.println("Entrando no elevador: " + elevador.entrar());
    }





}
