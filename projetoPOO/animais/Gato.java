package projetoPOO.animais;

public class Gato extends Animal{

    public Gato(String nome, String cor, double peso) {
        super(nome, cor, peso);
        //TODO Auto-generated constructor stub
    }


    static int numeroDeGatos;


    @Override
    public String toString() {
        return "Gato [nome=" + nome + "]";
    }

    @Override
    public void soar() {
        // TODO Auto-generated method stub
        System.out.println("MIAU MIAU!");
    }

    

}
