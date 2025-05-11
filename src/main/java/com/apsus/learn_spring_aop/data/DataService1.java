package com.apsus.learn_spring_aop.data;


import org.springframework.stereotype.Repository;


@Repository
public class DataService1 {


	public int[] retrieveData(){
		return new int[]{1,2,999,43,555};
	}
}
