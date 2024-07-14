package dev.ruchir.inheritance_in_database.WWE_Inheritance.Table_Per_Class;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "Tpc_Goldberg")
public class Goldberg extends BasePlayer {
    private String spear;
}
