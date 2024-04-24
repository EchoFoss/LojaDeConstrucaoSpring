package com.faculdade.domain.pessoa;

import com.faculdade.domain.AggregateRoot;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Setter
@Getter
public class Pessoa extends AggregateRoot<PessoaId> {
    private String name;
    private String email;
//    private Address address;
    private String cellphoneNumber;
    private LocalDateTime birthDate;
    private String document;
    private String rgIe;

    public Pessoa(
            PessoaId id,
            String name,
            String email,
            String cellphoneNumber,
            LocalDateTime birthDate,
            String document,
            String rgIe
    ) {
        super(id);
        this.name = name;
        this.email = email;
        this.cellphoneNumber = cellphoneNumber;
        this.birthDate = birthDate;
        this.document = document;
        this.rgIe = rgIe;
    }


}
