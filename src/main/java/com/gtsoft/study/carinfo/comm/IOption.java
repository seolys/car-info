package com.gtsoft.study.carinfo.comm;

import java.util.Map;


public interface IOption {
	public String getOptionCode();
	public Info getDefOption();
	public Map<String, Info> getOptionInfos();
	public void setOptionInfo(Info engine);
}
