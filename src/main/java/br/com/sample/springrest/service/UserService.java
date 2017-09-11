package br.com.sample.springrest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.sample.springrest.entity.User;
import br.com.sample.springrest.repository.UserRepository;

@Service
public class UserService implements CrudService<User, Long>{
	
	@Autowired
	private UserRepository repository;

	@Override
	public User save(User user) {
		return repository.save(user);
	}

	@Override
	public User update(User user) {
		return repository.save(user);
	}

	@Override
	public User findOne(Long id) {
		return repository.findOne(id);
	}

	@Override
	public List<User> findAll() {
		return repository.findAll();
	}

	@Override
	public void delete(Long id) {
		repository.delete(id);
	}
	
	public boolean existing(User user) {
		User u = repository.findByName(user.getName());
		if (u != null) {
			return true;
		}
		return false;
	}
	
	public void deleteAll() {
		repository.deleteAll();
	}
	

}
