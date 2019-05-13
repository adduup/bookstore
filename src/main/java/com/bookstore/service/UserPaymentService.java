package com.bookstore.service;

import com.bookstore.model.UserPayment;

public interface UserPaymentService {

	UserPayment findById(Long id);

	void removeById(Long id);

}
