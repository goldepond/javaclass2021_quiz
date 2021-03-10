package quiz13;

public abstract class unit {
	
	public int x;
	public int y;
	public int hp;
	
	public unit(int _x, int _y, int _hp)
	{
		this.x =_x;
		this.y = _y;
		this.hp = _hp;
	}
	
	public abstract void hold();//위치정보 확인
	public abstract void move(int x, int y);
	
	public void stop()
	{
		System.out.println(" 정지정지 ");
	}

}
