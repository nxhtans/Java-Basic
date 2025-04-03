package java_curso;

public class TipoCarro implements Carro {

    public enum Tipo {
        SEDAN(180),
        HATCH(160),
        SUV(200),
        PICAPE(140),
        CONVERSIVEL(220);

        private final int limiteDeVelocidade;

        Tipo(int limiteDeVelocidade) {
            this.limiteDeVelocidade = limiteDeVelocidade;
        }

        public int getLimiteDeVelocidade() {
            return limiteDeVelocidade;
        }
    }

    private final Tipo tipo;
    private int velocidadeAtual = 0;

    public TipoCarro(Tipo tipo) {
        this.tipo = tipo;
    }

    @Override
    public void acelerar() {
        System.out.println(tipo + " acelerando...");

        if (velocidadeAtual < tipo.getLimiteDeVelocidade()) {
            velocidadeAtual += 10;
            if (velocidadeAtual > tipo.getLimiteDeVelocidade()) {
                velocidadeAtual = tipo.getLimiteDeVelocidade();
            }
        } else {
            System.out.println("Velocidade máxima atingida!");
        }

        System.out.println("Velocidade atual: " + velocidadeAtual + " km/h");
    }

    @Override
    public void frear() {
        System.out.println(tipo + " freando...");
        if (velocidadeAtual > 0) {
            velocidadeAtual -= 10;
            if (velocidadeAtual < 0) {
                velocidadeAtual = 0;
            }
        }
        System.out.println("Velocidade atual: " + velocidadeAtual + " km/h");
    }

    @Override
    public void parar() {
        System.out.println(tipo + " parando...");
        velocidadeAtual = 0;
        System.out.println("Carro parado.");
    }

    public int getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public Tipo getTipo() {
        return tipo;
    }
}
