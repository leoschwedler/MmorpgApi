package com.mmorpgapi.MMorpgApi.player;

import org.springframework.stereotype.Component;

@Component
public class PlayerMapper {

    public PlayerEntity map(PlayerDto playerDto) {
        PlayerEntity playerEntity = new PlayerEntity();
        playerEntity.setId(playerDto.getId());
        playerEntity.setName(playerDto.getName());
        playerEntity.setLevel(playerDto.getLevel());
        playerEntity.setExperience(playerDto.getExperience());
        playerEntity.setCharacterClass(playerDto.getCharacterClass());
        playerEntity.setHealth(playerDto.getHealth());
        playerEntity.setMana(playerDto.getMana());
        playerEntity.setEnergy(playerDto.getEnergy());
        return playerEntity;
    }

    public PlayerDto map(PlayerEntity playerEntity) {
        PlayerDto playerDto = new PlayerDto();
        playerDto.setId(playerEntity.getId());
        playerDto.setName(playerEntity.getName());
        playerDto.setLevel(playerEntity.getLevel());
        playerDto.setExperience(playerEntity.getExperience());
        playerDto.setCharacterClass(playerEntity.getCharacterClass());
        playerDto.setHealth(playerEntity.getHealth());
        playerDto.setMana(playerEntity.getMana());
        playerDto.setEnergy(playerEntity.getEnergy());
        return playerDto;
    }
}
