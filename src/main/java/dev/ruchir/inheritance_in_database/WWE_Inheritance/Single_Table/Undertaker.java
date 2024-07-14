package dev.ruchir.inheritance_in_database.WWE_Inheritance.Single_Table;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "STI_Undertaker")
@DiscriminatorValue("4")
public class Undertaker extends BasePlayer {
    private String tombStone;
}
