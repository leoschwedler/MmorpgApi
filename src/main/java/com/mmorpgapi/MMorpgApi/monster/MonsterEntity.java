package com.mmorpgapi.MMorpgApi.monster;

import jakarta.persistence.*;

import static jakarta.persistence.GenerationType.*;

@Entity
@Table(name = "tb_monsters")
public class MonsterEntity {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;

    @Column(name = "name", length = 100)
    private String name;

    @Column(name = "level")
    private int level;

    @Column(name = "health")
    private int health;

    @Column(name = "attack")
    private int attack;
}
