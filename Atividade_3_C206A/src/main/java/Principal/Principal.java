package Principal;

import Objetos.Endereço;
import Objetos.Pessoa;

public class Principal {
    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa("Johny",77777 , 1);
        Endereço primeiroendereço = new Endereço("New" , "World" , 260);
        Endereço segundoendereço = new Endereço("Ibíra" , "Ibirapuera" , 81732);

        pessoa.addEndereço(primeiroendereço);
        pessoa.mostraInfo();

        pessoa.addEndereço(segundoendereço);
        pessoa.mostraInfo();

    }
}