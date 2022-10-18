package com.gtsoft.study.carinfo.option.ex;

import com.gtsoft.study.carinfo.comm.IOption;
import com.gtsoft.study.carinfo.comm.Option;

public class AirbackInfo extends Option implements IOption {
	private final static String OPT_CODE = "AIRBACK";
	private final static  String FILE_NAME = "res/AirbackData.txt"; 
	
	private boolean defaultOpt = false;

	public AirbackInfo() {
		super();
	}

	public AirbackInfo(boolean def) {
		super(def);
	}
	
	@Override
	protected void setFilename() {
		filename = FILE_NAME;
	}

	@Override
	public void setOptionCode() {
		optionCode = OPT_CODE;
	}

	@Override
	public void setDefault() {
		isDefault = defaultOpt;
	}
}
