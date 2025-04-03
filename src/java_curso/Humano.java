package java_curso;

public class Humano extends SerVivo {

    public Humano() {
        super(18);
    }

    @Override
    public void respirar() {
        System.out.println(this.idade);
        System.out.println("Respirando ar");
    }

    @Override
    public void reproduzir() {
        System.out.println("Reproduzindo");
    }

    @Override
    public void crescer() {
        System.out.println("Crescendo");
    }
}
