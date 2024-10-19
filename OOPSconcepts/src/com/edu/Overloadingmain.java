package com.edu;
class SeriesOverload{
	void sumSeries(int n,double x) {
		double ssum=0;
		for(int i=1;i<=n;i++) {
			if(i%2==0) {
				ssum=ssum-(double)x/i;}
			else {
				ssum=ssum+(double)x/i;
			}
		}
		System.out.println("sum of (x/1)-(x/2)+(x/3)-(x/4)=(x/5)....to n terms="+ssum);
	}
	void sumSeries() {
		int p=1,sum=0;
		for(int i=1;i<=20;i++) {
			p=1;
			for(int j=1;j<=i;j++) {
				p=p*i;}
		    sum=sum+p;
	     }
		System.out.println("sum of s= 1 + (1x2) + (1x2x3) +...+(1x2x3x4x...20)="+sum);
	
		
		}
	}




public class Overloadingmain {
	public static void main(String[] args) {
		SeriesOverload ob=new SeriesOverload();
		ob.sumSeries(2,5);
		ob.sumSeries();
		}
}
