package com.zyknafein.roleplaycharactereditor.repository;

import com.zyknafein.roleplaycharactereditor.models.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
}
