package br.com.uri.springdemo.controller;

import br.com.uri.springdemo.dto.PersonDTO;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {

    @PostMapping("/person")
    public ResponseEntity<Void> postData(@RequestBody
                         @Valid
                         PersonDTO personDTO) {
        return ResponseEntity.accepted().build();
    }

}
