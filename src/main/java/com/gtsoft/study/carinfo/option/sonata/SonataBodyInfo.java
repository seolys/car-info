package com.gtsoft.study.carinfo.option.sonata;

import com.gtsoft.study.carinfo.comm.IOption;
import com.gtsoft.study.carinfo.comm.Option;

public class SonataBodyInfo extends Option implements IOption {
	private final static String OPT_CODE = "SONATA_BODY";
	private final static String FILENAME = "res/SonataBodyData.txt";

	@Override
	protected void setFilename() {
		filename = FILENAME;
	}

	@Override
	public void setOptionCode() {
		optionCode = OPT_CODE;
	}

}
