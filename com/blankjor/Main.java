package com.blankjor;
/**
 *@desc CopyOnWriteArrayList 测试
 *@author Blankjor 
 *@date 2017年6月12日 下午10:56:14
 */

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Main {
	public static void main(String[] args) {
		List<String> list = new CopyOnWriteArrayList<String>();
		list.add("Blankjor");
		list.add("Java");
	}

}
