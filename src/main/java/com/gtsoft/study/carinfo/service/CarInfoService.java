package com.gtsoft.study.carinfo.service;

import com.gtsoft.study.carinfo.comm.CarInfoFactory;
import com.gtsoft.study.carinfo.comm.ICarInfo;
import com.gtsoft.study.carinfo.comm.ICarInfo.CARINFO_TYPE;

public class CarInfoService implements ICarInfoService {

	@Override
	public ICarInfo getCarInfo(CARINFO_TYPE type) {
		CarInfoFactory factory = CarInfoFactory.getInstance();
		return (ICarInfo) factory.getCarInfo(type);
	}

}
