package br.com.uri.springdemo.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class PersonDTO {
    @NotBlank
    private String id;
    @NotBlank
    private String name;
}
