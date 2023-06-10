import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UsuarioTest {

    Usuario usuario;
    String nomeArquivo;

    @BeforeEach
    void setUp(){
        usuario = new Usuario();
        nomeArquivo = "arquivo";
    }

    @Test
    void deveSalvarGIF(){
        assertEquals("Arquivo arquivo.GIF salvo com sucesso!", usuario.salvarGIF(nomeArquivo));
    }

    @Test
    void deveSalvarJPG(){
        assertEquals("Arquivo arquivo.JPG salvo com sucesso!", usuario.salvarJPG(nomeArquivo));
    }

    @Test
    void deveSalvarPNG(){
        assertEquals("Arquivo arquivo.PNG salvo com sucesso!", usuario.salvarPNG(nomeArquivo));
    }

    @Test
    void deveSalvarSVG(){
        assertEquals("Arquivo arquivo.SVG salvo com sucesso!", usuario.salvarSVG(nomeArquivo));
    }
}
