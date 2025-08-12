package com.mmorpgapi.MMorpgApi.monster;

import com.mmorpgapi.MMorpgApi.quest.QuestEntity;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

import static jakarta.persistence.GenerationType.IDENTITY;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class MonsterDto {


    private Long id;


    private String name;


    private int level;


    private int health;


    private int attack;

    private List<QuestEntity> quests;
}
