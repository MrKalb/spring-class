package br.com.uri.spring.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class PersonEntity {
    @Id
    private Long id;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
