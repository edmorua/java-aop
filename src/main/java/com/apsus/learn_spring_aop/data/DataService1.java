package com.apsus.learn_spring_aop.data;


import org.springframework.stereotype.Repository;


@Repository
public class DataService1 {


	public int[] retrieveData(){

		try {
			Thread.sleep(500);
		}catch (Exception e){
			e.printStackTrace();
		}
		return new int[]{1,2,999,43,555};
	}
}
