package com.tkaRepository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tkaEntity.User;
@Repository
public interface UserRepository  extends JpaRepository<User, Long>{
	Optional<User> findByName(String userName);
}
