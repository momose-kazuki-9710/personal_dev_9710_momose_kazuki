package com.example.demo.repository;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.entity.Category;
import com.example.demo.entity.Guest;

public interface CategoryRepository extends JpaRepository<Category, Integer>{

	@Query(value="SELECT name "
			+ "FROM category "
			+ "WHERE id = ?1", nativeQuery = true)
	String serchNameById(Integer categoryId);
	
	//名前による検索
	@Query(value="SELECT * "
			+ "FROM category "
			+ "WHERE name LIKE ?1", nativeQuery = true)
	List <Category> findByName(String keyword, Sort sort);

}
