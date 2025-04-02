package java_curso;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao = 0;
        
        do {
            System.out.println("\n===== MENU PRINCIPAL =====");
            System.out.println("1. Demonstrações básicas de Java");
            System.out.println("2. Demonstrar uso da classe Carro");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            
            try {
                opcao = scanner.nextInt();
                scanner.nextLine(); // Limpar buffer
                
                switch (opcao) {
                    case 1:
                        executarDemonstracoesJava(scanner);
                        break;
                        
                    case 2:
                        demonstrarCarros();
                        break;
                        
                    case 0:
                        System.out.println("Programa finalizado!");
                        break;
                        
                    default:
                        System.out.println("Opção inválida!");
                }
                
            } catch (Exception e) {
                System.out.println("Erro: " + e.getMessage());
                scanner.nextLine(); // Limpar buffer
            }
            
            if (opcao != 0) {
                System.out.println("\nPressione ENTER para voltar ao menu principal...");
                scanner.nextLine();
            }
            
        } while (opcao != 0);
        
        scanner.close();
    }

    // Método para demonstrar a classe Carro
    private static void demonstrarCarros() {
        System.out.println("\n===== DEMONSTRAÇÃO DA CLASSE CARRO =====");
        
        // Criando instâncias de Carro
        Carro carro1 = new Carro("Fusca");
        Carro carro2 = new Carro("Ferrari");
        Carro carro3 = new Carro("Gol");
        
        // Utilizando o método acelerar()
        System.out.println("• Acelerando carros:");
        System.out.println("  " + carro1.acelerar());
        System.out.println("  " + carro2.acelerar());
        System.out.println("  " + carro3.acelerar());
        
        // Acessando o atributo modelo
        System.out.println("\n• Modelos de carros:");
        System.out.println("  Carro 1: " + carro1.modelo);
        System.out.println("  Carro 2: " + carro2.modelo);
        System.out.println("  Carro 3: " + carro3.modelo);
    }
    
    // Métodos incorporados do Java001
    private static void executarDemonstracoesJava(Scanner scanner) {
        int opcao = 0;

        do {
            System.out.println("\n===== MENU DE DEMONSTRAÇÕES JAVA =====");
            System.out.println("1. Tipos de Dados");
            System.out.println("2. Operadores");
            System.out.println("3. Estruturas de Controle");
            System.out.println("4. Arrays");
            System.out.println("5. ArrayList");
            System.out.println("6. Loops");
            System.out.println("7. Casting");
            System.out.println("8. Métodos");
            System.out.println("9. Tratamento de Exceções");
            System.out.println("0. Voltar");
            System.out.print("Escolha uma opção: ");

            try {
                opcao = scanner.nextInt();
                scanner.nextLine(); // Limpar buffer

                switch (opcao) {
                    case 1: demonstrarTiposDados(); break;
                    case 2: demonstrarOperadores(); break;
                    case 3: demonstrarEstruturasControle(); break;
                    case 4: demonstrarArrays(); break;
                    case 5: demonstrarArrayLists(); break;
                    case 6: demonstrarLoops(); break;
                    case 7: demonstrarCasting(); break;
                    case 8: demonstrarMetodos(); break;
                    case 9: demonstrarTratamentoExcecoes(); break;
                    case 0: System.out.println("Voltando ao menu principal..."); break;
                    default: System.out.println("Opção inválida!");
                }
            } catch (InputMismatchException e) {
                System.out.println("Digite um número válido!");
                scanner.nextLine(); // Limpar buffer
                opcao = -1;
            }

            if (opcao != 0) {
                System.out.println("\nPressione ENTER para continuar...");
                scanner.nextLine();
            }

        } while (opcao != 0);
    }

    private static void demonstrarTiposDados() {
        System.out.println("\n===== TIPOS DE DADOS =====");

        // Tipos primitivos
        int idade = 28;
        byte idadeByte = 28;      // -128 até 127
        short idadeShort = 28;    // -32,768 até 32,767
        long idadeLong = 28L;     // -9,223,372,036,854,775,808 até 9,223,372,036,854,775,807
        float altura = 1.69f;     // 32 bits
        double peso = 90.5;       // 64 bits
        char letra = 'A';         // Um único caractere
        boolean verdadeiro = true; // true ou false

        // Inferência de tipo (Java 10+)
        var nomeVariavel = "Nathan";

        // Tipos de referência
        String nome = "Nathan";
        String nomeCompleto = "Nathan Santos";

        System.out.println("• Números inteiros: int=" + idade + ", byte=" + idadeByte +
                ", short=" + idadeShort + ", long=" + idadeLong);
        System.out.println("• Números decimais: float=" + altura + ", double=" + peso);
        System.out.println("• Outros primitivos: char='" + letra + "', boolean=" + verdadeiro);
        System.out.println("• Inferência de tipo: var=" + nomeVariavel);
        System.out.println("• String (referência): " + nomeCompleto);
    }

    private static void demonstrarOperadores() {
        System.out.println("\n===== OPERADORES =====");

        // Operadores aritméticos
        System.out.println("• ARITMÉTICOS");
        int a = 10, b = 3;
        System.out.println("  a = " + a + ", b = " + b);
        System.out.println("  a + b = " + (a + b));
        System.out.println("  a - b = " + (a - b));
        System.out.println("  a * b = " + (a * b));
        System.out.println("  a / b = " + (a / b) + " (divisão inteira)");
        System.out.println("  a % b = " + (a % b) + " (resto da divisão)");

        // Operadores de incremento/decremento
        System.out.println("\n• INCREMENTO/DECREMENTO");
        int c = 5;
        System.out.println("  c = " + c);
        System.out.println("  c++ = " + (c++)); // Usa, depois incrementa
        System.out.println("  c após c++ = " + c);
        System.out.println("  ++c = " + (++c)); // Incrementa, depois usa

        // Operadores relacionais
        System.out.println("\n• RELACIONAIS");
        System.out.println("  a > b: " + (a > b));
        System.out.println("  a >= b: " + (a >= b));
        System.out.println("  a < b: " + (a < b));
        System.out.println("  a <= b: " + (a <= b));
        System.out.println("  a == b: " + (a == b));
        System.out.println("  a != b: " + (a != b));

        // Operadores lógicos
        System.out.println("\n• LÓGICOS");
        boolean x = true, y = false;
        System.out.println("  x = " + x + ", y = " + y);
        System.out.println("  x && y (AND): " + (x && y));
        System.out.println("  x || y (OR): " + (x || y));
        System.out.println("  !x (NOT): " + (!x));
    }

    private static void demonstrarEstruturasControle() {
        System.out.println("\n===== ESTRUTURAS DE CONTROLE =====");

        // if-else
        System.out.println("• IF-ELSE");
        int nota = 75;
        System.out.println("  Nota: " + nota);

        if (nota >= 90) {
            System.out.println("  Conceito A");
        } else if (nota >= 80) {
            System.out.println("  Conceito B");
        } else if (nota >= 70) {
            System.out.println("  Conceito C");
        } else if (nota >= 60) {
            System.out.println("  Conceito D");
        } else {
            System.out.println("  Reprovado");
        }

        // switch-case
        System.out.println("\n• SWITCH-CASE");
        char conceito = 'C';
        System.out.println("  Conceito: " + conceito);

        switch (conceito) {
            case 'A':
                System.out.println("  Excelente!");
                break;
            case 'B':
                System.out.println("  Muito bom!");
                break;
            case 'C':
                System.out.println("  Bom.");
                break;
            case 'D':
                System.out.println("  Regular.");
                break;
            default:
                System.out.println("  Conceito inválido.");
        }

        // Operador ternário
        System.out.println("\n• OPERADOR TERNÁRIO");
        int idade = 17;
        System.out.println("  Idade: " + idade);
        String status = (idade >= 18) ? "Maior de idade" : "Menor de idade";
        System.out.println("  Status: " + status);
    }

    private static void demonstrarArrays() {
        System.out.println("\n===== ARRAYS =====");

        // Declaração e inicialização
        String[] nomes = new String[5];
        int[] idades = new int[5];

        // Inicialização elemento por elemento
        nomes[0] = "Nathan";
        nomes[1] = "Santos";
        nomes[2] = "Silva";
        nomes[3] = "Souza";
        nomes[4] = "Oliveira";

        // Inicialização direta
        idades = new int[]{28, 30, 25, 35, 40};

        // Array multidimensional
        int[][] matriz = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        System.out.println("• Array de nomes (tamanho: " + nomes.length + ")");
        System.out.println("  " + Arrays.toString(nomes));

        System.out.println("• Array de idades");
        System.out.println("  " + Arrays.toString(idades));

        System.out.println("• Matriz (array bidimensional)");
        for (int[] linha : matriz) {
            System.out.println("  " + Arrays.toString(linha));
        }
    }

    private static void demonstrarArrayLists() {
        System.out.println("\n===== ARRAYLIST =====");

        // Criação e adição de elementos
        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("Nathan");
        nomes.add("Santos");
        nomes.add("Silva");

        System.out.println("• Lista inicial: " + nomes);
        System.out.println("• Tamanho: " + nomes.size());
        System.out.println("• Primeiro elemento: " + nomes.get(0));

        // Remoção de elementos
        nomes.remove(0);
        System.out.println("• Após remover o primeiro: " + nomes);

        // Adição de mais elementos
        nomes.add("Oliveira");
        nomes.add("Souza");
        System.out.println("• Lista final: " + nomes);

        // Verificações
        System.out.println("• Contém 'Santos'? " + nomes.contains("Santos"));

        // Usando métodos de List (interface implementada por ArrayList)
        nomes.set(0, "SANTOS"); // Alterando o primeiro elemento
        System.out.println("• Após modificar: " + nomes);

        // Limpando a lista
        nomes.clear();
        System.out.println("• Após limpar a lista: " + nomes + " (tamanho: " + nomes.size() + ")");
    }

    private static void demonstrarLoops() {
        System.out.println("\n===== LOOPS =====");

        List<String> nomes = Arrays.asList("Nathan", "Santos", "Silva", "Oliveira");
        System.out.println("Lista: " + nomes);

        // For tradicional
        System.out.println("\n• FOR TRADICIONAL");
        for (int i = 0; i < nomes.size(); i++) {
            System.out.println("  " + i + " - " + nomes.get(i));
        }

        // For-each
        System.out.println("\n• FOR-EACH");
        for (String nome : nomes) {
            System.out.println("  " + nome);
        }

        // While
        System.out.println("\n• WHILE");
        int contador = 0;
        while (contador < nomes.size()) {
            System.out.println("  " + contador + " - " + nomes.get(contador));
            contador++;
        }

        // Do-while
        System.out.println("\n• DO-WHILE");
        contador = 0;
        do {
            System.out.println("  " + contador + " - " + nomes.get(contador));
            contador++;
        } while (contador < 2); // Executa pelo menos uma vez

        // For com continue e break
        System.out.println("\n• FOR COM CONTINUE E BREAK");
        for (int i = 0; i < nomes.size(); i++) {
            if (i == 1) {
                System.out.println("  (Pulando índice 1 com continue)");
                continue;
            }
            System.out.println("  " + i + " - " + nomes.get(i));
            if (i == 2) {
                System.out.println("  (Parando no índice 2 com break)");
                break;
            }
        }
    }

    private static void demonstrarCasting() {
        System.out.println("\n===== CASTING =====");

        // Casting implícito (widening)
        System.out.println("• CASTING IMPLÍCITO (automático, sem perda de dados)");
        byte valorByte = 10;
        short valorShort = valorByte;  // byte → short
        int valorInt = valorShort;     // short → int
        long valorLong = valorInt;     // int → long
        float valorFloat = valorLong;  // long → float
        double valorDouble = valorFloat; // float → double

        System.out.println("  byte → short → int → long → float → double");
        System.out.println("  " + valorByte + " → " + valorShort + " → " + valorInt +
                " → " + valorLong + " → " + valorFloat + " → " + valorDouble);

        // Casting explícito (narrowing)
        System.out.println("\n• CASTING EXPLÍCITO (manual, possível perda de dados)");
        double d = 100.99;
        float f = (float) d;    // double → float
        long l = (long) f;      // float → long
        int i = (int) l;        // long → int
        short s = (short) i;    // int → short
        byte b = (byte) s;      // short → byte

        System.out.println("  double → float → long → int → short → byte");
        System.out.println("  " + d + " → " + f + " → " + l + " → " + i + " → " + s + " → " + b);

        // Perda de dados em casting
        System.out.println("\n• PERDA DE DADOS EM CASTING");
        double numeroGrande = 130.75;
        byte numeroByte = (byte) numeroGrande; // Perda de precisão e overflow
        System.out.println("  " + numeroGrande + " convertido para byte: " + numeroByte);

        // Conversão entre tipos primitivos e String
        System.out.println("\n• CONVERSÃO ENTRE PRIMITIVOS E STRING");
        String numeroString = "42";
        int numeroConvertido = Integer.parseInt(numeroString);
        System.out.println("  String para int: \"" + numeroString + "\" → " + numeroConvertido);

        String voltarParaString = Integer.toString(numeroConvertido);
        System.out.println("  int para String: " + numeroConvertido + " → \"" + voltarParaString + "\"");
    }

    private static void demonstrarMetodos() {
        System.out.println("\n===== MÉTODOS =====");

        // Chamada de métodos com diferentes tipos de parâmetros
        int soma = somar(10, 20);
        double area = calcularArea(5.0);
        String saudacao = gerarSaudacao("Nathan");

        System.out.println("• Método com retorno int: somar(10, 20) = " + soma);
        System.out.println("• Método com retorno double: calcularArea(5.0) = " + area);
        System.out.println("• Método com retorno String: gerarSaudacao(\"Nathan\") = " + saudacao);

        // Método com número variável de argumentos (varargs)
        System.out.println("• Método com varargs: calcularMedia(8, 9, 7, 10) = " +
                calcularMedia(8, 9, 7, 10));
    }

    // Métodos auxiliares para demonstração
    private static int somar(int a, int b) {
        return a + b;
    }

    private static double calcularArea(double raio) {
        return Math.PI * raio * raio;
    }

    private static String gerarSaudacao(String nome) {
        return "Olá, " + nome + "!";
    }

    private static double calcularMedia(int... notas) {
        int soma = 0;
        for (int nota : notas) {
            soma += nota;
        }
        return (double) soma / notas.length;
    }

    private static void demonstrarTratamentoExcecoes() {
        System.out.println("\n===== TRATAMENTO DE EXCEÇÕES =====");

        // Divisão por zero
        System.out.println("• DIVISÃO POR ZERO");
        try {
            int resultado = 10 / 0;
            System.out.println("  Resultado: " + resultado); // Nunca será executado
        } catch (ArithmeticException e) {
            System.out.println("  Erro: " + e.getMessage());
            System.out.println("  Tratamento: Impossível dividir por zero");
        }

        // Acesso a índice inválido
        System.out.println("\n• ACESSO A ÍNDICE INVÁLIDO");
        try {
            int[] numeros = {1, 2, 3};
            System.out.println("  Valor no índice 5: " + numeros[5]); // Índice inválido
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("  Erro: Índice fora dos limites do array");
            System.out.println("  Mensagem: " + e.getMessage());
        }

        // Conversão inválida
        System.out.println("\n• CONVERSÃO INVÁLIDA");
        try {
            String texto = "abc";
            int numero = Integer.parseInt(texto);
            System.out.println("  Número: " + numero); // Nunca será executado
        } catch (NumberFormatException e) {
            System.out.println("  Erro: Não foi possível converter \"" + "abc" + "\" para número");
        }

        // Finally (sempre executado)
        System.out.println("\n• BLOCO FINALLY");
        try {
            System.out.println("  Tentativa de operação");
            // Simulando uma falha
            throw new Exception("Erro simulado");
        } catch (Exception e) {
            System.out.println("  Capturando erro: " + e.getMessage());
        } finally {
            System.out.println("  O bloco finally sempre é executado");
        }
    }
}
