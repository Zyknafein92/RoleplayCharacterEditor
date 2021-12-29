package com.zyknafein.roleplaycharactereditor.models.enums;

public enum JobEnum {
    SOLDAT("Soldat"),
    CHASSEUR("Chasseur"),
    ASSASSIN("Assassin"),
    MAGE("Mage"),
    SCIENTIFIQUE("Scientifique"),
    ARTISAN("Artisan"),
    AUTRE("Autre");

    public String description;

    JobEnum(String description) {
        this.description = description;
    }
}
