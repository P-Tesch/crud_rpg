package com.tesch.rpg.dtos;

import com.tesch.rpg.entities.Skills;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class SkillsDTO {
    
    private Integer speed;

    private Integer acrobatics;

    private Integer melee;

    private Integer intimidation;

    private Integer ranged;

    private Integer stealth;

    private Integer conscience;

    private Integer investigation;

    private Integer wisdom;

    private Integer knowledge;

    private Integer medicine;

    private Integer survival;

    private Integer tenacity;

    private Integer diplomacy;

    private Integer insight;

    public static SkillsDTO fromSkills(Skills skills) {
        return SkillsDTO
            .builder()
                .speed(skills.getSpeed())
                .acrobatics(skills.getAcrobatics())
                .melee(skills.getMelee())
                .intimidation(skills.getIntimidation())
                .ranged(skills.getRanged())
                .stealth(skills.getStealth())
                .conscience(skills.getConscience())
                .investigation(skills.getInvestigation())
                .wisdom(skills.getWisdom())
                .knowledge(skills.getKnowledge())
                .medicine(skills.getMedicine())
                .survival(skills.getSurvival())
                .tenacity(skills.getTenacity())
                .diplomacy(skills.getDiplomacy())
                .insight(skills.getInsight())
            .build();
    }

    public static Skills toSkills(SkillsDTO skillsDTO) {
        return Skills
            .builder()
                .speed(skillsDTO.getSpeed())
                .acrobatics(skillsDTO.getAcrobatics())
                .melee(skillsDTO.getMelee())
                .intimidation(skillsDTO.getIntimidation())
                .ranged(skillsDTO.getRanged())
                .stealth(skillsDTO.getStealth())
                .conscience(skillsDTO.getConscience())
                .investigation(skillsDTO.getInvestigation())
                .wisdom(skillsDTO.getWisdom())
                .knowledge(skillsDTO.getKnowledge())
                .medicine(skillsDTO.getMedicine())
                .survival(skillsDTO.getSurvival())
                .tenacity(skillsDTO.getTenacity())
                .diplomacy(skillsDTO.getDiplomacy())
                .insight(skillsDTO.getInsight())
            .build();
    }
}
