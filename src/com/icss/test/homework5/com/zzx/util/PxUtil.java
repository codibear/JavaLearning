package com.icss.test.homework5.com.zzx.util;

import java.util.Arrays;

public class PxUtil {
	//冒泡排序，对成绩排序
	public void pxFromXtoD(float[] sz){
		//控制轮数
		for(int i=0;i<sz.length-1;i++){
			//控制每轮的比较趟数
			for(int j=0;j<sz.length-i-1;j++){
				if(sz[j]<sz[j+1]){
					float temp=0;
					temp=sz[j];
					sz[j]=sz[j+1];
					sz[j+1]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(sz));
	}
	//求平均分
	public void avgcj(float[] sz){
		float sum1 = 0;
		float avg = 0;
		for (int k = 0; k < sz.length; k++) {
			sum1 += sz[k];
		}
		avg = (sum1 / 5);
		System.out.println(avg);
	}
	//求总成绩
	public void allsum(float[] sz){
		float sum = 0;
		for (int k = 0; k < sz.length; k++) {
			sum = sum + sz[k];
		}
		System.out.println(sum);
	}
	//输出最高分
	public void gethigh(float[] sz){
		float temp = 0;
		for (int j = 0; j < sz.length; j++) {
			if (sz[j] > temp) {
				temp = sz[j];
			}
		}
		System.out.println(temp);
	}
	//输出最低分
	public void getlow(float[] sz){
		int temp1 = 1000;
		for (int j1 = 0; j1 < sz.length; j1++) {
			if ((int)sz[j1] < temp1) {
				temp1 =(int)sz[j1];
			}
		}
		System.out.println(temp1);
	}
}
