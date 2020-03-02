package com.epam.Logger;

public class House {
	double area;
	int opt;
	public House(double area,int opt) {
	this.area=area;
	this.opt=opt;
	}
	int arcost[]= {1200,1500,1800,2500};
	public double hou() {
	return area*arcost[this.opt-1];
	}
}
