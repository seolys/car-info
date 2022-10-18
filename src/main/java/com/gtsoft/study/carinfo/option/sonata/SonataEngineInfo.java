package com.gtsoft.study.carinfo.option.sonata;

import com.gtsoft.study.carinfo.comm.IOption;
import com.gtsoft.study.carinfo.comm.Option;

public class SonataEngineInfo extends Option implements IOption {
	private final static String OPT_CODE = "SONATA_ENGINE";
	private final static String FILENAME = "res/SonataEngineData.txt";

	@Override
	protected void setFilename() {
		filename = FILENAME;
	}

	@Override
	public void setOptionCode() {
		optionCode = OPT_CODE;
	}

}
