package com.faculdade.domain.pessoa;

import com.faculdade.domain.Identifier;

import java.util.Objects;
import java.util.UUID;

public class PessoaId extends Identifier {

    public PessoaId(String value) {
        Objects.requireNonNull(value);
    }

    public static PessoaId unique() {
        return new PessoaId(UUID.
                randomUUID().
                toString().
                toUpperCase()
        );
    }

    public static PessoaId from(String id) {
        return new PessoaId(id);
    }

    public static PessoaId from(UUID id) {
        return new PessoaId(id
                .toString()
                .toLowerCase()
        );
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
