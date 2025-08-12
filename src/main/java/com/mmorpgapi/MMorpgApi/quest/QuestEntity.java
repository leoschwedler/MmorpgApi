package com.mmorpgapi.MMorpgApi.quest;

import com.mmorpgapi.MMorpgApi.item.ItemEntity;
import com.mmorpgapi.MMorpgApi.monster.MonsterEntity;
import com.mmorpgapi.MMorpgApi.player.PlayerEntity;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "tb_quests")
public class QuestEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "title", length = 150)
    private String title;

    @Column(name = "description")
    private String description;

    @Column(name = "reward_xp")
    private int rewardXp;

    @Column(name = "status", length = 20)
    private String status;

    @ManyToOne
    @JoinColumn(name = "player_id")
    private PlayerEntity player;

    @ManyToMany
    @JoinTable(
            name = "tb_quest_items",
            joinColumns = @JoinColumn(name = "quest_id"),
            inverseJoinColumns = @JoinColumn(name = "item_id")
    )
    private List<ItemEntity> items;

    @ManyToOne
    @JoinColumn(name = "monster_id")
    private MonsterEntity monster;
}
