package projetoPOO;

public class Main {
    public static void main(String[] args) {
        Cachorro cachorro1 = new Cachorro();
        cachorro1.nome = "Puppy";
        cachorro1.altura = 25;
        cachorro1.cor = "caramelo";
        cachorro1.peso = 5.5;
        cachorro1.tamanhoDoRabo = 5;

        System.out.println(cachorro1.nome);
    }
    
}
