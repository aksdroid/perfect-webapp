package org.aksdroid.play.perfectwebapp.repositories;

import org.aksdroid.play.perfectwebapp.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {

}
