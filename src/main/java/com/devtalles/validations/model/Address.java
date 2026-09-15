package com.devtalles.validations.model;


import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Address {

    @NotBlank(message = "La calle no puede estar vacìa")
    private String street;
    @NotBlank(message = "La ciudad no puede estar vacia")
    private String city;
}
