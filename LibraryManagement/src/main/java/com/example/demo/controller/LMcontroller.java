package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.LMmodel;
import com.example.demo.service.LMservice;

@RestController
@RequestMapping("/book")
public class LMcontroller {
@Autowired
private LMservice serv;
@PostMapping("/add")
public ResponseEntity<Object> insert(@RequestBody LMmodel mm){
	return serv.addData(mm);
}

@GetMapping("/get")
public ResponseEntity<Object> fetch(){
	return serv.listdata();
}
@DeleteMapping("/delete/{id}")
public ResponseEntity<Object> deletebyone(@PathVariable int id){
	return serv.deletebyid(id);
}
@PutMapping("/update/{id}")
public ResponseEntity<Object> updateid(@PathVariable int id,@RequestBody LMmodel ml){
	return serv.update(id, ml);
}

}
