package java_curso;

/**
 * Classe que implementa a interface Carro com diferentes tipos de veículos
 * e seus respectivos limites de velocidade.
 * Esta classe gerencia a velocidade de cada tipo de carro e suas operações básicas.
 */
public class TipoCarro implements Carro {

    /**
     * Enum que define os tipos de carros disponíveis e seus limites de velocidade.
     * Cada tipo tem uma velocidade máxima específica em km/h.
     */
    public enum Tipo {
        SEDAN(180),      // Carro sedan com limite de 180 km/h
        HATCH(160),      // Hatchback com limite de 160 km/h
        SUV(200),        // SUV com limite de 200 km/h
        PICAPE(140),     // Picape com limite de 140 km/h
        CONVERSIVEL(220);// Conversível com limite de 220 km/h

        private final int limiteDeVelocidade;

        /**
         * Construtor do enum que define o limite de velocidade para cada tipo
         * @param limiteDeVelocidade valor máximo de velocidade para o tipo
         */
        Tipo(int limiteDeVelocidade) {
            this.limiteDeVelocidade = limiteDeVelocidade;
            // DEBUG: Criado tipo de carro com limite de velocidade: {limiteDeVelocidade}
        }

        public int getLimiteDeVelocidade() {
            return limiteDeVelocidade;
        }
    }

    private final Tipo tipo;
    private int velocidadeAtual = 0;

    /**
     * Construtor que inicializa um carro com o tipo especificado
     * @param tipo O tipo de carro a ser criado
     */
    public TipoCarro(Tipo tipo) {
        this.tipo = tipo;
        // DEBUG: Carro do tipo {tipo} criado com velocidade inicial: {velocidadeAtual}
    }

    /**
     * Aumenta a velocidade do carro em 10 km/h até atingir o limite
     * do tipo específico do veículo.
     */
    @Override
    public void acelerar() {
        System.out.println(tipo + " acelerando...");
        // DEBUG: Tentando acelerar. Velocidade antes: {velocidadeAtual}, Limite: {tipo.getLimiteDeVelocidade()}

        if (velocidadeAtual < tipo.getLimiteDeVelocidade()) {
            velocidadeAtual += 10;
            // DEBUG: Aumentou velocidade em +10 km/h
            
            if (velocidadeAtual > tipo.getLimiteDeVelocidade()) {
                velocidadeAtual = tipo.getLimiteDeVelocidade();
                // DEBUG: Velocidade limitada ao máximo permitido para este tipo
            }
        } else {
            System.out.println("Velocidade máxima atingida!");
            // DEBUG: Tentativa de acelerar além do limite
        }

        System.out.println("Velocidade atual: " + velocidadeAtual + " km/h");
        // DEBUG: Estado final após aceleração: {velocidadeAtual} km/h
    }

    /**
     * Reduz a velocidade do carro em 10 km/h, não permitindo
     * que a velocidade fique negativa.
     */
    @Override
    public void frear() {
        System.out.println(tipo + " freando...");
        // DEBUG: Iniciando frenagem. Velocidade antes: {velocidadeAtual}
        
        if (velocidadeAtual > 0) {
            velocidadeAtual -= 10;
            // DEBUG: Reduziu velocidade em -10 km/h
            
            if (velocidadeAtual < 0) {
                velocidadeAtual = 0;
                // DEBUG: Correção para evitar velocidade negativa
            }
        }
        System.out.println("Velocidade atual: " + velocidadeAtual + " km/h");
        // DEBUG: Estado final após frenagem: {velocidadeAtual} km/h
    }

    /**
     * Para o carro completamente, zerando sua velocidade.
     */
    @Override
    public void parar() {
        System.out.println(tipo + " parando...");
        // DEBUG: Executando parada completa. Velocidade antes: {velocidadeAtual}
        
        velocidadeAtual = 0;
        System.out.println("Carro parado.");
        // DEBUG: Carro completamente parado, velocidade zerada
    }

    /**
     * Obtém a velocidade atual do carro
     * @return A velocidade atual em km/h
     */
    public int getVelocidadeAtual() {
        // DEBUG: Leitura da velocidade atual: {velocidadeAtual}
        return velocidadeAtual;
    }

    /**
     * Obtém o tipo do carro
     * @return O tipo de carro (SEDAN, HATCH, SUV, etc.)
     */
    public Tipo getTipo() {
        // DEBUG: Leitura do tipo de carro: {tipo}
        return tipo;
    }
}
