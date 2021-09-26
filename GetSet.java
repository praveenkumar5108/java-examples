package test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class GetSet {
	
	int id = 50;
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		GetSet obj = new GetSet();
		
		obj.setId(100);
		
		System.out.println(obj.getId());
	   
	}

}
