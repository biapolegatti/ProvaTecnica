package exercicio4;

public class Contato {

    String codigoPessoa;
    String numeroDotelefone;
    String idade;

    public Contato(String codigoPessoa, String numeroDotelefone, String idade) {
        this.codigoPessoa = codigoPessoa;
        this.numeroDotelefone = numeroDotelefone;
        this.idade = idade;
    }

    public String getCodigoPessoa() {
        return codigoPessoa;
    }

    public void setCodigoPessoa(String codigoPessoa) {
        this.codigoPessoa = codigoPessoa;
    }

    public String getNumeroDotelefone() {
        return numeroDotelefone;
    }

    public void setNumeroDotelefone(String numeroDotelefone) {
        this.numeroDotelefone = numeroDotelefone;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }
}

  /*Crie uma agenda que armazena, código da pessoa, número do telefone,
          idade. Sua agenda deve possibilitar: (vale 2 pontos)
          (1) – inserir um contato
          (2) – Remover um contato
          (3) – Editar um*/