package org.aksdroid.play.perfectwebapp.services;

import java.util.List;

import org.aksdroid.play.perfectwebapp.entities.User;
import org.aksdroid.play.perfectwebapp.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	@Autowired
	UserRepository userRepository;

	public List<User> findAll() {
		return userRepository.findAll();
	}
}
