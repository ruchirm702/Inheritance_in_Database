package dev.ruchir.inheritance_in_database.WWE_Inheritance.Table_Per_Class;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "Tpc_BasePlayer")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class BasePlayer {
    @Id
    private long id;
    private String name;
    private String finisher;
}
