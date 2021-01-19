package com.bezkoder.springjwt.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/record")
public class FLRecordManagerController {
	
	
	@PostMapping("/create")
	private String createRecord()
	{
		return null;
		
	}
	
	@PostMapping("/edit")
	private String editRecord()
	{
		return null;
		
	}
	
	@PostMapping("/getrecord")
	private String getRecordByID()
	{
		return null;
		
	}
	@PostMapping("/upload")
	private String uploadfile()
	{
		return null;
		
	}
	
}
