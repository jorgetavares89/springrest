package br.com.sample.springrest.service;

import java.util.List;

public interface CrudService<T, K> {
	
	public T save(T obj);
	public T update(T obj);
	public T findOne(K id);
	public List<T> findAll();
	public void delete(K id);

}
