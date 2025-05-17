package com.apsus.learn_spring_aop.data;

import com.apsus.learn_spring_aop.annotations.TrackTime;
import org.springframework.stereotype.Repository;

@Repository
public class DataService2 {

	@TrackTime
	public int[] getData(){
		try{
			Thread.sleep(1400);
		}catch (Exception e){
			e.printStackTrace();
		}
		return new int[]{789, 31, 90, 9,12, 33};
	}
}
