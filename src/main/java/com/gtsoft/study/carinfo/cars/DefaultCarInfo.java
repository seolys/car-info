package com.gtsoft.study.carinfo.cars;

import com.gtsoft.study.carinfo.comm.AbstractCarInfo;
import com.gtsoft.study.carinfo.comm.ICarInfo;
import com.gtsoft.study.carinfo.option.DefaultBodyInfo;
import com.gtsoft.study.carinfo.option.DefaultEngineInfo;
import com.gtsoft.study.carinfo.option.DefaultWheelInfo;

public class DefaultCarInfo extends AbstractCarInfo implements ICarInfo {

	@Override
	public void setInfo() {
		// 엔진정보 설정
		addOptPool(new DefaultEngineInfo());
		// 몸체정보 설정
		addOptPool(new DefaultBodyInfo());
		// 바퀴정보 설정
		addOptPool(new DefaultWheelInfo());

	}
}
