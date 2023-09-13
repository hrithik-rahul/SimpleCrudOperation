package com.rahul.CrudOperation.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rahul.CrudOperation.bean.Subject;
import com.rahul.CrudOperation.repositary.SubjectRepositary;

@Service
public class SubjectService {
	
	@Autowired //auto wired is used to create a object of subjectrepositary
	public SubjectRepositary subjectrepo;
	
public List<Subject> getAllSubject(){
		List<Subject> subjects=new ArrayList<>();
		subjectrepo.findAll().forEach(subjects::add); //here for each loop gett all the subjects and add tthem to subjects list
//from the database finaall() will iterate the objects through for each loop and they will add it to subjects(list)
		return subjects;
	}

public void addSubject(Subject subject) {
	subjectrepo.save(subject);
	
}
public void updateSubject(String id, Subject subject) {
	subjectrepo.save(subject); // if object is not there thn save method will create one or else if there is object thn this wil update 
	
}
	


public void deleteSubject(String id) {
	subjectrepo.deleteById(id);
	
}


	

}
