package dev.ruchir.inheritance_in_database.WWE_Inheritance.Table_Per_Class;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "Tpc_TripleH")
public class TripleH extends BasePlayer {
    private String pedigree;
}
