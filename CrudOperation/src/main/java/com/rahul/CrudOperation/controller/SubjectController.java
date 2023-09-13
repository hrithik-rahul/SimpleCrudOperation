package com.rahul.CrudOperation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import com.rahul.CrudOperation.bean.Subject;
import com.rahul.CrudOperation.service.SubjectService;

@RestController
public class SubjectController {

	@Autowired
	public SubjectService subjectservice;
	
	@RequestMapping("/subjects")
	public List<Subject> getAllSubject(){
	 return	subjectservice.getAllSubject();
		
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/addsubjects")
	
	public void addSubject(@RequestBody Subject subject) {
		subjectservice.addSubject(subject);
	}
	
	@RequestMapping(method=RequestMethod.PUT,value="/updatesubjects/{id}")//value = url so we gonna take id has a url to display the data

	public void updateSubject(@PathVariable String id ,@RequestBody Subject subject) {
		subjectservice.updateSubject(id,subject);
	}
	
	@RequestMapping(value="/deletesubjects/{id}")
	public void deleteSubject(@PathVariable String id) {
		subjectservice.deleteSubject(id);
	}

}
