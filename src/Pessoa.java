import java.util.Objects;

public class Pessoa {

    private String nomePessoa;
    private int idadePessoa;

    public Pessoa(String nomePessoa, int idadePessoa) {
        this.nomePessoa = nomePessoa;
        this.idadePessoa = idadePessoa;
    }
    public String getNomePessoa() {
        return nomePessoa;
    }
    public int getIdadePessoa() {
        return idadePessoa;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Pessoa pessoa = (Pessoa) o;
        return idadePessoa == pessoa.idadePessoa && Objects.equals(nomePessoa, pessoa.nomePessoa);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nomePessoa, idadePessoa);
    }
}
