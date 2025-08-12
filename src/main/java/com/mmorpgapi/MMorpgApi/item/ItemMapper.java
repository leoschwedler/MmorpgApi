package com.mmorpgapi.MMorpgApi.item;

import org.springframework.stereotype.Component;

@Component
public class ItemMapper {

    public ItemEntity map(ItemDto itemDto) {
        ItemEntity itemEntity = new ItemEntity();
        itemEntity.setId(itemDto.getId());
        itemEntity.setName(itemDto.getName());
        itemEntity.setType(itemDto.getType());
        itemEntity.setDamage(itemDto.getDamage());
        itemEntity.setDefense(itemDto.getDefense());
        itemEntity.setHealing(itemDto.getHealing());
        return itemEntity;
    }

    public ItemDto map(ItemEntity itemEntity) {
        ItemDto itemDto = new ItemDto();
        itemDto.setId(itemEntity.getId());
        itemDto.setName(itemEntity.getName());
        itemDto.setType(itemEntity.getType());
        itemDto.setDamage(itemEntity.getDamage());
        itemDto.setDefense(itemEntity.getDefense());
        itemDto.setHealing(itemEntity.getHealing());
        return itemDto;
    }
}
