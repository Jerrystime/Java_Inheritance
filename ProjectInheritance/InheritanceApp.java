
public class InheritanceApp {

	public static void main(String[] args) {
		Cal c = new Cal(2, 1);	// Cal 클래스를 변수 c에 인스턴스
		Cal3 c3 = new Cal3(2, 1);	// Cal3 클래스를 변수 c3에 인스턴스
		System.out.println(c3.sum());	// 3, 부모 클래스에 정의된 sum() 메소드를 호출
		System.out.println(c3.minus());	// 1, 자식 클래스에 오버라이딩된 minus() 메소드를 호출
	}
}

class Cal {	// Cal 클래스 생성
	int v1, v2;
	
	Cal(int v1, int v2) {	// 생성자를 통해 전달 받은 인자들을 전역 인스턴스 변수에 할당
		System.out.println("Cal init!!");
		this.v1 = v1;
		this.v2 = v2;
	}
	
	public int sum() {
		return this.v1 + v2;	// 전역 인스턴스 변수 v1 와 v2의 합을 반환
	}
}

class Cal3 extends Cal{	// 부모 클래스에 별도의 생성자가 있다면 자바는 자식 클래스가 부모 클래스의 생성자를 실행하도록 강제하고 있다.

	Cal3(int v1, int v2) {	// 자식 클래스이 인스턴스가 전달한 인자들을 부모 클래스의 생성자로 전달하여 부모 클래스의 전역 인스턴스 변수에 인자 값들을 할당
		super(v1, v2);	// 부모 클래스의 생성자를 실행해줘야 한다.
		System.out.println("Cal3 init!!");	// 자식 클래스의 생성자가 할 일을 밑에 정의해주면 된다.
	}
	
	public int minus() {
		return this.v1 - v2;	// 부모 클래스 전역 인스턴스 변수에 할당된 v1 과 v2의 차를 반환
	}
	
}