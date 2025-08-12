package com.mmorpgapi.MMorpgApi.item;

import com.mmorpgapi.MMorpgApi.player.PlayerEntity;
import com.mmorpgapi.MMorpgApi.quest.QuestEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ItemDto {


    private Long id;


    private String name;


    private String type;


    private int damage;


    private int defense;


    private int healing;


    private PlayerEntity player;


    private List<QuestEntity> quests;
}
