package dev.ruchir.inheritance_in_database.WWE_Inheritance.Mapped_Joined_Table;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@MappedSuperclass

public class BasePlayer {
    @Id // for Primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY) // for AUTO-INCREMENT
    private Long id ;
    private String name;
    private String finisher;
}
