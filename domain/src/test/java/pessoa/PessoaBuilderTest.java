package pessoa;

import com.faculdade.domain.pessoa.Pessoa;
import com.faculdade.domain.pessoa.PessoaBuilder;
import com.faculdade.domain.pessoa.PessoaId;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

public class PessoaBuilderTest {
    @Test
    public void ShouldInstantiatePessoa_WhenGivenCorrectParams() {
        final var pessoaBuilder = new PessoaBuilder();

        final var pessoaName = "Maria";
        final var email = "maria@gmail.com";
        final var celular = "123456789";
        final var dataNascimento = LocalDateTime.now();
        final var documento = "12345";
        final var rgIe = "123456";
        final var id = PessoaId.unique();

        pessoaBuilder.withName(pessoaName);
        pessoaBuilder.withEmail(email);
        pessoaBuilder.withCellphoneNumber(celular);
        pessoaBuilder.withBirthDate(dataNascimento);
        pessoaBuilder.withDocument(documento);
        pessoaBuilder.withRgIe(rgIe);

        final var pessoaCriadaFromBuilder = pessoaBuilder.build();

        final var pessoaCriadaFromClass = new Pessoa(
                id,
                pessoaName,
                email,
                celular,
                dataNascimento,
                documento,
                rgIe
        );


        Assertions.assertNotNull(pessoaBuilder);

        Assertions.assertEquals(
                pessoaCriadaFromClass.getName(),
                pessoaCriadaFromBuilder.getName()
        );
        Assertions.assertEquals(
                pessoaCriadaFromClass.getEmail(),
                pessoaCriadaFromBuilder.getEmail()
        );
        Assertions.assertEquals(
                pessoaCriadaFromClass.getCellphoneNumber(),
                pessoaCriadaFromBuilder.getCellphoneNumber()
        );
        Assertions.assertEquals(
                pessoaCriadaFromClass.getDocument(),
                pessoaCriadaFromBuilder.getDocument()
        );
        Assertions.assertEquals(
                pessoaCriadaFromClass.getRgIe(),
                pessoaCriadaFromBuilder.getRgIe()
        );

    }
}
