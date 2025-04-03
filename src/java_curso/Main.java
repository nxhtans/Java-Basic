package java_curso;

public class Main {
    public static void main(String[] args) {
        TipoCarro sedan = new TipoCarro(TipoCarro.Tipo.SEDAN);
        TipoCarro suv = new TipoCarro(TipoCarro.Tipo.SUV);

        sedan.acelerar(); // Limite: 180 km/h
        suv.acelerar();   // Limite: 200 km/h

        System.out.println("Limite do " + sedan.getTipo() + ": " + sedan.getTipo().getLimiteDeVelocidade() + " km/h");
        System.out.println("Limite do " + suv.getTipo() + ": " + suv.getTipo().getLimiteDeVelocidade() + " km/h");

    }
}
