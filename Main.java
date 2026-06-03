public class Main {
    public static void main(String[] args) {
        PlataformaStreaming plataforma = new PlataformaStreaming();
        Usuario joao = new Usuario("Joao");
        joao.inscrever("acao");
        joao.inscrever("anime");
        Usuario maria = new Usuario("Maria");
        maria.inscrever("comedia");
        Usuario ana = new Usuario("Ana");
        ana.inscrever("terror");
        ana.inscrever("ficcao cientifica");
        Usuario pedro = new Usuario("Pedro");
        pedro.inscrever("anime");
        Usuario bia = new Usuario("Bia");
        bia.inscrever("acao");
        bia.inscrever("comedia");
        plataforma.cadastrar(joao);
        plataforma.cadastrar(maria);
        plataforma.cadastrar(ana);
        plataforma.cadastrar(pedro);
        plataforma.cadastrar(bia);
        plataforma.adicionarTitulo("Cidade em Perigo", "acao");
        plataforma.adicionarTitulo("Risadas no Bairro", "comedia");
        plataforma.adicionarTitulo("Robos do Futuro", "ficcao cientifica");
        plataforma.adicionarTitulo("Aventura Ninja", "anime");
    }
}
