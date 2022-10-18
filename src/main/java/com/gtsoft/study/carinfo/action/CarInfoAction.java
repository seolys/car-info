package com.gtsoft.study.carinfo.action;

import java.util.Iterator;
import java.util.Map;

import com.gtsoft.study.carinfo.comm.ICarInfo;
import com.gtsoft.study.carinfo.comm.ICarInfo.CARINFO_TYPE;
import com.gtsoft.study.carinfo.comm.Info;
import com.gtsoft.study.carinfo.comm.Option;
import com.gtsoft.study.carinfo.service.CarInfoService;
import com.gtsoft.study.carinfo.service.ICarInfoService;

public class CarInfoAction {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ICarInfoService service = new CarInfoService();
		ICarInfo carinfo = service.getCarInfo(CARINFO_TYPE.CAR);

		Map<String, Option> optionmap = carinfo.getOptPool();


		System.out.println("CAR 기본정보=============================================");
		Iterator<?> iter = optionmap.keySet().iterator();
		while (iter.hasNext()) {
			String key = (String) iter.next();
			Option option = optionmap.get(key);
			Info defaultInfo = option.getDefOption();
			if (defaultInfo == null) {
				System.out.println(option.getOptionCode() + "는 기본이 아닙니다.");
			} else {
				System.out.println(option.getOptionCode() + "명:" + defaultInfo.getName());
				System.out.println(option.getOptionCode() + "금액:" + defaultInfo.getPrice());
			}

		}
		System.out.println("총금액:" + carinfo.getTotPrice());

		System.out.println(">>>>>>>>>>>>>> CAR의 ENGINE 옵션을 2.7cc엔진으로 변경");
		Info targetInfo = optionmap.get("ENGINE").getOptionInfos().get("2.7cc엔진");
		carinfo.setDefOption("ENGINE", targetInfo);

		System.out.println("CAR 변경정보=============================================");
		iter = optionmap.keySet().iterator();
		while (iter.hasNext()) {
			String key = (String) iter.next();
			Option option = optionmap.get(key);
			Info defaultInfo = option.getDefOption();
			if (defaultInfo == null) {
				System.out.println(option.getOptionCode() + "는 기본이 아닙니다.");
			} else {
				System.out.println(option.getOptionCode() + "명:" + defaultInfo.getName());
				System.out.println(option.getOptionCode() + "금액:" + defaultInfo.getPrice());
			}

		}
		System.out.println("총금액:" + carinfo.getTotPrice());

		carinfo = service.getCarInfo(CARINFO_TYPE.CAR2);
		optionmap = carinfo.getOptPool();

		System.out.println("CAR2 기본정보=============================================");
		iter = optionmap.keySet().iterator();
		while (iter.hasNext()) {
			String key = (String) iter.next();
			Option option = optionmap.get(key);
			Info defaultInfo = option.getDefOption();
			if (defaultInfo == null) {
				System.out.println(option.getOptionCode() + "는 기본이 아닙니다.");
			} else {
				System.out.println(option.getOptionCode() + "명:" + defaultInfo.getName());
				System.out.println(option.getOptionCode() + "금액:" + defaultInfo.getPrice());
			}

		}
		System.out.println("총금액:" + carinfo.getTotPrice());

		carinfo = service.getCarInfo(CARINFO_TYPE.SONATA);
		optionmap = carinfo.getOptPool();

		System.out.println("SONATA 기본정보=============================================");
		iter = optionmap.keySet().iterator();
		while (iter.hasNext()) {
			String key = (String) iter.next();
			Option option = optionmap.get(key);
			Info defaultInfo = option.getDefOption();
			if (defaultInfo == null) {
				System.out.println(option.getOptionCode() + "는 기본이 아닙니다.");
			} else {
				System.out.println(option.getOptionCode() + "명:" + defaultInfo.getName());
				System.out.println(option.getOptionCode() + "금액:" + defaultInfo.getPrice());
			}

		}
		System.out.println("총금액:" + carinfo.getTotPrice());

		System.out.println(">>>>>>>>>>>>>> SONATAd의 AIRBACK 옵션을 전방에어백으로 변경");
		targetInfo = optionmap.get("AIRBACK").getOptionInfos().get("전방에어백");
		carinfo.setDefOption("AIRBACK", targetInfo);

		carinfo = service.getCarInfo(CARINFO_TYPE.SONATA);
		optionmap = carinfo.getOptPool();

		System.out.println("SONATA 변경정보=============================================");
		iter = optionmap.keySet().iterator();
		while (iter.hasNext()) {
			String key = (String) iter.next();
			Option option = optionmap.get(key);
			Info defaultInfo = option.getDefOption();
			if (defaultInfo == null) {
				System.out.println(option.getOptionCode() + "는 기본이 아닙니다.");
			} else {
				System.out.println(option.getOptionCode() + "명:" + defaultInfo.getName());
				System.out.println(option.getOptionCode() + "금액:" + defaultInfo.getPrice());
			}

			Map<String, Info> opts = option.getOptionInfos();
			Iterator<?> iter1 = opts.keySet().iterator();
			while (iter1.hasNext()) {
				String key1 = (String) iter1.next();
				Info info = opts.get(key1);
				System.out.println("opts = " + info.getName());
			}


		}

		System.out.println("총금액:" + carinfo.getTotPrice());

	}

}
