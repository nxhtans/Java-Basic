package java_curso;

public class Symbol implements Carro
{
    @Override
    public void acelerar() {
        System.out.println("Acelerando a 30 km/h");
    }

    @Override
    public void frear() {
        System.out.println("Freando o carro");
    }

    @Override
    public void parar() {
        System.out.println("Parando o carro");
    }
}
