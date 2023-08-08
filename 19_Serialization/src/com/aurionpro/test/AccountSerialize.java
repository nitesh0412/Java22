package com.aurionpro.test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import com.aurionpro.model.Account;

public class AccountSerialize {

	public static void main(String[] args) {
		Account acc = new Account(1,"Nitesh",100);
		
		String file = "C://Users//nitesh.kumawat//Documents";
		
		try {
			FileOutputStream fos = new FileOutputStream(file);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(acc);
			
			oos.close();
			fos.close();
			System.out.println("Object saved ");
		} catch(FileNotFoundException e){
			e.printStackTrace();
			
		}catch (IOException e)
		{
			e.printStackTrace();
		}
		
		
	}
}
