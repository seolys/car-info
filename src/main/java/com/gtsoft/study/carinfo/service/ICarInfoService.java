package com.gtsoft.study.carinfo.service;

import com.gtsoft.study.carinfo.comm.ICarInfo;
import com.gtsoft.study.carinfo.comm.ICarInfo.CARINFO_TYPE;

public interface ICarInfoService {

	public ICarInfo getCarInfo(CARINFO_TYPE type);
}
