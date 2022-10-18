package com.gtsoft.study.carinfo.cars;

import com.gtsoft.study.carinfo.comm.ICarInfo;
import com.gtsoft.study.carinfo.option.ex.AirbackInfo;

public class CarInfoEx extends DefaultCarInfo implements ICarInfo{

	@Override
	public void setInfo() {
		// 기본정보 설정
		super.setInfo();

		// 에어백정보 설정
//		this.setAirback(new AirbackInfo());
		addOptPool(new AirbackInfo());
	}


//	public IAirback getAirback() {
//		return airback;
//	}
//
//
//	public void setAirback(IAirback airback) {
//		this.airback = airback;
//	}


//	public long getTotPrice() {
////		this.totPrice = super.getTotPrice() + airback.getOption().getPrice();
//		return totPrice;
//	}
}
