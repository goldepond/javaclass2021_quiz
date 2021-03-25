package quiz19;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class quiz19 {

	public static void main(String[] args) {

		Set<Integer> set = new TreeSet<Integer>();
		Random ran = new Random();
		for(int i=0;i<6;i++)
		{
			set.add(ran.nextInt(45)+1);
			set.add((int)(Math.random()*45));
		}
		System.out.println(set);
	}
}
