package com.mmorpgapi.MMorpgApi.item;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_items")
public class ItemEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", length = 100)
    private String name;

    @Column(name = "type", length = 50)
    private String type;

    @Column(name = "damage")
    private int damage;

    @Column(name = "defense")
    private int defense;

    @Column(name = "healing")
    private int healing;
}
