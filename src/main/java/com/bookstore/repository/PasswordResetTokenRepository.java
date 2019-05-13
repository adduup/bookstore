package com.bookstore.repository;

import java.util.Date;
import java.util.stream.Stream;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.bookstore.model.User;
import com.bookstore.model.security.PasswordResetToken;

public interface PasswordResetTokenRepository extends JpaRepository<PasswordResetToken, Long> {

	PasswordResetToken findByToken(String token);

	PasswordResetToken findByUser(User user);

	Stream<PasswordResetToken> findAllByExperationDateLessThan(Date now);

	@Modifying
	@Query(value = "delete * from password_reset_token where experation_date = %?1%", nativeQuery = true)
	void deleteAllExpiredSince(@Param("now") Date now);

}
