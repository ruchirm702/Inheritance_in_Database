package dev.ruchir.inheritance_in_database.WWE_Inheritance.Single_Table;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "STI_BasePlayer")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "player_type", discriminatorType = DiscriminatorType.INTEGER)

public class BasePlayer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String finisher;
}
