package com.zyknafein.roleplaycharactereditor.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Knowledge {
    String name;
    Integer value;
}
