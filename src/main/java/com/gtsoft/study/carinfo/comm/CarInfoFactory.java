package com.gtsoft.study.carinfo.comm;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Hashtable;
import java.util.Map;

import com.gtsoft.study.carinfo.comm.ICarInfo.CARINFO_TYPE;

public class CarInfoFactory {
	private static CarInfoFactory factory = new CarInfoFactory();
	private final static String filename = "res/car.txt";

	private final Map<String, Object> cars = new Hashtable<String, Object>();

	private CarInfoFactory() {
		setFileData();
	}

	public static CarInfoFactory getInstance() {
		return factory;
	}

	public Object getCarInfo(CARINFO_TYPE type) {
		if (type == null) {
			throw new RuntimeException("Invalid type is null");
		}

		return this.cars.get(type.toString());
	}

	private void setFileData() {

		BufferedReader in = null;
		try {
			in = new BufferedReader(new FileReader(filename));

			String strLine = "";
			String str = "";
			while ((str = in.readLine()) != null) {
				strLine = new String(str.getBytes());
				String[] tmp = strLine.split(",");
				// 값 validation 체크 로직 필요
				Class<?> cls = Class.forName(tmp[1]);
				Object obj = cls.newInstance();
				cars.put(tmp[0], obj);

			}
		} catch (Exception e) {
			throw new RuntimeException("CAR 파일 파싱 오류", e);
		} finally {
			if (in != null)
				try {
					in.close();
				} catch (Exception igno) {
				}
		}

	}
}
