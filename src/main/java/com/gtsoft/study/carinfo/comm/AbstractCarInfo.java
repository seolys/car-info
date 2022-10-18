package com.gtsoft.study.carinfo.comm;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;

public abstract class AbstractCarInfo {
	private Map<String, Option> optPool = new Hashtable<String, Option>();
	
	private long totPrice; 
	
	public AbstractCarInfo() {
		this.setInfo();
	}

	public abstract void setInfo();

	public long getTotPrice() {
		this.totPrice = 0;
		Iterator<?> iterator = optPool.keySet().iterator();
		while (iterator.hasNext()) {
			Object key = (Object) iterator.next();
			Option opt = this.optPool.get(key);
			Info defaultInfo = opt.getDefOption();
			if (defaultInfo != null) this.totPrice += defaultInfo.getPrice();
		}

		return this.totPrice;
	}

	public Map<String, Option>  getOptPool() {
		return optPool;
	}

	public void setOptPool(Map<String, Option>  optPool) {
		this.optPool = optPool;
	}
	
	public void addOptPool(Option opt) {
		this.optPool.put(opt.getOptionCode(), opt);
	}

	public void setDefOption(String key, Info info) {
		Option tmpopt = this.optPool.get(key);
		tmpopt.setOptionInfo(info);
		this.optPool.remove(key);
		this.optPool.put(key, tmpopt);
	}
}
