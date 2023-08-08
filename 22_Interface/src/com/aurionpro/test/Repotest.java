package com.aurionpro.test;

import com.auriopro.model.Irepository;
import com.auriopro.model.OrderRepoitory;
import com.auriopro.model.ProductRepo;

public class Repotest {
	public static void main(String[] args) {
		OrderRepoitory obj1 =new OrderRepoitory();
		ProductRepo obj2=new ProductRepo();
		dbOperations(obj1);
		dbOperations(obj2);
	}

	private static void dbOperations(Irepository repo) {
		repo.create();
		repo.read();
		repo.update();
		repo.delete();
		
	}

}
