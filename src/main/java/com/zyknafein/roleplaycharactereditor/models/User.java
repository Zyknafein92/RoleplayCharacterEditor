package com.zyknafein.roleplaycharactereditor.models;

import lombok.*;

import java.util.List;


@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class User {
    String name;
    String password;
    List<Character> characters;
}
