package com.gtsoft.study.carinfo.comm;

public final class Info {

	private String name;
	private long price;
	private String desc;
	private int type;
	
	public Info(String name, long price, String desc, int type) {
		this.name = name;
		this.price = price;
		this.desc = desc;
		this.type = type;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getPrice() {
		return price;
	}
	public void setPrice(long price) {
		this.price = price;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Info [name=");
		builder.append(name);
		builder.append(", price=");
		builder.append(price);
		builder.append(", desc=");
		builder.append(desc);
		builder.append(", type=");
		builder.append(type);
		builder.append("]");
		return builder.toString();
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}
	
}
