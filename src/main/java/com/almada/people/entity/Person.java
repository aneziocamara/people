package com.almada.people.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "tb_people")
@Data
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, unique = true)
    @Setter(AccessLevel.NONE)
    private long id;

    @Column(name = "id", nullable = false, unique = true)
    private String name;

    @Column(name = "id", nullable = false, unique = true)
    private String cpf;

    @Column(name = "id", nullable = false, unique = true)
    private Integer age;

    @Builder
    public Person(String name, String cpf, Integer age) {
        this.name = name;
        this.cpf = cpf;
        this.age = age;
    }
}
