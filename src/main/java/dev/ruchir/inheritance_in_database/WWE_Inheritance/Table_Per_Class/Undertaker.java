package dev.ruchir.inheritance_in_database.WWE_Inheritance.Table_Per_Class;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "Tpc_Undertaker")
public class Undertaker extends BasePlayer {
    private String tombStone;
}
