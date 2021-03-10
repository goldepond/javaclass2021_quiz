package mwthod0304;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Computer c = new Computer();
		
		c.multi(4);
		c.div(15);
		c.circle(11);
		
		c.rect(11.1);
		c.rect(12.2, 13.3);
		c.rect(14.4, 15.5, 16.6);
		//================================
		
		quiz210304 q = new quiz210304();
		int inta[] = {1,2,3,4,5};
		double doublea []= { 1.1, 1.2, 1.3, 1.4, 1.5};
		String stringa[] = {"가","나","다","라","마"};
		
		q.printArray(inta);
		q.printArray(doublea);
		q.printArray(stringa);

	}

}
