package memo;

public class InnerClass {

	public static void main(String[] args) {
		Outer outer = new Outer();
		outer.print1();
	}
//hennkousimasita
}
class Outer {
	private String message = "outerクラスのprivateなインスタンス変数です";
	
	void doSomething() {
		class Inner {       //内部クラス
			void print() {
				System.out.println("Innerクラスのprintメソッドが呼ばれました");
				System.out.println(message);
		//内部クラスは、外側のクラスのprivateなインスタンス変数にも、
		//まるで自分のフィールドのようにアクセスできる
				//編集テスト
			}
		}
		
		Inner inner = new Inner();
		inner.print();
	}
	void print1() {
		System.out.println("Outerクラスのprint1メソッドが呼ばれました");
		System.out.println(message);
		
	}
}
