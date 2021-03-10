package quiz13;

public class Marine extends unit{

	public static int  Mattack =6;
	public void  info()
	{
		System.out.println("공격력  :"+Mattack + " / 체력 : " + hp);
	}
	public Marine() 
	{
		super(0, 0, 40);
	}
	@Override
	public void hold() {
		System.out.printf("%d , %d ",x,y);
		stop();
		
	}
	private int distance;
	@Override
	public void move(int px, int py) 
	{
	 distance = (int)Math.sqrt( (int)Math.pow(px-this.x,2) + (int)Math.pow(py-this.y,2));
	 x = px;
	 y = py;
		System.out.println("이동 거리  :"+distance);
	}

}
