import java.util.ArrayList;
import java.util.List;
public class Usuario implements Observador {
    private String nome;
    private List<String> generos = new ArrayList<>();
    public Usuario(String nome) {
        this.nome = nome;
    }
    public void inscrever(String genero) {
        generos.add(genero);
    }
    public boolean recebe(String genero) {
        return generos.contains(genero);
    }
    public void atualizar(String titulo, String genero) {
        System.out.println(nome + " recebeu aviso de " + genero + ": " + titulo);
    }
}
