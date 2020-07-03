package com.how2java.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.how2java.pojo.Category;
import com.how2java.pojo.Product;

public class TestSpring {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(new String[] { "applicationContext.xml" });
		
		// get a category object from spring
		Category c = (Category) context.getBean("c");
		Product p = (Product) context.getBean("p");

		System.out.println("Category c name is " + c.getName() + ", id is " + c.getId());
		System.out.println("Category name of Product p is " + p.getCategory().getName());
	}
}