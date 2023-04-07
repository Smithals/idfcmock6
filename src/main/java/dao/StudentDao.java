package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import dto.StudentDto;

public class StudentDao {

	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("dev");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	public void insert(StudentDto dto)
	{
		entityTransaction.begin();
		entityManager.persist(dto);
		entityTransaction.commit();
	}
	 public StudentDto findbyId(int id)
	 {
		 StudentDto dto=entityManager.find(StudentDto.class, id);
		 return dto;
	 }
	 public void deleteData(StudentDto dto)
	 {
		 entityTransaction.begin();
		 entityManager.remove(dto);
		 entityTransaction.commit(); 
	 }
	 public void updateData(StudentDto dto)
	 {
		 entityTransaction.begin();
		 entityManager.merge(dto);
		 entityTransaction.commit();
	 }
	 public StudentDto fetchData(int id){
		 entityTransaction.begin();
		 StudentDto dto=entityManager.find(StudentDto.class, id);
		 entityTransaction.commit();
		 return dto;
		 
	 }
	 

}

