public class Methods {
            
    public static double retornaPi(){
        return 3.14;
    }

    public static int retornaFatorial(int num){ 
        int mult = 1;

        for (int i = 1; i <= num; i++) {
            mult *= i;
            // System.out.println(mult);
        }
        return mult;
    }

    public static int maiorVetor(int[] vet){
        int maior = vet[0];

        for (int i = 0; i < vet.length; i++) {
            if (vet[i] > maior) {
                maior = vet[i];    
            }
        }
        return maior;
    }
    
    public static float somaVetor(float[] vet){
        float soma = 0;
        
        for (int i = 0; i < vet.length; i++) {
            soma += vet[i];
        }
        return soma;
    }

    public static String retornaDados(String nome, String sobrenome, int ddd, int telefone){
        return String.format(
            """
            Nome: %s 
            Sobrenome: %s
            DDD: %d 
            Telefone: %d           
            """, 
            nome, sobrenome, ddd, telefone);
    }

    public static void encerrar(){
        System.out.println("O programa será encerrado");
    }
}
