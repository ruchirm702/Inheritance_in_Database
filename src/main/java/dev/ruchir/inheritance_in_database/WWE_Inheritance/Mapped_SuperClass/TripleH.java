package dev.ruchir.inheritance_in_database.WWE_Inheritance.Mapped_SuperClass;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "Mapped_TripleH")

public class TripleH extends BasePlayer {
    private String Pedigree;
}
