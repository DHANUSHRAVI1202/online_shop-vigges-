package com.example.onlinestore.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.onlinestore.model.Category;
import com.example.onlinestore.repository.CategoryRepository;

@Service
public class CategorySer {
   @Autowired
   CategoryRepository cr;
   
   public Category saveinfo(Category c)
   {
	   return cr.save(c);
   }
}
