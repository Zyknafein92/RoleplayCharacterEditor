package com.zyknafein.roleplaycharactereditor.models.enums;

public enum RankEnum {
    Civil("Civil"),
    LOUVETEAU("Louveteau"),
    LOUP("Loup"),
    LOUPAGUERRI("Loup aguerri"),
    LOUPVETERAN("Loup veteran"),
    SERGENT("Sergent");

    public String description;

    RankEnum(String description) {
        this.description = description;
    }
}
