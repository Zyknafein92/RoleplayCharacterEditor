package com.zyknafein.roleplaycharactereditor.repository;

import com.zyknafein.roleplaycharactereditor.models.Character;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CharacterRepository extends CrudRepository<Character, Long> {
}
