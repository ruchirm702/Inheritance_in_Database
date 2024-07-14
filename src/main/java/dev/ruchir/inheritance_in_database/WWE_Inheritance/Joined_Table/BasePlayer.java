package dev.ruchir.inheritance_in_database.WWE_Inheritance.Joined_Table;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "Joined_BasePlayer")
@Inheritance(strategy = InheritanceType.JOINED)

public class BasePlayer {
    @Id // for Primary key
    private long id ;
    private String name;
    private String finisher;
}
