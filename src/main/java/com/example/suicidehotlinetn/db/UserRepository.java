package com.example.suicidehotlinetn.db;
import org.springframework.data.repository.CrudRepository;

import com.example.suicidehotlinetn.db.User;
public interface UserRepository extends CrudRepository<User,Integer> {
}
