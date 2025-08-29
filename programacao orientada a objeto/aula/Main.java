class Aluno {
    String nome;
    int idade;
    String curso;

    void apresentar() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Curso: " + curso);
    }
}
class Livro {
    String titulo;
    String autor;
    int ano;

    void exibir() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Ano: " + ano);
    }
}
class retangulo {
    double comprimento;
    double largura;

    void apresentar() {
        System.out.println("Comprimento: " + comprimento);
        System.out.println("Largura: " + largura);
    }
    void calcularArea() {
        double area = comprimento * largura;
        System.out.println("area do retângulo: " + area);
    }
}
class triangulo {
    double ladoA;
    double ladoB;
    double ladoC;

    void apresentar() {
        System.out.println("Lado A: " + ladoA);
        System.out.println("Lado B: " + ladoB);
        System.out.println("Lado C: " + ladoC);
    }
    boolean formaTriangulo() {
        return (ladoA + ladoB > ladoC && ladoA + ladoC > ladoB && ladoB + ladoC > ladoA);
        }
     String obterTipo() {
        if (!formaTriangulo()) {
            return "null";
        } else if (ladoA == ladoB && ladoB == ladoC) {
            return "Triangulo Equilatero";
        } else if (ladoA == ladoB || ladoB == ladoC || ladoA == ladoC) {
            return "Triangulo Isosceles";
        } else {
            return "Triangulo Escaleno";
        }
    }
}



public class Main {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno();
        aluno1.nome = "aluisio";
        aluno1.idade = 25;
        aluno1.curso = "ciencia da computacao";
        aluno1.apresentar();

        Livro livro1 = new Livro();
        livro1.titulo = "the new world";
        livro1.autor = "Moonsoon";
        livro1.ano = 2025;
        livro1.exibir();

        retangulo retangulo1 = new retangulo();
        retangulo1.comprimento = 10;
        retangulo1.largura = 5;
        retangulo1.apresentar();
        retangulo1.calcularArea();

        triangulo triangulo1 = new triangulo();
        triangulo1.ladoA = 3;
        triangulo1.ladoB = 4;
        triangulo1.ladoC = 5;
        triangulo1.apresentar();
        System.out.println(triangulo1.formaTriangulo());
        System.out.println("tipo do triangulo: " +triangulo1.obterTipo());

        triangulo triangulo2 = new triangulo();
        triangulo2.ladoA = 5;
        triangulo2.ladoB = 5;
        triangulo2.ladoC = 5;
        triangulo2.apresentar();
        System.out.println(triangulo2.formaTriangulo());
        System.out.println("tipo do triangulo: " +triangulo2.obterTipo());

        triangulo triangulo3 = new triangulo();
        triangulo3.ladoA = 5;
        triangulo3.ladoB = 5;
        triangulo3.ladoC = 3;
        triangulo3.apresentar();
        System.out.println(triangulo3.formaTriangulo());
        System.out.println("tipo do triangulo:" +triangulo3.obterTipo());

        triangulo triangulo4 = new triangulo();
        triangulo4.ladoA = 1;
        triangulo4.ladoB = 3;
        triangulo4.ladoC = 5;
        triangulo4.apresentar();
        System.out.println(triangulo4.formaTriangulo());
        System.out.println("tipo do triangulo:" +triangulo4.obterTipo());
    }
}

