package com.mmorpgapi.MMorpgApi.player;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tb_players")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PlayerEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", length = 100)
    private String name;

    @Column(name = "level")
    private int level;

    @Column(name = "experience")
    private int experience;

    @Column(name = "character_class", length = 50)
    private String characterClass;

    @Column(name = "health")
    private int health;

    @Column(name = "mana")
    private int mana;

    @Column(name = "energy")
    private int energy;
}


