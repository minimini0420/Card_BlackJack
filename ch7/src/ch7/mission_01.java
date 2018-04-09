package ch7;

import java.util.Scanner;

class My_list {
	String name;
	int cost;
}

public class mission_01 {
	public static void main(String[] args) {
		String[] name = new String[] {"Tv_13inch", "Tv_13inch","Tv_20inch", "드라이기", "아반떼", "소나타", "그랜져", "제네시스"};
		int [] cost = new int[] {1500,2000,4000,500,10000,20000,40000,60000};
		
		My_list[] list;
		list = new My_list[10];
		
		System.out.print("자산을 입력하세요 : ");
		Scanner m = new Scanner(System.in);
		int money = m.nextInt();
		int price = 0;
		int change = money-price;
		int count = 0;
		
		System.out.println("자산 :" + money);
		System.out.println("");
		
		System.out.println("제품들");
		System.out.println("---------------------------");
		for(int i =0; i<8; i++) {
			System.out.printf("%d. %s    %d 원\n", i+1, name[i], cost[i]);
		}
		System.out.println("---------------------------");
		
		while(true) {
			System.out.println("제품을 선택하세요. (종료:0) : ");
			Scanner c = new Scanner(System.in);
			int choice = c.nextInt();
			
			if(choice==0)
				break;
			
			else{
				list[count] = new My_list(name[choice-1],cost[choice-1]);
					
					money = change;
				}
			}
				
				
			System.out.println("My lists");
			System.out.println("=====================");
			
		}
		
		
	}
}

//자산을 입력하세요 : 6,000원
//
//제품들
//-------------------------------------
//1. TV 13인치 1,500원
//2. TV 15인치 2,000원
//3. TV 20인치 4,000원
//4. 드라이기  500원
//5. 아반떼    10,000원
//6. 소나타    20,000원
//7. 그랜저    40,000원
//8. 제네시스  60,000원
//
//-------------------------------------
//제품을 골라주세요 : 1 (엔터)
//
//나의 제품들
//=================
//TV 13인치 1,500원
//=================
//총 비용 : 1,500원
//남은 돈 : 4,500원
//
//제품을 골라주세요 : 1 (엔터)
//나의 제품들
//=================
//TV 13인치 1,500원
//TV 13인치 1,500원
//=================
//총 비용 : 3,000원
//남은 돈 : 3,000원
//
//제품을 골라주세요 : 2 (엔터)
//나의 제품들
//=================
//TV 13인치 1,500원
//TV 13인치 1,500원
//TV 15인치 2,000원
//=================
//총 비용 : 5,000원
//남은 돈 : 1,000원
//
//제품을 골라주세요 : 2 (엔터)
//금액이 부족합니다. (남은 돈 1,000원)
//
//나의 제품들
//=================
//TV 13인치 1,500원
//TV 13인치 1,500원
//TV 15인치 2,000원
//=================
//총 비용 : 5,000원
//남은 돈 : 1,000원
//
//제품을 골라주세요 : 0 (엔터)
