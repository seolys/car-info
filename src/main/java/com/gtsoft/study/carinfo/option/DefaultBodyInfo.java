package com.gtsoft.study.carinfo.option;

import com.gtsoft.study.carinfo.comm.IOption;
import com.gtsoft.study.carinfo.comm.Option;

public class DefaultBodyInfo extends Option implements IOption {
	private final static String OPT_CODE = "BODY";
	private final static String FILE_NAME = "res/BodyData.txt"; 
	
	@Override
	protected void setFilename() {
		filename = FILE_NAME;
	}

	@Override
	public void setOptionCode() {
		optionCode = OPT_CODE;
	}
}
