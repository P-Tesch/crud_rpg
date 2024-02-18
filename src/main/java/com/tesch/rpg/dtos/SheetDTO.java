package com.tesch.rpg.dtos;

import java.util.List;

import org.apache.tomcat.util.codec.binary.Base64;

import com.tesch.rpg.entities.Sheet;
import com.tesch.rpg.enums.Alignment;
import com.tesch.rpg.enums.Organization;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class SheetDTO {
    
    private String name;

    private String portrait;

    private String description;

    private String background;

    private Integer creationPoints;

    private String alignment;

    private String organization;

    private AttributesDTO attributesDTO;

    private StatsDTO statsDTO;

    private SkillsDTO skillsDTO;

    private List<AdvantageDTO> advantageDTOs;

    private BloodDTO bloodDTO;

    private List<ItemDTO> itemDTOs;

    private List<EffectDTO> effectDTOs;

    private List<MiracleDTO> miracleDTOs;

    private List<MysticEyeDTO> mysticEyeDTOs;

    private List<SchoolDTO> schoolDTOs;

    private ScriptureDTO scriptureDTO;

    private List<SonataDTO> sonataDTOs;

    public static SheetDTO fromSheet(Sheet sheet) {
        return SheetDTO
            .builder()
                .name(sheet.getName())
                .portrait(Base64.encodeBase64String(sheet.getPortrait()))
                .description(sheet.getDescription())
                .background(sheet.getBackground())
                .creationPoints(sheet.getCreationPoints())
                .alignment(sheet.getAlignment().toString())
                .organization(sheet.getOrganization().toString())
                .attributesDTO(AttributesDTO.fromAttributes(sheet.getAttributes()))
                .statsDTO(StatsDTO.fromStats(sheet.getStats()))
                .skillsDTO(SkillsDTO.fromSkills(sheet.getSkills()))
                .advantageDTOs(sheet.getAdvantages().stream().map(AdvantageDTO::fromAdvantage).toList())
                .bloodDTO(BloodDTO.fromBlood(sheet.getBlood()))
                .itemDTOs(sheet.getItems().stream().map(ItemDTO::fromItem).toList())
                .effectDTOs(sheet.getEffects().stream().map(EffectDTO::fromEffect).toList())
                .miracleDTOs(sheet.getMiracles().stream().map(MiracleDTO::fromMiracle).toList())
                .mysticEyeDTOs(sheet.getMysticEyes().stream().map(MysticEyeDTO::fromMysticEye).toList())
                .schoolDTOs(sheet.getSchools().stream().map(SchoolDTO::fromSchool).toList())
                .scriptureDTO(ScriptureDTO.fromScripture(sheet.getScripture()))
                .sonataDTOs(sheet.getSonatas().stream().map(SonataDTO::fromSonata).toList())
            .build();
    }

    public static Sheet toSheet(SheetDTO sheetDTO) {
        Sheet sheet = Sheet
            .builder()
                .name(sheetDTO.getName())
                .portrait(Base64.decodeBase64(sheetDTO.getPortrait()))
                .description(sheetDTO.getDescription())
                .background(sheetDTO.getBackground())
                .creationPoints(sheetDTO.getCreationPoints())
                .alignment(Alignment.valueOf(sheetDTO.getAlignment()))
                .organization(Organization.valueOf(sheetDTO.getOrganization()))
                .attributes(AttributesDTO.toAttributes(sheetDTO.getAttributesDTO()))
                .stats(StatsDTO.toStats(sheetDTO.getStatsDTO()))
                .skills(SkillsDTO.toSkills(sheetDTO.getSkillsDTO()))
                .advantages(sheetDTO.getAdvantageDTOs().stream().map(AdvantageDTO::toAdvantage).toList())
                .blood(BloodDTO.toBlood(sheetDTO.getBloodDTO()))
                .items(sheetDTO.getItemDTOs().stream().map(ItemDTO::toItem).toList())
                .effects(sheetDTO.getEffectDTOs().stream().map(EffectDTO::toEffect).toList())
                .miracles(sheetDTO.getMiracleDTOs().stream().map(MiracleDTO::toMiracle).toList())
                .mysticEyes(sheetDTO.getMysticEyeDTOs().stream().map(MysticEyeDTO::toMysticEyes).toList())
                .schools(sheetDTO.getSchoolDTOs().stream().map(SchoolDTO::toSchool).toList())
                .scripture(ScriptureDTO.toScripture(sheetDTO.getScriptureDTO()))
                .sonatas(sheetDTO.getSonataDTOs().stream().map(SonataDTO::toSonata).toList())
            .build();
        
            sheet.getAdvantages().forEach(advantage -> advantage.setSheet(sheet));
            sheet.getItems().forEach(item -> item.setSheet(sheet));
            sheet.getEffects().forEach(effect -> effect.setSheet(sheet));
            sheet.getMiracles().forEach(miracle -> miracle.setSheet(sheet));
            sheet.getMysticEyes().forEach(mysticEye -> mysticEye.setSheet(sheet));
            sheet.getSchools().forEach(school -> school.setSheet(sheet));
            sheet.getSonatas().forEach(sonata -> sonata.setSheet(sheet));
            sheet.getBlood().setSheet(sheet);
            sheet.getScripture().setSheet(sheet);

            return sheet;
    }
}
