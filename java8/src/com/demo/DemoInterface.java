package com.demo;

import java.util.ArrayList;
import java.util.List;

import org.omg.CosNaming.NamingContextExtPackage.StringNameHelper;

interface Parser{
	String parse(String str);
}

abstract class StringParser{
	public static String convert(String s){
		if(s.length()<=3){
			s=s.toUpperCase();
		}else{
			s=s.toLowerCase();
		}
		return s;
	}
	
	static String display(String s){
		return "hello";
	}
}
class MyPrinter{
	public void print(String str, Parser p){
		String st = p.parse(str);
		System.out.println(st);
	}
}

public class DemoInterface {

	public static void main(String[] args) {

//		Parser p = new Parser(){
//			public String parse(String s){
//				 return StringParser.convert(s);
//			}
//		};
			String str = "Shubhendu";
			MyPrinter mp = new MyPrinter();
			mp.print(str,StringParser::display);
			
		

		
		
	}

}
