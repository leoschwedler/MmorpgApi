package com.mmorpgapi.MMorpgApi.quest;

import org.springframework.stereotype.Component;

@Component
public class QuestMapper {

    public QuestEntity map(QuestDto questDto) {
        QuestEntity questEntity = new QuestEntity();
        questEntity.setId(questDto.getId());
        questEntity.setTitle(questDto.getTitle());
        questEntity.setDescription(questDto.getDescription());
        questEntity.setRewardXp(questDto.getRewardXp());
        questEntity.setStatus(questDto.getStatus());
        return questEntity;
    }

    public QuestDto map(QuestEntity questEntity) {
        QuestDto questDto = new QuestDto();
        questDto.setId(questEntity.getId());
        questDto.setTitle(questEntity.getTitle());
        questDto.setDescription(questEntity.getDescription());
        questDto.setRewardXp(questEntity.getRewardXp());
        questDto.setStatus(questEntity.getStatus());
        return questDto;
    }
}
