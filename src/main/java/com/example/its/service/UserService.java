package com.example.its.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.its.model.UserModel;
import com.example.its.repository.UserRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserService {
	
	private final UserRepository userRepository;
	
	public List<UserModel> findAll() {
		return userRepository.findAll();
	}

}
