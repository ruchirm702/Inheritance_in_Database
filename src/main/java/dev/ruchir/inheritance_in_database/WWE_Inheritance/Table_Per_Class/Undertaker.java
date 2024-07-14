package dev.ruchir.inheritance_in_database.WWE_Inheritance.Table_Per_Class;

import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "Joined_Undertaker")
@PrimaryKeyJoinColumn(name = "id")


public class Undertaker extends BasePlayer {
    private String TombStone;
}
