package com.example.onlinestore.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.onlinestore.model.BillingInfo;
import com.example.onlinestore.repository.BillingInfoRepository;

@Service
public class BillingInfoSer {
    @Autowired
    BillingInfoRepository b;
    
    public BillingInfo saveinfo(BillingInfo i)
    {
    	return b.save(i);
    }
    
    public String updateinfobyid(int id, BillingInfo s)
    {
    	b.saveAndFlush(s);
    	if(b.existsById(id))
    	{
    		return "updated";
    	}
		return "enter valid id";
    }
    public String deleteid(int id,BillingInfo s)
    {
    	 b.deleteById(id);
    	 return "Deleted Successfully";
    }
}
