package com.zyknafein.roleplaycharactereditor.repository;

import com.zyknafein.roleplaycharactereditor.models.Language;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LanguageRepository extends CrudRepository<Language, Long> {
}
