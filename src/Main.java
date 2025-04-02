import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao = 0;
        
        do {
            System.out.println("\n===== MENU PRINCIPAL =====");
            System.out.println("1. Executar Java001 (Demonstrações básicas de Java)");
            System.out.println("2. Executar Java002 (Demonstrações de classes e objetos)");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            
            try {
                opcao = scanner.nextInt();
                scanner.nextLine(); // Limpar buffer
                
                switch (opcao) {
                    case 1:
                        Java001 demo1 = new Java001();
                        System.out.println("\n1. Executar menu interativo");
                        System.out.println("2. Executar todas as demonstrações");
                        System.out.print("Escolha: ");
                        int subOpcao = scanner.nextInt();
                        scanner.nextLine(); // Limpar buffer
                        
                        if (subOpcao == 1) {
                            demo1.executarDemonstracoes();
                        } else if (subOpcao == 2) {
                            demo1.executarTodasDemonstracoes();
                        }
                        break;
                        
                    case 2:
                        Java002 demo2 = new Java002();
                        System.out.println("\n1. Demonstrar carros");
                        System.out.println("2. Explicar modificadores de acesso");
                        System.out.print("Escolha: ");
                        subOpcao = scanner.nextInt();
                        scanner.nextLine(); // Limpar buffer
                        
                        if (subOpcao == 1) {
                            demo2.demonstrarCarros();
                        } else if (subOpcao == 2) {
                            demo2.explicarModificadoresAcesso();
                        }
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
}
