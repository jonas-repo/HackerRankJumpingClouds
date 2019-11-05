package com.jumpingclouds.app;

import java.util.HashMap;
import java.util.Map;

public class JumpingClouds {

	public static void main(String[] args) {
		// https://www.hackerrank.com/challenges/jumping-on-the-clouds/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=warmup
		//declarations
		int count = 0;
		
		//hacker rank input
		int[] clouds = {
				0, 0 ,1 ,0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0,
				1, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 1, 0, 0
				
		};
	
		//jump if there is no 0 two places before
	        for (int i = 0; i < clouds.length; i++ ) {
	            if (i<clouds.length-2 && clouds[i+2]==0) 
	            { 
	                i++;
	            }
	            count++;   
	        }
		System.out.println("Number of jumps posible: "+(count-1));
		
	}

}