package com.bookstore.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookstore.model.UserShipping;
import com.bookstore.repository.UserShippingRepository;
import com.bookstore.service.UserShippingService;

@Service
public class UserShippingServiceImpl implements UserShippingService {

	@Autowired
	private UserShippingRepository userShippingRepository;

	@Override
	public UserShipping findById(Long shippingAddressId) {
		Optional<UserShipping> result = userShippingRepository.findById(shippingAddressId);

		UserShipping userShipping = null;

		if (result.isPresent()) {
			userShipping = result.get();
		} else {
			// we didn't find the employee
			throw new RuntimeException("Did not find userShipping id - " + shippingAddressId);
		}

		return userShipping;
	}

	@Override
	public void removeById(Long userShippingId) {
		userShippingRepository.deleteById(userShippingId);

	}

}
