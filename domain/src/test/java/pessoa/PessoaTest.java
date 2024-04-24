package pessoa;

import com.faculdade.domain.pessoa.Pessoa;
import com.faculdade.domain.pessoa.PessoaId;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

public class PessoaTest {
    @Test
    public void shouldCreatePessoa_GivenValidParams(){

        final var pessoaName = "Maria";
        final var email = "maria@gmail.com";
        final var celular = "123456789";
        final var dataNascimento = LocalDateTime.now();
        final var documento = "12345";
        final var rgIe = "123456";
        final var id = PessoaId.unique();


        final var pessoaCriada = new Pessoa(
                id,
                pessoaName,
                email,
                celular,
                dataNascimento,
                documento,
                rgIe
        );

        final var DateAfterCreation = LocalDateTime.now();

        Assertions.assertNotNull(pessoaCriada);
        Assertions.assertEquals(pessoaName, pessoaCriada.getName());
        Assertions.assertEquals(email, pessoaCriada.getEmail());
        Assertions.assertEquals(celular, pessoaCriada.getCellphoneNumber());
        Assertions.assertEquals(documento, pessoaCriada.getDocument());
        Assertions.assertEquals(rgIe, pessoaCriada.getRgIe());
        Assertions.assertFalse(pessoaCriada.getBirthDate().isAfter(DateAfterCreation));
    }
}
