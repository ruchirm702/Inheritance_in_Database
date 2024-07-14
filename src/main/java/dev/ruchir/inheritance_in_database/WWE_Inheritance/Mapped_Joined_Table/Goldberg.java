package dev.ruchir.inheritance_in_database.WWE_Inheritance.Mapped_Joined_Table;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "Mapped_Goldberg")

public class Goldberg extends BasePlayer{
    private String Spear;

}
