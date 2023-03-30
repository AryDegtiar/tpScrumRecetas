package com.tpscrum.apirest.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter @Setter
@Entity
@Table(name = "recetas")
public class Receta extends Base {
    @NotBlank(message = "El nombre no puede estar vacío")
    private String firstName;

    private Date createdAt;

}
