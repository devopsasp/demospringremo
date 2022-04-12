package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;

import com.dao.ItemService;
import com.model.*;
@RestController
public class ItemRestController {
	
	@Autowired
	ItemService service;
  
	   @GetMapping("/getitems")
	   public List<Item> getAllItems()
	   {
		   return service.findAll();
	   }
	   
	   @PostMapping("/additem")
	   public String addItem(@RequestBody Item item)
	   {
		service.add(item);
		return "item added successfully";
	   }

}
