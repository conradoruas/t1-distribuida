package com.ine5418.user.services;

import java.util.List;
import org.springframework.stereotype.Service;
import com.ine5418.user.models.UserModel;
import com.ine5418.user.producers.UserProducer;
import com.ine5418.user.repositories.UserRepository;
import jakarta.transaction.Transactional;

@Service
public class UserService {
	final UserRepository userRepository;
	final UserProducer userProducer;

	public UserService(UserRepository userRepository, UserProducer userProducer) {
		this.userRepository = userRepository;
		this.userProducer = userProducer;
	}

	@Transactional
	public UserModel save(UserModel userModel) {
		userModel = userRepository.save(userModel);
		userProducer.publishMessageEmail(userModel);
		return userModel;
	}

	public List<UserModel> findAll() {
		return userRepository.findAll();
	}

}
