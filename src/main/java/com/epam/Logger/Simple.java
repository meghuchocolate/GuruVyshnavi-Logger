package com.epam.Logger;

public class Simple {
	double p;
    double t;
    double r;
    public Simple(double p,double t,double r) {
    this.p=p;
    this.t=t;
    this.r=r;
    }
    public double simp() {
    return (this.p*this.t*this.r)/100.0;
    }
}
