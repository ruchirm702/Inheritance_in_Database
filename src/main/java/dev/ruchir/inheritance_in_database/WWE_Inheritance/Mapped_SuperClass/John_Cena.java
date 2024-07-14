package dev.ruchir.inheritance_in_database.WWE_Inheritance.Mapped_SuperClass;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "Mapped_JohnCena")


public class John_Cena extends BasePlayer {
    private String Attitude_Adjustment;
}
