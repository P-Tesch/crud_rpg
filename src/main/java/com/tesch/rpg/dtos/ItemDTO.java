package com.tesch.rpg.dtos;

import java.util.List;

import com.tesch.rpg.entities.Item;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ItemDTO {

    private String name;

    private String description;

    private Integer damage;

    private List<EffectDTO> effectDTOs;

    public static ItemDTO fromItem(Item item) {
        return ItemDTO
            .builder()
                .name(item.getName())
                .description(item.getDescription())
                .damage(item.getDamage())
                .effectDTOs(item.getEffects().stream().map(EffectDTO::fromEffect).toList())
            .build();
    }

    public static Item toItem(ItemDTO itemDTO) {
        Item item =  Item
            .builder()
                .name(itemDTO.getName())
                .description(itemDTO.getDescription())
                .damage(itemDTO.getDamage())
                .effects(itemDTO.getEffectDTOs().stream().map(EffectDTO::toEffect).toList())
            .build();
        
        item.getEffects().forEach(effect -> effect.setItem(item));

        return item;
    }
}
