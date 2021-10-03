package Objetos;

public class Pessoa {
    public String nome;
    public int cpf;
    Endereço[] endereços;

    public Pessoa(String nome, int cpf, int qtdEnd) {
        this.nome = nome;
        this.cpf = cpf;
        endereços = new Endereço[qtdEnd];
    }

    public void addEndereço(Endereço end) {
        for (int i = 0; i < 4; i++) {
            if (endereços[i] == null) {
                this.endereços[i] = end;
                break;
            }
        }
    }

    public void mostraInfo() {
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        for (int i = 0; i < 4; i++) {
            if (endereços[i] != null) {
                System.out.println("Rua: " + endereços[i].rua);
                System.out.println("Bairro: " + endereços[i].bairro);
                System.out.println("Numero: " + endereços[i].numero);
            }
        }
    }
}