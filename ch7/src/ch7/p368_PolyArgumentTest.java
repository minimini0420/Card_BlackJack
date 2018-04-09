package ch7;

import java.util.ArrayList;

class Product {
   int price;   // 제품의 가격
   int bonusPoint;   // 제품구매 시 제공하는 보너스 점수
   String name;
   
   Product(int price, String name) {
      this.price = price;
      bonusPoint = (int) (price/10.0);   // 보너스 점수는 제품가격의 10%
      this.name = name;
   }
}

class Tv7 extends Product{
   Tv7() {
      // 조상클래스의 생성자 Product(int price)를 호출한다.
      super(100, "Tv");   // Tv의 가격을 100만원으로 한다.
      }
      // Object 클래스의 tostring()을 오버라이딩한다.
   @Override
      public String toString() {
	   return String.format("%s - %d", this.name, this.price);
	  }
   }
   
class Computer extends Product {
	Computer() { super(200, "Computer"); }
	
	@Override
    public String toString() {
	   return String.format("%s - %d", this.name, this.price);
	  }
}
   
class Buyer {   // 고객, 물건을 사는 사람
   int money = 5000;   // 소유 금액
   int bonusPoint = 0;    // 보너스 점수
   ArrayList<Product> productList = new ArrayList();
   
	void buy (Product p) {
	   if(money+bonusPoint < p.price) {  // price를 다른 변수를 만들어 넣어줘야 오류 발생 가능성 낮춘다.
	      System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
	      return;
	   }
	
	   money -= p.price;   //가진 돈에서 구입한 제품의 가격을 뺀다.
	   bonusPoint += p.bonusPoint;   //제품의 보너스 점수를 추가한다.
	   System.out.println(p+"을/를 구입하셨습니다.");
	   productList.add(p);
	   }
	
	void buy (Product p, boolean f) {
	   if(money+bonusPoint < p.price) {
	      System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
	      return;
	   }
	   if (f==true) {
	      money -= (p.price-bonusPoint);
	      bonusPoint = 0;
	      System.out.println(p+"을/를 구입하셨습니다.");
	   }
	   else{
	      money -= p.price;
	      bonusPoint += p.bonusPoint;
	      System.out.println(p+"을/를 구입하셨습니다.");
	      }
	   }

	void printMyProductList() {
		int sum = 0;
   
		for(int i=0; i<productList.size(); i++) {
//	   	Object o = productList.get(i);
			Product p =productList.get(i);
			System.out.println(p+" - "+p.price);
		}
		System.out.printf("sum : %d\n", sum);
	}
}

class p368_PolyArgumentTest {
   public static void main(String args[]) {
      Buyer b = new Buyer();
      
      b.buy(new Tv7());
      System.out.println("현재 남은 돈은 " + b.money + "만원입니다.");
      System.out.println("현재 보너스점수는  " + b.bonusPoint + "점입니다.");
      
      b.buy(new Computer());
      System.out.println("현재 남은 돈은 " + b.money + "만원입니다.");
      System.out.println("현재 보너스점수는  " + b.bonusPoint + "점입니다.");
      
      b.buy(new Tv7(), false);      
      System.out.println("현재 남은 돈은 " + b.money + "만원입니다.");
      System.out.println("현재 보너스점수는  " + b.bonusPoint + "점입니다.");
      
      b.buy(new Tv7(), true);      
      System.out.println("현재 남은 돈은 " + b.money + "만원입니다.");
      System.out.println("현재 보너스점수는  " + b.bonusPoint + "점입니다.");
   }
}