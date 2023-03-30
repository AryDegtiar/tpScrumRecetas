package com.tpscrum.apirest.entities;

import lombok.Getter;
import lombok.Setter;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import java.io.Serializable;

@Getter
@Setter
@MappedSuperclass
public class Base implements Serializable {
    @Id
    private Integer id;

    private Boolean activo;

    public Base() {
        super();
        this.activo = true;
    }
}