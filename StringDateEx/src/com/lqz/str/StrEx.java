package com.lqz.str;
/**
 * String examples need notice
 * @Author lqz
 * @Email Cheedgelee@gmail.com
 * @Version
 * @Date Feb 28, 2022 10:08:37 AM
 * @Description
 */
public class StrEx {
	public static void main(String[] args) {
		// 1. concate string
		String str1 = "abc", str2 = "def", str0 = "abcdef";
		String str3 = str1 + "def";
		String str4 = "abc" + "def";
		String str5 = str1 + str2;
		String str6 = str3.intern();
		final String str7 = "ghi";
		String str8 = str7 + "jkl";
		System.out.println(
				"str3 "+str0.equals(str3)+
				"\nstr4 "+str0.equals(str4)+
				"\nstr5 "+str0.equals(str5)+
				"\nstr6 "+str0.equals(str6));
		System.out.println("str3: "+str0==str3);
		System.out.println("str4 "+str0==str4);
		System.out.println("str5 "+str0==str5);
		System.out.println("str6 "+str0==str6);
		System.out.println("str8 ");
		System.out.println(str8=="ghijkl");
		System.out.println("**********************");
		
		// 2. formal parameter only pass address
		StrFormalParam strFormPara = new StrFormalParam();
		StrFormalParam.change(strFormPara.strformal);
		System.out.println("fornam para: "+strFormPara.strformal);
		String str = StrFormalParam.change1(strFormPara.strformal);
		System.out.println("fornam para: "+strFormPara.strformal
				+"\nstr7: "+str);
		System.out.println("**********************");
		
		// 3. StringBuffer, StringBuilder, String
//		String sss = null;
//		StringBuffer sb = new StringBuffer();
//		sb.append(sss);
//		System.out.println(sb.length());//
//		System.out.println(sb);//
//		StringBuffer sb1 = new StringBuffer(sss);
//		System.out.println(sb1);//

	}
}
class StrFormalParam {
	String strformal = "helloJava";
	public static void change(String str) {
		str = "HelloPython";
	}
	public static String change1(String str) {
		str = "HelloPython";
		return str;
	}
}
