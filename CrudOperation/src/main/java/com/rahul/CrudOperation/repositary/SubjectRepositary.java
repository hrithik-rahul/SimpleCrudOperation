package com.rahul.CrudOperation.repositary;

import org.springframework.data.repository.CrudRepository;

import com.rahul.CrudOperation.bean.Subject;

public interface SubjectRepositary extends CrudRepository<Subject,String> {

}
