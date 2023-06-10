public class ArquivoJPG implements Arquivo{

    public String salvar(String nome){
        return "Arquivo " + nome + ".JPG salvo com sucesso!";
    }
}
