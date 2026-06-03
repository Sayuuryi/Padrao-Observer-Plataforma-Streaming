import java.util.ArrayList;
import java.util.List;
public class PlataformaStreaming {
    private List<Usuario> usuarios = new ArrayList<>();
    public void cadastrar(Usuario usuario) {
        usuarios.add(usuario);
    }
    public void adicionarTitulo(String titulo, String genero) {
        System.out.println("Novo titulo cadastrado: " + titulo);
        for (Usuario usuario : usuarios) {
            if (usuario.recebe(genero)) {
                usuario.atualizar(titulo, genero);
            }
        }
        System.out.println();
    }
}
