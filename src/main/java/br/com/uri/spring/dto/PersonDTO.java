package br.com.uri.spring.dto;

import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public class PersonDTO {
    @NotBlank
    private String id;
    @NotBlank
    private String name;
}
