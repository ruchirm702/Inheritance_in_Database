package dev.ruchir.inheritance_in_database.WWE_Inheritance.Table_Per_Class;

import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "Joined_TripleH")
@PrimaryKeyJoinColumn(name = "id")


public class TripleH extends BasePlayer {
    private String Pedigree;
}
