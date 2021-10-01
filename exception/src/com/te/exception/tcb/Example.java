package com.te.exception.tcb;

public class Example implements Cloneable {
	private int eid;
	private String ename;
	private double sal;

	
	public int hashCode() {
		// TODO Auto-generated method stub
		return this.eid;
	}

	@Override
	public boolean equals(Object obj) {
		return this.hashCode() == obj.hashCode();
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}


	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "EID = " + this.eid + ",Name =" + this.ename + ",sal= " + this.sal;
	}

	public int getEid() {
		return eid;
	}

	public double getSal() {
		return sal;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

}
