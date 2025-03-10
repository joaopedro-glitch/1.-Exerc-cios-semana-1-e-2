
import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);
        Boolean menu = true, calc;
        int opcao, par, cod1, cod2, qtde1, qtde2, operacao;
        float ipi, preco1, preco2, valor1, valor2, resultado;
        int[] vetor = new int[10];

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = i + 1;
        }

        while (menu) {
            System.out.println("Escolha uma opção a baixo: \n" +
            "1 - Pares ou impares\n" +
            "2 - Produtos\n" +
            "3 - Calculadora\n" +
            "0 - Encerrar\n" 
            );
            opcao = entrada.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Escolha 2 para exibir os numeros pares e 1 para exibir os numeros impares: ");
                    par = entrada.nextInt();
                    for (int v : vetor) {
                        if ((v % 2) == 0 && par == 2) {
                            System.out.println("Pares " + v);    
                        } else if ((v % 2) == 1 && par == 1) {
                            System.out.println("Impares " + v);
                        }
                    }
                    System.out.println();
                    
                break;
                case 2: 
                    System.out.println("Digite o IPI: ");
                    ipi = entrada.nextFloat();

                    System.out.println("Digite o código do produto 1: ");
                    cod1 = entrada.nextInt();
                    System.out.println("Digite o preço do produto 1: ");
                    preco1 = entrada.nextFloat();
                    System.out.println("Digite a quantidae do produto 1: ");
                    qtde1 = entrada.nextInt();

                    System.out.println("Digite o código do produto 2: ");
                    cod2 = entrada.nextInt();
                    System.out.println("Digite o preço do produto 2: ");
                    preco2 = entrada.nextFloat();
                    System.out.println("Digite a quantidae do produto 2: ");
                    qtde2 = entrada.nextInt();

                    System.out.printf("Produto %d valor R$ %.2f e quantidade %d\n", cod1, preco1, qtde1);
                    System.out.printf("Produto %d valor R$ %.2f e quantidade %d\n", cod2, preco2, qtde2);
                    System.out.printf("Com IPI de %.0f ficou no total de: R$ %.2f \n\n", ipi, ((preco1 * qtde1) + (preco2 * qtde2)) * ((ipi/100)+1) );
                break;

                case 3:
                    calc = true;
                    while (calc) {
                        System.out.println(
                            "Escolha uma operação: \n" +
                            "1 - Soma\n " +
                            "2 - Subtração\n" +
                            "3 - Divisão\n" +
                            "4 - Multiplicação\n" +
                            "5 - Potenciação\n" +
                            "9 - Voltar ao menu principal\n" +
                            "0 - Encerrar o programa"
                        );
                        operacao = entrada.nextInt();

                        switch (operacao) {
                            case 1: 
                            valor1 = pedirUmFloat("1");
                            valor2 = pedirUmFloat("2");
                            resultado = valor1 + valor2;
                            System.out.println("O resultado da soma é: " + resultado);
                            System.out.println();
                            break;
                            
                            case 2: 
                            valor1 = pedirUmFloat("1");
                            valor2 = pedirUmFloat("2");
                            resultado = valor1 - valor2;
                            System.out.println("O resultado da subtração é: " + resultado);
                            System.out.println();
                            break;

                            case 3: 
                            valor1 = pedirUmFloat("1");
                            valor2 = pedirUmFloat("2");
                            resultado = valor1 / valor2;
                            System.out.println("O resultado da divisão é: " + resultado);
                            System.out.println();
                            break;

                            case 4: 
                            valor1 = pedirUmFloat("1");
                            valor2 = pedirUmFloat("2");
                            resultado = valor1 * valor2;
                            System.out.println("O resultado da multiplicação é: " + resultado);
                            System.out.println();
                            break;

                            case 5: 
                            valor1 = pedirUmFloat("1");
                            valor2 = pedirUmFloat("2");
                            resultado = (float) Math.pow(valor1, valor2);
                            System.out.println("O resultado da potenciação é: " + resultado);
                            System.out.println();
                            break;

                            case 9:
                                calc = false;
                            break;

                            case 0:
                                calc = false;
                                menu = false;
                                encerrar();
                            break;

                            default:
                                System.out.println("Escolha uma operação válida");
                            break;
                        }
                    }    

                break;

                case 0: 
                    menu = false;
                    encerrar();
                break;

                default:
                    System.out.println("Digite uma opção válida");
                break;
            }
        }
        entrada.close();
    }

    public static float pedirUmFloat(String texto){
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite um valor " + texto);

        return entrada.nextFloat();
    }

    public static void encerrar(){
        System.out.println("O programa será encerrado");
    }


}
