package Test.main.builder;
import main.java.builder.Engenheiro;
import main.java.builder.EngenheiroBuilder;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class EngenheiroBuilderTest {

    @Test
    void deveRetornarExcecaoParaEngenheiroSemRegistro(){
        try{
            EngenheiroBuilder engenheiroBuilder = new EngenheiroBuilder();
            Engenheiro engenheiro = engenheiroBuilder
                                .setNome("João Victor Lopes Borges")
                                .setCargo("Engenheiro Chefe")
                                .build();
            fail();
        } catch(IllegalArgumentException e){
            assertEquals("Registro inválido", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoParaEngenheiroSemNome(){
        try{
            EngenheiroBuilder engenheiroBuilder = new EngenheiroBuilder();
            Engenheiro engenheiro = engenheiroBuilder
                    .setRegistro(201665528)
                    .setCargo("Engenheiro Chefe")
                    .build();
            fail();
        } catch(IllegalArgumentException e){
            assertEquals("Nome inválido", e.getMessage());
        }
    }

    @Test
    void deveRetornaExcecaoParaEngenheiroSemCargo(){
        try{
            EngenheiroBuilder engenheiroBuilder = new EngenheiroBuilder();
            Engenheiro engenheiro = engenheiroBuilder
                    .setRegistro(201665528)
                    .setNome("João Victor Lopes Borges")
                    .build();
            fail();
        } catch(IllegalArgumentException e){
            assertEquals("Cargo inválido", e.getMessage());
        }
    }

    @Test
    void deveRetornarEngenheiroValido(){
        EngenheiroBuilder engenheiroBuilder = new EngenheiroBuilder();
        Engenheiro engenheiro = engenheiroBuilder
                        .setRegistro(201665528)
                        .setCargo("Engenheiro Chefe")
                        .setNome("João Victor Lopes Borges")
                        .build();
        assertNotNull(engenheiro);
    }
}
