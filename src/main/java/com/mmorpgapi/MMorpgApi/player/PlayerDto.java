package com.mmorpgapi.MMorpgApi.player;

import com.mmorpgapi.MMorpgApi.item.ItemEntity;
import com.mmorpgapi.MMorpgApi.quest.QuestEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class PlayerDto {


    private Long id;


    private String name;


    private int level;


    private int experience;


    private String characterClass;


    private int health;


    private int mana;


    private int energy;


    private List<ItemEntity> items;


    private List<QuestEntity> quests;

}
