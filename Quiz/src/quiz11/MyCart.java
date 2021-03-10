package quiz11;

public class MyCart {
	int money;//가진돈 
	int totalprice=0; //구입한 전체 금액 
	Product [] cart = new Product[1];
	//========================
	int  i=1;
	MyCart(int _money){
		money = _money;
	}
	void buy(Product p)
	{
		if(p instanceof Tv){
			if(p.getPrice() < money){
				money -= p.getPrice();
				add(p);
			}
		}
		else if(p instanceof Computer){
			if(p.getPrice() < money){
				money -= p.getPrice();
				add(p);
			}
		}
		else if(p instanceof Radio){
			if(p.getPrice() < money){
				money -= p.getPrice();
				add(p);
			}
		}
	}
	void add(Product p){
		if(i<=cart.length){
			Product[] newcart = new Product [2 * this.i]; // chart2배크기의 newcart 배열 생성
			for(int a=0; a<cart.length;a++)
			{
				newcart[a] = this.cart[a]; // 
			}
			this.cart = newcart; //newcart 랑 cart랑 바꾸는 코드
		}
		cart[i-1]=p;
		//System.out.println(Arrays.toString(cart)); 배열 이 잘 들어갔나 확인한 코드
		i++;
		
		info();// info 메서드 시작
	}
	
	void info(){
		for(int q =0;q<cart.length;q++) //배열 전체를 돌면서 배열안에있는
			{
			if(cart[q] != null){
				System.out.print(cart[q].getName() + " 구입 ");
				System.out.println();
				totalprice += cart[q].getPrice();
			}
		}
		System.out.println(" 총 금액 : "+totalprice);
		System.out.println();
	}
}



















