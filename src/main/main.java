package main;

import Queue.Queue;
import QueuePrior.QueuePriorInteger;
import Stack.Stack;
import ArrayList.ArrayList;
import LinkedListOne.LinkedListOne;
import LinkedListTwo.LinkedListTwo;

public class main {

	public static void main(String[] args) throws CloneNotSupportedException {
	QueuePriorInteger stack = new QueuePriorInteger();
	QueuePriorInteger st = null;
				//превірити чи стек і черга норм клонує
		Integer i1 = new Integer(10);
		Integer i2 = new Integer(20);
		Integer i3 = new Integer(30);
		Integer i4 = new Integer(8);
		Integer i5 = new Integer(888);
		stack.push(i4);
		stack.push(i5);
		stack.push(i1);
		stack.push(i1);
		stack.push(i3);
		stack.push(i1);
		stack.push(i1);   
		
		
		System.out.println(stack.size());
		st = stack.clone();
		System.out.println(stack);
		stack.pop();
		System.out.println(stack);
		System.out.println(st);
		Integer []ii = st.tuarei();
		
		

		
	//	System.out.println(st);

		
		
	}

}
