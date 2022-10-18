package com.gtsoft.study.carinfo.cars;

import com.gtsoft.study.carinfo.comm.AbstractCarInfo;
import com.gtsoft.study.carinfo.comm.ICarInfo;
import com.gtsoft.study.carinfo.option.ex.AirbackInfo;
import com.gtsoft.study.carinfo.option.sonata.SonataBodyInfo;
import com.gtsoft.study.carinfo.option.sonata.SonataEngineInfo;

public class CarSonata extends AbstractCarInfo implements ICarInfo {

	@Override
	public void setInfo() {
		addOptPool(new SonataBodyInfo());
		addOptPool(new SonataEngineInfo());
		addOptPool(new AirbackInfo(false));
	}

}
