package exercicio4;

import java.util.ArrayList;
import java.util.List;

public class Agenda {

    List<String> agenda = new ArrayList<>();

    public void inserir(String contato){
        agenda.add(contato);
    }

    public void deletar(String contato){
        agenda.remove(contato);
    }

}


  /*Crie uma agenda que armazena, código da pessoa, número do telefone,
          idade. Sua agenda deve possibilitar: (vale 2 pontos)
          (1) – inserir um contato
          (2) – Remover um contato
          (3) – Editar um*/
