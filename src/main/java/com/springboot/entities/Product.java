package com.springboot.entities;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Product {
	
	@Id
      public ObjectId _id;
	  public String name;
	  public String desc;
}

