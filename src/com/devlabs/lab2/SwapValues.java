package com.devlabs.lab2;

public class SwapValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float firstValue=0.20f;
		float secondValue=0.20f;
		float temp;
		System.out.println("------Values before Swap---------");
		System.out.println("firstValue :"+firstValue);
		System.out.println("secondValue :"+secondValue);		
		temp=firstValue;
		firstValue=secondValue;
		secondValue=temp;
		System.out.println("---------Values after Swap---------");
		System.out.println("firstValue :"+firstValue);
		System.out.println("secondValue :"+secondValue);
	}

}
