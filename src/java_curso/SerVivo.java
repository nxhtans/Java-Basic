package java_curso;

public abstract class SerVivo {
    // atributos

    protected int idade;

    // construtor
    public SerVivo(int idade) {
        this.idade = idade;
    }

    // métodos
    public abstract void respirar();

    public abstract void reproduzir();

    public abstract void crescer();

    public void dormir() {
        System.out.println("Dormindo");
    }
}
