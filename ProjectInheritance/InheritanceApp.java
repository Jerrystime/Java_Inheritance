
public class InheritanceApp {

	public static void main(String[] args) {
		Cal c = new Cal();	// Cal 클래스를 변수 c에 인스턴스
		System.out.println(c.sum(2, 1));	// 인스턴스 메소드 sum() 호출
		System.out.println(c.sum(2, 1, 1));	// 인스턴스 메소드 sum() 호출
		
		Cal3 c3 = new Cal3();	// Cal3 클래스를 변수 c3에 인스턴스
		System.out.println(c3.sum(2, 1));	// Cal3는 Cal의 자식 클래스이기 때문에 부모 클래스의 있는 멤버들도 그대로 상속 받아 따로 정의 및 생성하지 않아도 호출 및 사용이 가능하다.
		System.out.println(c3.minus(2, 1));	// 자식 클래스 Cal3에서 새롭게 추가한 메소드와 기존의 부모 클래스가 가지고 있던 메소드 둘 다 자유롭게 사용이 가능함
		System.out.println(c3.sum(2, 1));	// 부모 클래스가 가지고 있던 멤버를 오버라이딩을 하게 되면 오버라이딩한 멤버가 호출된다.
	}

}

class Cal {	// Cal 클래스 생성
	public int sum(int v1, int v2) {	// 정수형 매개 변수 두 개를 받는 메소드 생성
		return v1 + v2;	// 매개 변수로 받은 인자를 더해서 반환
	}
	
	// Overloading, 같은 이름의 메소드를 추가적으로 정의하는 기능(단, 매개변수가 달라야 하고, 자식 클래스에서 정의할 수도 있다.)
	public int sum(int v1, int v2, int v3) {	//  정수형 매개 변수 세 개를 받는 메소드 생성
		return this.sum(v1, v2) + v3;	// 매개 변수로 받은 인자를 더해서 반환
	}
	// this는 클래스 자기 자신을 가르킨다.
}

class Cal3 extends Cal{	// 클래스 Cal3는 Cal 클래스르 상속 받아 Cal 클래스의 자식 클래스가 됨
	public int minus(int v1, int v2) {	// 부모 클래스에 없던 정수형 매개변수 두 개를 받는 새로운 메소드 추가함
		return v1 - v2;	// 전달 받은 두 개의 매개변수를 빼서 반환
	}
	
	// 부모 클래스가 가지고 있던 기능 재정의하는 것을 Overriding이라고 한다.
	public int sum(int v1, int v2) {	// 부모 클래스에 있던 정수형 매개 변수 두 개를 받는 메소드 생성
		System.out.println("Cal3!!");	// 구분하기 위해 "Cal3!!"라는 문자열을 출력하게 함
		return super.sum(v1, v2);	// 매개 변수로 받은 인자를 더해서 반환
	}
	// super는 부모 클래스르 가르킨다.
	
	// Overloading, 같은 이름의 메소드를 추가적으로 정의하는 기능(단, 매개변수가 달라야 하고, 자식 클래스에서 정의할 수도 있다.)
	public int sum(int v1, int v2, int v3) {	//  정수형 매개 변수 세 개를 받는 메소드 생성
		return v1 + v2 + v3;	// 매개 변수로 받은 인자를 더해서 반환
	}
}

class Cal2 {	// Cal 클래스는 남의 클래스라 수정을 못하는 상황이라 Cal2라는 Cal 클래스를 복사, 붙여넣어 Cal 클래스 생성
	public int sum(int v1, int v2) {	// 정수형 매개 변수 두 개를 받는 메소드 생성
		return v1 + v2;	// 매개 변수로 받은 인자를 더해서 반환
	}
	
	public int minus(int v1, int v2) {	// Cal 클래스에 없던 정수형 매개 변수 두 개를 받는 minus 메소드 생성
		return v1 - v2;	// 매개 변수로 받은 인자를 빼서 반환
	}
}