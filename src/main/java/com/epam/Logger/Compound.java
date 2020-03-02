package com.epam.Logger;

public class Compound {
	double p;
	  double t;
	  double r;
	  public Compound(double p,double t,double r){
	  this.p=p;
	  this.t=t;
	  this.r=r;
	  }
	  public double comp() {
	  return Math.round((this.p*Math.pow(1+this.r/100.0,this.t)));
	  }
}
