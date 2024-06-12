package projetoPOO.animais;

public class Cachorro extends Animal {

    // ATRIBUTOS
    static int numerosDeCachorro;
    private int tamanhoDoRabo;

    // CONSTRUTORES
    public Cachorro(String nome, String cor, int altura, double peso, int tamanhoDoRabo, String estadoDeEspirito){
        super(nome, cor , peso);
        this.nome = nome;
        this.cor = cor; 
        this.altura = altura;
        this.peso = peso;
        this.tamanhoDoRabo = tamanhoDoRabo;
        this.estadoDeEspirito = estadoDeEspirito;

        numerosDeCachorro ++;

    }
    
    // MÉTODOS
    public static int getNumerosDeCachorro(){
        return numerosDeCachorro;
    }

    public static void setNumerosDeCachorro(int numerosDeCachorro){
        Cachorro.numerosDeCachorro = numerosDeCachorro;
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getCor(){
        return this.cor;
    }

    public void setCor(String cor){
        this.cor = cor;
    }

    public int getAltura(){
        return altura;
    }

    public void setAltura(int altura){
        this.altura = altura;
    }

    public double getPeso(){
        return peso;
    }

    public void setPeso(double peso){
        this.peso = peso;
    }

    public int getTamanhoDoRabo(){
        return tamanhoDoRabo;
    }

    public void setTamanhoDoRabo(int tamanhoDoRabo){
        this.tamanhoDoRabo = tamanhoDoRabo;
    }


    public String pegar(){
        return "Bolinha";
    }
    
    public String interagir(String acao){

        switch (acao) {
            case "carinho": this.estadoDeEspirito = "feliz"; break;
            case "vai dormir!": this.estadoDeEspirito = "bravo"; break;
            case "pisar na patinha": this.estadoDeEspirito = "triste"; break;
            default: this.estadoDeEspirito = "neutro"; break;
            
        }

        return this.estadoDeEspirito;

        // if (acao.equals("carinho")){
        //     this.estadoDeEspirito = "feliz";
        // } else if(acao.equals("vai dormir!")) {
        //     this.estadoDeEspirito = "bravo";
        // } else{
        //     this.estadoDeEspirito = ("neutro");
        // }
        // return estadoDeEspirito;

    }

    @Override
    public String toString(){
        return "Cachorro{" + "nome='" + nome + '\'' + "}";
    }

    @Override
    public void soar(){
        System.out.println("AU AU");
    }


    
}
