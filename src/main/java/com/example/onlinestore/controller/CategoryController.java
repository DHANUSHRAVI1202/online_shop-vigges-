package com.example.onlinestore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.onlinestore.model.Category;
import com.example.onlinestore.service.CategorySer;

@RestController
public class CategoryController {
   @Autowired
   CategorySer cs;
   
   @PostMapping("/postval")
   public Category post(@RequestBody Category c)
   {
	   return cs.saveinfo(c);
   }
}
