package dev.ruchir.inheritance_in_database.WWE_Inheritance.Mapped_Joined_Table;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "Mapped_Undertaker")

public class Undertaker extends BasePlayer{
    private String TombStone;
}
