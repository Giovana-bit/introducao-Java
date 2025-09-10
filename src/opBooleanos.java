public class opBooleanos {
    public static void main(String[] args) {
        //boolean armazena dados falsos ou verdadeiros(0 ou 1)
        //Operadores aritméticos
        boolean resultado = true;

        System.out.println(resultado);

        //Operadores Lógicos
        //Ida para a praia exemplo
        boolean fimDeSemana = true;
        boolean fazendoSol = true;
        boolean vamosAPraia = fimDeSemana && fazendoSol;

        System.out.println(vamosAPraia);

        //Operador alternario (?)
        String menssagem = fimDeSemana ? "É fim de semana" : "Não é fim de semana";  //Valores caso sejam verdedeiros ou falsos44
        System.out.println(menssagem);

        //Tabela verdade
        //Operador && (AND)
        //True && True = true
        //True && false = false
        //False && true = false
        //False && false = false

        //Operador || (OR)
        //True || True = true
        //True || false = true
        //False || true = true
        //False || false = false

    }
}
