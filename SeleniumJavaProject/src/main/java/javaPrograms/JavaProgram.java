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
	
	
	
	
	public static void main(String[] args) {
	
		int[] a = {9,5,6,8,2,1};
		int[] b = {4,6,3,7,11,9};
		
		int a_length = a.length;
		int b_length = b.length;
		
		int c_length = a_length + b_length;
		
		int[] c = new int[c_length];
		
		for (int i=0; i<a.length; i++) {
			
			c[i] = a[i];
		}
		
		for (int i=0; i<b.length; i++) {
			
			c[a_length+i] = b[i];
		}
		
		for(int i=0; i<c.length; i++) {
			Arrays.sort(c);
			System.out.print(c[i] + " ");
		}
		
		
		
		
		
		
		}
		
	}


