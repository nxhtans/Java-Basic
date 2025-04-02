package java_curso;

public class Carro {
    // atributos são como variáveis de uma classe
    String modelo;

    // métodos são como funções de uma classe
    public Carro(String modelo) {
        this.modelo = modelo;
    }

    public String acelerar() {
        return "Acelerando o carro: " + this.modelo;
    }
}
