import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       	Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        boolean menu = true;
        int opcao;

        while(menu){
            System.out.println("Escolha uma opção a baixo: \n" +
            "1 - Exibir valor de PI\n" +
            "2 - Calcular fatorial\n" +
            "3 - Verificar maior valor de um vetor inteiro\n" +
            "4 - Exibir a soma de um vetor float\n" +
            "5 - Exibir dados do cliente\n" +
            "0 - Encerrar\n" 
            );
            opcao = sc.nextInt();
            
            switch (opcao) {

                case 1:
    
                    System.out.println("PI: " + Methods.retornaPi()); // Imprime 3.14
                    System.out.println();

                break;

                case 2:
            
                    System.out.println("Entre com o numero que deseja calcular o fatorial: ");
                    int num = sc.nextInt();

                    System.out.println("O fatorial de " + num + " é: " + Methods.retornaFatorial(num));
                    System.out.println();
                break;
                
                case 3:
                    System.out.println("Quantos elementos terá o vetor?");
                    int tamanho = sc.nextInt();
                    
                    int[] numeros = new int[tamanho];
                    
                    for (int i = 0; i < tamanho; i++) {
                        System.out.printf("Entre com o valor %d: ", i + 1);
                        numeros[i] = sc.nextInt();
                    }
                    
                    System.out.println("O maior valor da array é: " + Methods.maiorVetor(numeros));
                    System.out.println();
                break;
                
                case 4:
                    System.out.println("Quantos elementos terá o vetor float?");
                    int tamanhoFloat = sc.nextInt();
                    sc.nextLine();
                    
                    float[] numerosFloat = new float[tamanhoFloat];
                    
                    for (int i = 0; i < tamanhoFloat; i++) {
                        System.out.printf("Entre com o valor %d: ", i + 1);
                        numerosFloat[i] = sc.nextFloat();
                        sc.nextLine();
                    }

                    System.out.printf("A soma dos valores dos valores do vetor é %.2f\n", Methods.somaVetor(numerosFloat));
                    System.out.println();
                break;      

                case 5:
                sc.nextLine();

                    System.out.println("Digite o nome do cliente: ");
                    String nome = sc.nextLine();

                    System.out.println("Digite o sobrenome:");
                    String sobrenome = sc.nextLine();

                    System.out.println("Digite o DDD: ");
                    int ddd = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Digite o numero do telefone: ");
                    int telefone = sc.nextInt();
                    sc.nextLine();

                    System.out.println();
                    System.out.printf("Dados do cliente:\n%s", Methods.retornaDados(nome, sobrenome, ddd, telefone));
                    System.out.println();
                break;
            
                case 0: 
                    menu = false;
                    Methods.encerrar();
                break;    

                default:
                    System.out.println("Digite uma opção válida");
                break;
            }
        }

   sc.close(); 
    }
}
