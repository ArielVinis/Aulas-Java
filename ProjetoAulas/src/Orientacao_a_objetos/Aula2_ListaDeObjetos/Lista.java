package Orientacao_a_objetos.Aula2_ListaDeObjetos;

import java.util.ArrayList;

public class Lista {
    public static void main(String[] args) {
        ArrayList<Aluno> ListaAlunos = new ArrayList<>();

        Aluno a1 = new Aluno();
        a1.setNome("Ariel");
        a1.setMatricula("001");
        a1.setTelefone("48 9 9999-9999");

        ListaAlunos.add(a1);

        Aluno a2 = new Aluno();
        a2.setNome("Gilnei");
        a2.setMatricula("002");
        a2.setTelefone("53 9 9999-9999");

        ListaAlunos.add(new Aluno("Marcos","003", "51 9 9999-9999"));

        for(int i=0; i<ListaAlunos.size();i++){
            System.out.println(ListaAlunos.get(i).getDados());
        }

    }
}
