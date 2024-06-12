package projetoPOO.animais;

public class Passaro extends Animal{

    public Passaro(String nome, String cor, double peso) {
        super(nome, cor, peso);
        //TODO Auto-generated constructor stub
    }


    static int numeroDePasssaros;
    

    @Override
    public String toString() {
        return "Passaro [nome=" + nome + "]";
    }

    @Override
    public void soar() {
        // TODO Auto-generated method stub
        System.out.println("PIU PIU!");
    }
}
    

