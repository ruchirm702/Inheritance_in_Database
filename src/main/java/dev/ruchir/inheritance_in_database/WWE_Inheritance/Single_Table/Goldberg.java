package dev.ruchir.inheritance_in_database.WWE_Inheritance.Single_Table;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "STI_Goldberg")
@DiscriminatorValue("1")
public class Goldberg extends BasePlayer {
    private String spear;
}
