package br.com.uri.spring.controller;


import br.com.uri.spring.dto.PersonDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class PersonController {

    @PostMapping("/person")
    public ResponseEntity<Void> postData(@RequestBody
                         @Valid PersonDTO personDTO) {
        return ResponseEntity.accepted().build();
    }

}
