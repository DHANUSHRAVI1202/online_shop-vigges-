package com.example.onlinestore.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.onlinestore.model.BillingInfo;
import com.example.onlinestore.service.BillingInfoSer;

@RestController
public class BillingInfoController {
	private static final Logger logger=LoggerFactory.getLogger(BillingInfoController.class);
   @Autowired
   BillingInfoSer s;
   
   @PostMapping("/save")
   public BillingInfo post(@RequestBody BillingInfo b)
   {
	   System.out.println("SOP");
	   logger.info("This is Agera");
	   logger.debug("debug");
	   logger.warn("warn");
	   logger.error("error");
	   return s.saveinfo(b);
   }
   
   @PutMapping("updatebyid/{id}")
   public String modifybyid(@PathVariable int id,@RequestBody BillingInfo b)
   {
   	return s.updateinfobyid(id, b);
   }
   @DeleteMapping("deletebyid/{id}")
   
	   public String deletebyid(@PathVariable int id,@RequestBody BillingInfo b)
	   {
		   return s.deleteid(id,b);
		   
	   }
   
}
