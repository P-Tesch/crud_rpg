package com.tesch.rpg.dtos;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UserDTO {
    
    private String login;

    private String password;

    private SheetDTO sheetDTO;
}
