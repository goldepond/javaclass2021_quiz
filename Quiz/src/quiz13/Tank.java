package quiz13;

public class Tank extends unit {
	public static int  Tattack =30;
	public Tank() 
	{
		super(0,0,150);
		// TODO Auto-generated constructor stub
	}
	
	public void  info()
	{

		System.out.println("공격력  :"+ Tattack + " / 체력 : " + hp);
	}
	
	@Override
	public void hold() {
		// TODO Auto-generated method stub
		stop ();
		
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
