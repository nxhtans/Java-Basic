package java_curso;

public class Main {
    public static void main(String[] args) {
        Carro meuCarro1 = new Sandero();
        Carro meuCarro2 = new Symbol();
        meuCarro1.acelerar();
        meuCarro2.acelerar();

        SerVivo meuSer = new Humano();
        meuSer.respirar();

    }
}
