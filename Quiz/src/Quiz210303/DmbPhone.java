package Quiz210303;
public class DmbPhone  extends Phone
{
	//부모클래스는 수정하지 않습니다. o 
	//DmbPhone은 Phone클래스를 상속 받습니다. o 
	//channel 변수를 생성하고, color, model, channel을 초기화 하는 생성자를 작성하세요. 0 
	//메인메서드가 정상적으로 실행되도록 메서드를 추가하세요.
	int channel;
	DmbPhone(String _color,String _model,int _channel )
	{
		model = _model;
		color = _color;
		channel = _channel;
	}
	
	void turnOnDmb()
	{
		System.out.println("tv킴.");
	}
	void changeChannel(int _chan)
	{
		channel = _chan;
		System.out.println(_chan+" 로 채널 변경");
	}
	void turnOffDmb()
	{
		System.out.println("tv끔.");
	}
}
