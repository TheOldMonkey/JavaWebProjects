package com.hjh.test;

public class Test1 {
	
	public static Test1 test1 = new Test1("yu");
	
	public Test1(String string) {
		System.out.println(string + "678678");
	}
	
	public static void main(String[] args) {
		for(int i = 1, j = 10; i + j < 25; i++, j++) {
//			System.out.println("i=" + i + "; j=" + j);
		}
		
//		System.out.println(Integer.toBinaryString(10));
	}

}
