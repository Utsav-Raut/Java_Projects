package easy;

//I = 1
//V = 5
//X = 10
//L = 50
//C = 100
//D = 500
//M = 1000
//
//IV = 4, IX = 9
//XL = 40, XC = 90
//CD = 400, CM = 900

public class RomanToInt {
	
	public static int valueOf(char ch) {
		if(ch == 'I')
			return 1;
		else if(ch == 'V')
			return 5;
		else if(ch == 'X')
			return 10;
		else if(ch == 'L')
			return 50;
		else if(ch == 'C')
			return 100;
		else if(ch == 'D')
			return 500;
		else if(ch == 'M')
			return 1000;
		else
			return 0;
	}
	
	public static int romanToInt(String str) {
		int res = 0;
		for(int i=0; i < str.length(); i++) {
			int s1 = valueOf(str.charAt(i));
			if(i+1 < str.length()) {
				int s2 = valueOf(str.charAt(i+1));
				if(s1 >= s2)
					res = res + s1;
				else {
					res = res + s2 - s1;
					i++;
				}
			}
			else {
				res = res + s1;
			}
		}
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "MCMIV";
		int integerVal = romanToInt(str);
		System.out.println(integerVal);
	}

}
