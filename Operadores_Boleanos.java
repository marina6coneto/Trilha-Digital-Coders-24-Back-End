public class Operadores_Boleanos {
    public static void main(String[] args) {
        boolean fimDeSemana = true;
        boolean fazendoSol = true; 
        boolean vamosAPraia = fimDeSemana && fazendoSol;
        System.out.println(vamosAPraia);
        String mensagem = fimDeSemana ? "É fim de semana" : "Não é Final de Semana";
        System.out.println(mensagem);

        // tabela verdade

        // operador && (AND)
        // true && true = true
        // true && false = false
        // false && true = false
        // false && false = false

        // operador || (OR)
        // true || true = true
        // true || false = true
        // false || true = true
        // false || false = false



    }

}
