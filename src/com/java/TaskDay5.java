package com.java;
public class TaskDay5 {
	public static void main(String[] agrs) {
		TaskDay5  tk=new TaskDay5();
		System.out.println("Total population in india = "+tk.countryIndia());
		System.out.println("Total population in italy= "+tk.countryItaly());
		System.out.println("Total population in france= "+tk.countryfrance());
		System.out.println("Total population in netherlands= "+tk.countrynetherlands());
		
	}public long countryIndia() {
			long malecount=1000000000;
			long femalecount=1200000000;
			long totalpopulation=malecount+femalecount;
			return totalpopulation;
			}
		public long countryItaly() {
			long malecount=20000000;
			long femalecount=120000000;
			long totalpopulation=malecount+femalecount;
			return totalpopulation;
			}
		public long countryfrance() {
			long malecount=13000000;
			long femalecount=1000000;
			long totalpopulation=malecount+femalecount;
			return totalpopulation;
			}
		public long countrynetherlands() {
			long malecount=11100000;
			long femalecount=123000000;
			long totalpopulation=malecount+femalecount;
			return totalpopulation;
			}
		
	
}
