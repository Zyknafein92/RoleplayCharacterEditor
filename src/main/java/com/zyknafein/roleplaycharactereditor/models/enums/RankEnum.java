package com.zyknafein.roleplaycharactereditor.models.enums;

import javax.persistence.Enumerated;

public enum RankEnum {
    CIVIL("Civil"),
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
