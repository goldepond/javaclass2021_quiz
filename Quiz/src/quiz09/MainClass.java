package quiz09;

public class MainClass {
	public static void main(String[] args) {



		//키보드, 모니터, 마우스 정보를 출력하는 computerInfo() 메서드를 생성하세요

		//키보드, 모니터, 마우스에 대한 getter/setter도 생성하세요	 
		
		//메인메서드에서 getter로 접근하여 모니터에 대한 정보를 확인하세요
		
		Computer c = new Computer();
		c.ComputerInfo();
		
		System.out.println();
		System.out.println("------------------------------------");
		System.out.println();
		
		c.getMonitor().info();
		c.getKeyboard().info();
		c.getMouse().info();
	}

}
