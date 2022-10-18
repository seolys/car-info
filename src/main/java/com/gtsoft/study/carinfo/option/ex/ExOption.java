package com.gtsoft.study.carinfo.option.ex;

import com.gtsoft.study.carinfo.comm.IOption;
import com.gtsoft.study.carinfo.comm.Option;

public class ExOption extends Option implements IOption {
	private final static String OPT_CODE = "EXOPTION";
	private final static  String FILE_NAME = "res/ExOptionData.txt"; 

	@Override
	protected void setFilename() {
		filename = FILE_NAME;
	}

	@Override
	public void setOptionCode() {
		optionCode = OPT_CODE;
	}

}
