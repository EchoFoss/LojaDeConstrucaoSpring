package com.faculdade.domain.pessoa;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Setter
@Getter
public class pessoa {
    private String name;
    private String email;
//    private Address address;
    private String cellphoneNumber;
    private Date birthDate;
    private String document;
    private String rgIe;

    public pessoa(
            String name,
            String email,
            String cellphoneNumber,
            Date birthDate,
            String document,
            String rgIe
    ) {
        this.name = name;
        this.email = email;
        this.cellphoneNumber = cellphoneNumber;
        this.birthDate = birthDate;
        this.document = document;
        this.rgIe = rgIe;
    }

}
