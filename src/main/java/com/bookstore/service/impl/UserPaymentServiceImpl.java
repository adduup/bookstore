package com.bookstore.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookstore.model.UserPayment;
import com.bookstore.repository.UserPaymentRepository;
import com.bookstore.service.UserPaymentService;

@Service
public class UserPaymentServiceImpl implements UserPaymentService {

	@Autowired
	UserPaymentRepository userPaymentRepository;

	@Override
	public UserPayment findById(Long id) {
		Optional<UserPayment> result = userPaymentRepository.findById(id);

		UserPayment userPayment = null;

		if (result.isPresent()) {
			userPayment = result.get();
		} else {
			// we didn't find the employee
			throw new RuntimeException("Did not find userPayment id - " + id);
		}

		return userPayment;
	}

	@Override
	public void removeById(Long id) {
		userPaymentRepository.deleteById(id);
	}

}
