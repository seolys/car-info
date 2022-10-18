package com.gtsoft.study.carinfo.cars;

import com.gtsoft.study.carinfo.comm.ICarInfo;
import com.gtsoft.study.carinfo.option.ex.AirbackInfo;
import com.gtsoft.study.carinfo.option.ex.ExOption;

public class CarInfo2 extends DefaultCarInfo implements ICarInfo {

	@Override
	public void setInfo() {
		// 기본정보 설정
		super.setInfo();

		// 에어백정보 설정
		super.addOptPool(new AirbackInfo());
		// 확장 옵션
		super.addOptPool(new ExOption());
	}


}
