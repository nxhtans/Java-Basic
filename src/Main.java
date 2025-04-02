// Metodos e atributos
public class Main {
    // esse método é o ponto de entrada do programa, sendo o primeiro a ser executado
    public static void main(String[] args) {

        // Instanciando objetos da classe Carro
        Carro meuCarro0 = new Carro("Gol");
        Carro meuCarro1 = new Carro("Celta");
        Carro meuCarro2 = new Carro("Fusca");
        Carro meuCarro3 = new Carro("BMW");

        // Acessando o atributo modelo
        String result = meuCarro1.acelerar();
        System.out.println(result);

        meuCarro2.acelerar();
        meuCarro3.acelerar();
        meuCarro0.acelerar();
    }
}

class Carro{
    // atributos são como variáveis de uma classe
    String modelo;

    // métodos são como funções de uma classe
    public Carro(String modelo)
    {
        this.modelo = modelo;
    }

    public String acelerar()
    {
        //System.out.println("Acelerando o carro: " + this.modelo);
        return "Acelerando o carro: " + this.modelo;
    }
}