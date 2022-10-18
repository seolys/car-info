package com.gtsoft.study.carinfo.comm;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Collection;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;

/**
 * @author Jason
 *
 */
public abstract class Option {
	protected String filename = "";
	protected String optionCode;

	private Info defOptionInfo;
	private Map<String, Info> optionInfos;

	protected boolean isDefault = true;

	protected abstract void setFilename();

	public Option() {
		setDefault();
		setOptionCode();
		setFilename();
		setFileData();
	}

	public Option(boolean def) {
		this.isDefault = def;
		setOptionCode();
		setFilename();
		setFileData();
	}

	public Info getDefOption() {
		return defOptionInfo;
	}

	public void setOptionInfo(Info info) {
		this.defOptionInfo = info;
	}

	public Map<String, Info> getOptionInfos() {
		return optionInfos;
	}

	public void setOptionInfos(Map<String, Info> infos) {
		this.optionInfos = infos;
	}

	public void addOptionInfo(Info info) {
		if (optionInfos == null)
			this.optionInfos = new Hashtable<String, Info>();
		this.optionInfos.put(info.getName(), info);
	}

	protected void setFileData() {
		if (this.filename == null || this.filename.equals("")) {
			throw new RuntimeException("File name is null");
		}

		BufferedReader in = null;
		try {
			in = new BufferedReader(new FileReader(filename));

			String strLine = "";
			String str = "";
			while ((str = in.readLine()) != null) {
				strLine = new String(str.getBytes());
				String[] tmp = strLine.split(",");
				// 값 validation 체크 로직 필요
				Info info = new Info(tmp[1], Long.parseLong(tmp[2]), tmp[3], Integer.parseInt(tmp[0]));

				if (this.defOptionInfo == null && isDefault()) this.defOptionInfo = info; // 최초 한번만 설정 default

				addOptionInfo(info); // option 리스트 추가

			}
		} catch (Exception e) {
			throw new RuntimeException("Option 파일 파싱 오류", e);
		} finally {
			if (in != null)
				try {
					in.close();
				} catch (Exception igno) {
				}
		}

	}

	@Override
	public String toString() {
		final int maxLen = 10;
		StringBuilder builder = new StringBuilder();
		builder.append("Option [filename=");
		builder.append(filename);
		builder.append(", option=");
		builder.append(defOptionInfo);
		builder.append(", options=");
		builder.append(optionInfos != null ? toString(optionInfos.entrySet(), maxLen)
				: null);
		builder.append("]");
		return builder.toString();
	}

	private String toString(Collection<?> collection, int maxLen) {
		StringBuilder builder = new StringBuilder();
		builder.append("[");
		int i = 0;
		for (Iterator<?> iterator = collection.iterator(); iterator.hasNext()
				&& i < maxLen; i++) {
			if (i > 0)
				builder.append(", ");
			builder.append(iterator.next());
		}
		builder.append("]");
		return builder.toString();
	}

	public String getOptionCode() {
		return optionCode;
	}

	public abstract void setOptionCode();

	public boolean isDefault() {
		return isDefault;
	}

	public void setDefault() {	}

}
