package com.zyknafein.roleplaycharactereditor.services.dto;

import com.zyknafein.roleplaycharactereditor.models.Character;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class UserDTO {
    String name;
    String password;
    List<Character> characters;
}
