package com.apsus.learn_spring_aop.business;


import com.apsus.learn_spring_aop.data.DataService2;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class BusinessService2 {

	private final DataService2 dataService2;

	public BusinessService2(DataService2 dataService2) {
		this.dataService2 = dataService2;
	}

	public int calculateMint(){
		int [] data = dataService2.getData();

		return Arrays.stream(data).min().orElse(0);
	}
}
