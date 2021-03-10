package quiz09;
public class Computer {
	
	//키보드, 마우스, 모니터 클래스를 저장하는 변수를 선언하세요
	private KeyBoard keyboard;
	private Mouse mouse;
	private Monitor monitor;
	
	//기본생성자를 생성하고, 변수를 클래스로 초기화 하세요
	Computer()
	{
		KeyBoard keyboard = new KeyBoard();
		Mouse mouse = new Mouse();
		Monitor monitor =  new Monitor();
	}
	
	Computer(KeyBoard _keyboard, Mouse _mouse, Monitor _monitor)
	{
		this.keyboard = _keyboard;
		this.mouse = _mouse;
		this.monitor = _monitor;
		
	}
	
	public void ComputerInfo()
	{
		this.keyboard.info();
		this.mouse.info();
		this.monitor.info();
	}

	//모든 멤버변수를 전달받는 생성자를 만들고 초기화하세요
	public KeyBoard getKeyboard() {
		return keyboard;
	}

	public void setKeyboard(KeyBoard keyboard) {
		this.keyboard = keyboard;
	}

	public Mouse getMouse() {
		return mouse;
	}

	public void setMouse(Mouse mouse) {
		this.mouse = mouse;
	}

	public Monitor getMonitor() {
		return monitor;
	}

	public void setMonitor(Monitor monitor) {
		this.monitor = monitor;
	}




	
	
	
	
	
}
