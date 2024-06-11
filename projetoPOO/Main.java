package projetoPOO;

import projetoPOO.animais.Cachorro;

public class Main {
    public static void main(String[] args) {
        
        Cachorro cachorro1 = new Cachorro("Puppy", "caramelo", 25, 5.5, 5, "nada");
        System.out.println(Cachorro.getNumerosDeCachorro());
        Cachorro cachorro2 = new Cachorro("Rex", "caramelo", 25, 5.5, 5, "nada");

        System.out.println(Cachorro.getNumerosDeCachorro());
        System.out.println(Cachorro.getNumerosDeCachorro());

        System.out.println(cachorro1.toString());
        System.out.println(cachorro2.toString());

        // System.out.println(cachorro1.getNome());
        // System.out.println(cachorro1.getPeso());

        // cachorro1.latir();
        // System.out.println("O cachorro pegou uma " + cachorro1.pegar());
        // System.out.println("O cachorro está " + cachorro1.interagir("carinho"));
        // System.out.println("O cachorro está " + cachorro1.interagir("nada"));
        // System.out.println("O cachorro está " + cachorro1.interagir("vai dormir!"));
        // System.out.println("O cachorro está " + cachorro1.interagir("pisar na patinha"));

    }
    
}
