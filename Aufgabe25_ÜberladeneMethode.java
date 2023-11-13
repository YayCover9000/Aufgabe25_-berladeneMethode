
public class Aufgabe25_ÜberladeneMethode {
	public static void main (String [] args) {
		double ONE = 1.5;
		double TWO = 2.0;
		double res = 0;
		
		res = DoubleMax(ONE,TWO,res);
		System.out.println(res + " ist die groessere Zahl");
		
		char C1 = 'z'; 
		char C2 = 'A';
		char Cres = '\u0000'; //'\u0000' ist default Wert von Char
		
		Cres = CharMax(C1,C2,Cres);
		System.out.println(Cres + " ist der groessere Char");
	}
	private static double DoubleMax(double ONE, double TWO, double res) {
		res = ONE>TWO?ONE:TWO;
		return res;
	}
	private static char CharMax(char C1, char C2, char Cres) {
		Cres = C1>C2?C1:C2;
		return Cres;
	}
}
