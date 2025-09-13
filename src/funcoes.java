public class funcoes {
    public static void main(String[] args) {
        String nomeOriginal = "Lucas";
        saudacao(nomeOriginal);

        //criando o resultado e os valores
        int resultado = soma (2, 3);

        //Imprimindo o valor do resultado da soma
        System.out.println(resultado);
    }
     public static void saudacao (String nomeParametro) {
         //Função para saudação

         System.out.println("Olá" + nomeParametro);
     }

     //retorna o valor de a + b
     public static int soma (int a, int b) {
        return a + b;
     }
}
