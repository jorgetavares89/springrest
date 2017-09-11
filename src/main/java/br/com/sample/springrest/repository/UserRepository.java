package br.com.sample.springrest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.sample.springrest.entity.User;

public interface UserRepository extends JpaRepository<User, Long>{

	public User findByName(String name);
	
	
	
}
