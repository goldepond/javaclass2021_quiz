package quiz13;

import java.util.Arrays;

public class dropShip extends unit {

	//

	public dropShip() 
	{
		super(0, 0, 40);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void hold() {
		System.out.printf("%d , %d ",x,y);
		// TODO Auto-generated method stub
		
	}
//드랍쉽만의 기능
	//라이드
	//배열의 크기는 8고정
	//수송선 안에는 탱크와 마린이 탈 수 있음
	//탱크는 4칸을 차지함
	unit [] Ride = new unit[8];
	int i=0;
	public void Ride(unit u)
	{
		if(u instanceof Marine)
		{
			Ride[i] = u;
			i++;
			System.out.println("마린탑승이 완료되었습니다.");
		}
		else if(u instanceof Tank)
		{
			if((8-i)>4)
			{
				for(int t=0;t<4;t++)
				{
					Ride[i] = u;
					i++;
				}
				System.out.println("탱크탑승이 완료되었습니다.");
			}
			else
			{
				System.out.println("공간이 부족해 현재 탱크가 탑승할 수 없습니다.");
			}
		}

		System.out.println(Arrays.toString(Ride));
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
