package javaPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import com.google.common.base.CharMatcher;



public class JavaProgram {	
	
	public static void isFibonacci(int num) {
		
		int num1 =0;
		int num2=1;
		
		for(int i=0; i<num; i++) {
			System.out.print(num1+ " ");
			int num3 = num1+num2;
			num1=num2;
			num2=num3;
		}
		
	}
	
	
	
	public static void main(String[] args) {
	
		
		isFibonacci(10);
		
		}
		
	}


