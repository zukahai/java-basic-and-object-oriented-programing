package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

import models.A;

public class Test {
	public static void main(String[] args) {
		ArrayList<A> as = new ArrayList<>();
		as.add(new A(1, 10));
		as.add(new A(10, 1));
		as.add(new A(7, 7));
		
		Collections.sort(as, new Comparator<A>() {

			@Override
			public int compare(A o1, A o2) {
				// TODO Auto-generated method stub
				if (o1.getA() + o1.getB() > o2.getA() + o2.getB())
					return 1;
				if (o1.getA() + o1.getB() == o2.getA() + o2.getB()) {
					if (o1.getA() < o2.getA())
						return 1;
					else
						return -1;
				}
				return -1;
			}
		});
		
		for (A a: as) {
			System.out.println(a);
		}
	}
}
