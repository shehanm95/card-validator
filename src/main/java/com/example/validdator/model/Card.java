package com.example.validdator.model;


import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Card {

    @NotNull(message = "card number cannot Be null")
    @NotEmpty
    @Length(min = 16, max = 16, message = "card number should contain 16 numbers only")
    private String cardNumber;

    @Pattern(regexp = "^(0[1-9]|1[0-2])/(\\d{2})$" , message = "date should be in this format MM/YY")
    @NotNull(message = "exp date cannot Be null")
    private String expDate;


    @NotNull(message = "card holder name cannot Be null")
    @Pattern(regexp = "^([a-zA-Z]+\s?)+$" ,message = "name Should be in letters")
    private String cardHolderName;
}
