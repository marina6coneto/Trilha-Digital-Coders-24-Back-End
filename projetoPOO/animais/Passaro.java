package projetoPOO.animais;

public class Passaro extends Animal{

    public Passaro(String nome, String cor, double peso) {
        super(nome, cor, peso);

    }


    static int numeroDePasssaros;
    

    @Override
    public String toString() {
        return "Passaro [nome=" + nome + "]";
    }

    @Override
    public void soar(){}
}
    

