public class Java002 {
    // Método para demonstrar a criação e uso dos carros
    public void demonstrarCarros() {
        System.out.println("\n===== DEMONSTRAÇÃO DE CARROS =====");
        
        // Instanciando objetos da classe Carro
        Carro meuCarro0 = new Carro("Gol");
        Carro meuCarro1 = new Carro("Celta");
        Carro meuCarro2 = new Carro("Fusca");
        Carro meuCarro3 = new Carro("BMW");

        // Acessando o atributo modelo e chamando métodos
        System.out.println("Carros criados:");
        System.out.println("- " + meuCarro0.modelo);
        System.out.println("- " + meuCarro1.modelo);
        System.out.println("- " + meuCarro2.modelo);
        System.out.println("- " + meuCarro3.modelo);
        
        System.out.println("\nAcelerando os carros:");
        System.out.println(meuCarro0.acelerar());
        System.out.println(meuCarro1.acelerar());
        System.out.println(meuCarro2.acelerar());
        System.out.println(meuCarro3.acelerar());
    }
    
    // Método para explicar modificadores de acesso
    public void explicarModificadoresAcesso() {
        System.out.println("\n===== MODIFICADORES DE ACESSO =====");
        System.out.println("• public: Acessível de qualquer lugar");
        System.out.println("• protected: Acessível dentro do pacote e subclasses");
        System.out.println("• default (sem modificador): Acessível apenas dentro do pacote");
        System.out.println("• private: Acessível apenas dentro da classe");
        
        System.out.println("\nExemplo: Na classe Carro, o atributo 'modelo' tem acesso default");
        System.out.println("         O método 'acelerar()' tem acesso public");
    }
}

class Carro {
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
