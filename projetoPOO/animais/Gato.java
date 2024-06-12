package projetoPOO.animais;

public class Gato extends Animal{

    public Gato(String nome, String cor, double peso) {
        super(nome, cor, peso);

    }


    static int numeroDeGatos;


    @Override
    public String toString() {
        return "Gato [nome=" + nome + "]";
    }

    @Override
    public void soar() {

        System.out.println("MIAU MIAU!");
    }

    

}
