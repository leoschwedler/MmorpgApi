package com.mmorpgapi.MMorpgApi.monster;

import org.springframework.stereotype.Component;

@Component
public class MonsterMapper {

    public MonsterEntity map(MonsterDto monsterDto) {
        MonsterEntity monsterEntity = new MonsterEntity();
        monsterEntity.setId(monsterDto.getId());
        monsterEntity.setName(monsterDto.getName());
        monsterEntity.setLevel(monsterDto.getLevel());
        monsterEntity.setHealth(monsterDto.getHealth());
        monsterEntity.setAttack(monsterDto.getAttack());
        return monsterEntity;
    }

    public MonsterDto map(MonsterEntity monsterEntity) {
        MonsterDto monsterDto = new MonsterDto();
        monsterDto.setId(monsterEntity.getId());
        monsterDto.setName(monsterEntity.getName());
        monsterDto.setLevel(monsterEntity.getLevel());
        monsterDto.setHealth(monsterEntity.getHealth());
        monsterDto.setAttack(monsterEntity.getAttack());
        return monsterDto;
    }
}
