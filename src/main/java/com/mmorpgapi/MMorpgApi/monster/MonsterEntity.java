package com.mmorpgapi.MMorpgApi.monster;

import com.mmorpgapi.MMorpgApi.quest.QuestEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

import static jakarta.persistence.GenerationType.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
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

    // MonsterEntity.java
    @OneToMany(mappedBy = "monster")
    private List<QuestEntity> quests;
}
