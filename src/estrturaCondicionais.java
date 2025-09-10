public class estrturaCondicionais {
    public static void main(String[] args) {
        // aluno aprovado ou não
        int nota = 70;
        String graduacao;

        // if-else simples
        if (nota >= 70) {
            System.out.println("Aluno aprovado");
        } else {
            System.out.println("Aluno reprovado");
        }

        // Graduação (A:80, B:70, C:60, D)
        if (nota >= 80) {
            graduacao = "A";
        } else if (nota >= 70) {
            graduacao = "B";
        } else if (nota >= 60) {
            graduacao = "C";
        } else if (nota >= 0) {
            graduacao = "D";
        } else {
            graduacao = "";
        }

        // switch
        switch (graduacao) {
            case "A":
            case "B":
                System.out.println("Aluno aprovado");
                break;
            case "C":
            case "D":
                System.out.println("Aluno reprovado");
                break;
                default:
                    System.out.println("Graduação inválida");
                }
            }
        }
