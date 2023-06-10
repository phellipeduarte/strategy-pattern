public class Usuario {

    public String salvarGIF(String nome){
        return GerenciadorArquivos.salvar(new ArquivoGIF(), nome);
    };

    public String salvarJPG(String nome){
        return GerenciadorArquivos.salvar(new ArquivoJPG(), nome);
    };

    public String salvarPNG(String nome){
        return GerenciadorArquivos.salvar(new ArquivoPNG(), nome);
    };

    public String salvarSVG(String nome){
        return GerenciadorArquivos.salvar(new ArquivoSVG(), nome);
    };

}
