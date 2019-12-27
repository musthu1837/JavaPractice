package practice;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Vector;
import java.util.stream.Collectors;

public class Example1{
	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		   List<Integer> l = new ArrayList<Integer>();
		   l.add(5);
		   l.add(4);
		   l.add(3);
		   l.add(2);
		   l.add(1);
		   Collections.sort(l, (a, b)->{
			   return a.compareTo(b);
		   });
		   l.forEach((a) -> System.out.println(a));
		   l.stream().collect(Collectors.counting());
		   String s1 = "9640932548";
		   String r = "^[6-9]\\d{9}$";
		   System.out.println(s1.matches(r));
		   
	}
}
