package aula4;
public class App {
    public static void main(String[] args) {

       // Medico m1 = new Pessoa("Ana", 25); // nem toda pessoa e medico mais todo medico e uma pessoa.

       Pessoa m2 = new Medico("Carlos", 45, "12345-DF", "Cardiologia");
       m2.comprimentar();
       ((Pessoa)m2).comprimentar();
       //m2.atender();
       ((Medico)m2).atender();

       //Medico m3 = m2; //precisa da conversao
       Medico m3 = (Medico)m2; //isso e a conversao
       m3.atender();

       Pessoa p1 = new Pessoa("Caio", 25);
       p1.comprimentar();
       //((Medico)p1).comprimentar();





    }
}
