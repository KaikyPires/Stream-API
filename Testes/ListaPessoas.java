package Testes;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ListaPessoas {
    
    private List<Pessoas> PessoasList;

    public ListaPessoas() {
        this.PessoasList = new ArrayList<>();
    }
    public void adcionarPessoas(String nome, double altura){
        this.PessoasList.add(new Pessoas(nome, altura));
    }
    public List ordenarPorAltura(){
        List<Pessoas> ordenarPessoas = new ArrayList<>(PessoasList);
        if(!PessoasList.isEmpty()){
           // ordenarPessoas.sort((p1,p2) -> Double.compare(p1.getAltura(), p2.getAltura()));
           ordenarPessoas.sort(Comparator.comparingDouble(Pessoas::getAltura));
            return ordenarPessoas;
        }
        else{
            throw new RuntimeException("A lista esta vazia");
        }
    }
    public static void main(String[] args) {
        ListaPessoas pessoas = new ListaPessoas();
        pessoas.adcionarPessoas("Kaiky", 1.80);
        pessoas.adcionarPessoas("Joao", 1.90);
        pessoas.adcionarPessoas("Vitor", 1.70);
        System.out.println(pessoas.ordenarPorAltura());

    }

}
