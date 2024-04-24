package com.faculdade.domain;

import com.faculdade.domain.validation.ValidationHandler;

public class AggregateRoot<ID extends Identifier> extends Entity<ID> {
    public AggregateRoot(ID id) {
        super(id);
    }

    @Override
    public void validate(ValidationHandler handler) {

    }
}
