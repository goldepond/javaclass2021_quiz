package super_basic;

public class SonicAp extends Airplane
{
	SonicAp(String name) {
		super(name);
	}
	
	void fly(int flymode)
	{
		if(flymode ==0)
		{
			super.fly();
		}
		else if(flymode ==1)
		{
			System.out.println("고속모드 출동");
		}
	}
}
