package com.eteam.web02.vo;

public class Sample {
	private int sampleId;
	private String smapleName;
	public int getSampleId() {
		return sampleId;
	}
	public void setSampleId(int sampleId) {
		this.sampleId = sampleId;
	}
	public String getSmapleName() {
		return smapleName;
	}
	public void setSmapleName(String smapleName) {
		this.smapleName = smapleName;
	}
	@Override
	public String toString() {
		return "Sample [sampleId=" + sampleId + ", smapleName=" + smapleName + "]";
	}
	
	
}
