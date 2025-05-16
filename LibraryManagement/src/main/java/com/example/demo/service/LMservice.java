package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.model.LMmodel;
import com.example.demo.repository.LMrepository;

@Service
public class LMservice {
	@Autowired
	private LMrepository repo;
	//PostMapping
	public ResponseEntity<Object> addData(@RequestBody LMmodel lm){
		try {
		LMmodel obj= new LMmodel(lm.getISBN(),lm.getTitle(),lm.getAuthor(),lm.getDescription(),lm.getGenere(),
				lm.getPublicationYear(),lm.getCopiesAvailable(),lm.getPublisher(),lm.getCoverImageUrl());
	  repo.save(obj);
	  return ResponseEntity.status(HttpStatus.CREATED).build();
		}
		catch(Exception e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		}
		}
	
		//GetMapping
		public ResponseEntity <Object> listdata(){
			List<LMmodel> ldata= repo.findAll();
			if(ldata.isEmpty()) {
				return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("NO Data found");
			}
			else {
				return ResponseEntity.status(HttpStatus.OK).body(ldata);
			}
		}

		//DeleteMapping
	public	ResponseEntity<Object> deletebyid (@PathVariable int id){
			if(repo.existsById(id)) {
			repo.deleteById(id);
			
				return ResponseEntity.status(HttpStatus.OK).body("Id deleted successfully");
		}
			
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
			
		}

		//Update
		public  ResponseEntity<Object> update (@PathVariable int id, @RequestBody LMmodel lm){
			Optional<LMmodel> op=repo.findById(id);
			if(op.isEmpty()) {
				return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Id not found");
			}
			lm.setId(id);
			LMmodel lmr=repo.save(lm);
			return ResponseEntity.status(HttpStatus.OK).body(lmr);
			
		}
	
	
	}

	

