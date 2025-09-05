package aula4;
public class App {
    public static void main(String[] args) {

       // Medico m1 = new Pessoa("Ana", 25); // nem toda pessoa e medico mais todo medico e uma pessoa ou seja viola hierarquia de heranca

       Pessoa m2 = new Medico("Carlos", 45, "12345-DF", "Cardiologia"); //cria um objeto medico e coloca dentro de uma variavel pessoa ou seja fala que o objeto medico e um tipo de pessoa o que segue a hierarquia isso e polimorfismo
       m2.comprimentar(); //m2 e na verdade um medico o que significa que ira sobreescrever o metodo comprimentar de pessoa com o do medico
       ((Pessoa)m2).comprimentar(); // faz uma conversao de m2(medico) para pessoa e chama o metodo comprimentar porem o resultado e o mesmo do anterior pois o objeto na memoria continua sendo medico isso e polimorfismo
       //m2.atender(); //a variável m2 é uma variavel do tipo Pessoa e Pessoa não tem o método atender() Mesmo o objeto sendo Medico a referencia sendo pessoa significa que da erro de compilacao
       ((Medico)m2).atender(); //faz conversao de m2 para medico para atender isso funciona pois o objeto real e medico

       //Medico m3 = m2; //precisa da conversao
       Medico m3 = (Medico)m2; //isso e a conversao
       m3.atender(); //chama atender atraves de m3 que no passo anterior foi convertido de m2 tipo pessoa para m3 tipo medico

       Pessoa p1 = new Pessoa("Caio", 25); //cria uma pessoa
       p1.comprimentar(); // chama o metodo comprimentar de pessoa
       //((Medico)p1).comprimentar(); tentaria fazer a conversao de p1(pessoa) para o tipo medico o que gera um erro de execucao pois nem toda pessoa e um medico (hierarquia)
    







    }
}
