import java.util.HashSet;
public class MemoriaMain {

    public static void main(String[] args) {

        HashSet<Pessoa> pessoas = new HashSet<>();

        pessoas.add(new Pessoa("João", 25));
        pessoas.add(new Pessoa("João", 25));
        pessoas.add(new Pessoa("Maria", 30));
        pessoas.add(new Pessoa("Pedro", 25));

        for (Pessoa pessoa : pessoas) {
            System.out.println("\nNome: " + pessoa.getNomePessoa());
            System.out.println("Idade: " + pessoa.getIdadePessoa());
        }
        System.out.print("\nApenas " + pessoas.size()
                + " pessoas ficaram no total, pois duas pessoas possuíam o mesmo nome e a mesma idade. "
                + "Por isso, foram consideradas iguais pelo HashSet.\n");
    }
}