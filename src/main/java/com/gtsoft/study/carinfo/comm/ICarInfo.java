package com.gtsoft.study.carinfo.comm;

import java.util.Map;


public interface ICarInfo {
	public enum CARINFO_TYPE {
		CAR, CAR_EX, CAR2, SONATA;
	}
	
	public Map<String, Option>  getOptPool();
	public void setDefOption(String key, Info info);
	public long getTotPrice();
}
