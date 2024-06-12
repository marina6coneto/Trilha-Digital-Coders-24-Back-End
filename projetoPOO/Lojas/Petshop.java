package projetoPOO.Lojas;

import projetoPOO.animais.Animal;
import projetoPOO.animais.Cachorro;

public class Petshop {


    public void darBanho(Animal animal){
        animal.setEstadoDeEspirito("Limpo");
    }

    public void tosar(Cachorro cachorro){
        cachorro.setEstadoDeEspirito("Tosado");
    }

    public void deixarNoHotel(Animal animal){
        animal.setEstadoDeEspirito("com saudades");
    };

}
