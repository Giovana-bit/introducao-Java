public class tratamentoDeErros {
    public static void main(String[] args) {
        /*
        Tratamento de Erro
        - Exceções
        - Bloco try-catch-finally

        try {
            // código a ser executado e verificado se haverá exceção
        } catch(Exception e) {
            // tratamento de erro a ser executado
        } finally {
            // códigos que sempre serão executados
        }
        */

        try {
                int resultado = dividir(10, 0);
                System.out.println("Resultado: " + resultado);
            } catch (ArithmeticException e) { // ArithmeticException = trata erros aritméticos
                System.out.println("Erro ao dividir por zero");
            } finally {
                System.out.println("Bloco finally em execução");
            }
        }

        public static int dividir(int a, int b) {
            return a / b;
        }
    }
