package com.mmorpgapi.MMorpgApi.quest;

import jakarta.persistence.*;

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
}
