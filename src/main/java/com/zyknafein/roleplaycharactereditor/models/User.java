package com.zyknafein.roleplaycharactereditor.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;


@Getter
@Setter
@NoArgsConstructor
public class User {
    String name;
    String password;
    List<Character> characters;
}
