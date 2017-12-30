import java.util.*;
import java.lang.*;
import java.io.*;


class Calculator {

	private int a;
	private int b;

	public int addition(int a, int b) {
		return a+b;
	}

	public int substraction (int a, int b){
		return a-b;
	}
}

class Application {

	public static void main (String[] args)
	{
		Calculator machine = new Calculator();

		System.out.println (machine.addition(20, 15));
		System.out.println (machine.substraction(20, 15));
	}
}
