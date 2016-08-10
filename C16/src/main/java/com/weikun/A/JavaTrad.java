package com.weikun.A;

public class JavaTrad implements Trad {
	private Teacher tea;
	
	public Teacher getTea() {
		return tea;
	}

	public void setTea(Teacher tea) {
		this.tea = tea;
	}

	@Override
	public void jiangke() {
		// TODO Auto-generated method stub
		this.tea.teching("java");
	}

}
