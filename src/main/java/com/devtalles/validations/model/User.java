package com.devtalles.validations.model;

import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.URL;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    private Long id;

    @NotBlank(message = "El nombre no puede estar vacio")
    @Size(min = 2, max = 50, message = "El nombre debe tener entre 2 y 50 caracteres")
    private String name;

    @NotBlank(message = "")
    @URL(message = "La URL de la red social no es valida")
    private String socialMediaURL;

    @Past(message = "La fecha de nacimiento debe ser en el pasado")
    private LocalDate birthDate;

    @DecimalMin(value = "0.01", message = "El valor debe ser mayor a 0")
    @DecimalMax(value = "9999.99", message = "El valor no puede exceder 9999.99")
    private BigDecimal amount;

    @AssertTrue(message = "El usuario debe aceptar los terminos y condiciones")
    private Boolean termsAccepted;

    @Valid
    @NotNull(message = "La direccion no puede ser nula")
    private Address address;

}
