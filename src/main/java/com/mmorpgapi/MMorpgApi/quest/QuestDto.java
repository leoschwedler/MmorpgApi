package com.mmorpgapi.MMorpgApi.quest;

import com.mmorpgapi.MMorpgApi.item.ItemEntity;
import com.mmorpgapi.MMorpgApi.monster.MonsterEntity;
import com.mmorpgapi.MMorpgApi.player.PlayerEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class QuestDto {


    private Long id;


    private String title;


    private String description;


    private int rewardXp;


    private String status;


    private PlayerEntity player;


    private List<ItemEntity> items;


    private MonsterEntity monster;
}
