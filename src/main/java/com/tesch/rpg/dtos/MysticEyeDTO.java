package com.tesch.rpg.dtos;

import com.tesch.rpg.entities.MysticEyes;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class MysticEyeDTO {
    
    private String name;

    private String passive;

    private String active;

    private Integer cooldown;

    public static MysticEyeDTO fromMysticEye(MysticEyes mysticEyes) {
        return MysticEyeDTO
            .builder()
                .name(mysticEyes.getName())
                .passive(mysticEyes.getPassive())
                .active(mysticEyes.getActive())
                .cooldown(mysticEyes.getCooldown())
            .build();
    }

    public static MysticEyes toMysticEyes(MysticEyeDTO mysticEyeDTO) {
        return MysticEyes
            .builder()
                .name(mysticEyeDTO.getName())
                .passive(mysticEyeDTO.getPassive())
                .active(mysticEyeDTO.getActive())
                .cooldown(mysticEyeDTO.getCooldown())
            .build();
    }
}
