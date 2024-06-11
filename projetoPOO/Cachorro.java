package projetoPOO;

public class Cachorro {

    public String nome;
    public String cor;
    public int altura;
    public double peso;
    public int tamanhoDoRabo;
    public String estadoDeEspirito;

    public void comer(){};
    public void latir(){
        System.out.println("AU AU");
    };

    public String pegar(){
        return "Bolinha";

    }
    
    public String interagir(String acao){
        if (acao.equals("carinho")){
            this.estadoDeEspirito = "feliz";
        } else if(acao.equals("vai dormir!")) {
            this.estadoDeEspirito = "bravo";
        } else{
            this.estadoDeEspirito = ("neutro");
        }
        return estadoDeEspirito;
    }
    
}
