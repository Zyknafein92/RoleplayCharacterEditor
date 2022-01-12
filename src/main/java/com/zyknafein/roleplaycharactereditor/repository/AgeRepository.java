package com.zyknafein.roleplaycharactereditor.repository;

import com.zyknafein.roleplaycharactereditor.models.Age;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AgeRepository extends CrudRepository<Age,Long> {
}
