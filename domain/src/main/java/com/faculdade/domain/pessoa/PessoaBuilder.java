package com.faculdade.domain.pessoa;

import java.time.LocalDateTime;

public class PessoaBuilder {
    private String name;
    private String email;
    //    private Address address;
    private String cellphoneNumber;
    private LocalDateTime birthDate;
    private String document;
    private String rgIe;

    public void withName(String name) {
        this.name = name;
    }

    public void withEmail(String email) {
        this.email = email;
    }
    public void withCellphoneNumber(String cellphoneNumber) {
        this.cellphoneNumber = cellphoneNumber;
    }
    public void withBirthDate(LocalDateTime birthDate) {
        this.birthDate = birthDate;
    }
    public void withDocument(String document) {
        this.document = document;
    }

    public void withRgIe(String rgIe) {
        this.rgIe = rgIe;
    }

    public Pessoa build() {

        final var id = PessoaId.unique();

        return new Pessoa(
                id,
                this.name,
                this.email,
                this.cellphoneNumber,
                this.birthDate,
                this.document,
                this.rgIe
        );
    }

}
