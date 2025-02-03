package memo;

public class ClassYobidashi01 {
	
	static int a01 = 1;//staticがあるのでクラス変数（静的フィールド）
	int a02 = 2;//staticがないのでインスタンスフィールド
	
	public static void print01() {//staticがあるのでクラスメソッド(静的メソッド)
		System.out.printf("print01同じクラスのクラスメソッド%d%n",a01);
	}
	
	public void print02() {//staticがないのでインスタンスメソッド
		System.out.printf("print02同じクラスのインスタンスメソッド%d%n",this.a02);
		//インスタンスメソッドではクラス変数も使える
		System.out.printf("print02同じクラスのインスタンスメソッド%d%n",a01);
		//インスタンスメソッドではクラスメソッドも使える
		print01();
	}
	
	
	public static void main(String[] args) {
		a01 += 10;//同じクラスのクラス変数（静的フィールド）の書き換え
		print01();//同じクラスのクラスメソッド(静的メソッド)
		
		ClassYobidashi01 c = new ClassYobidashi01();
		c.a01 += 10;//同じクラスのクラス変数（静的フィールド）の書き換え
		c.a02 += 10;//同じクラスのインスタンスフィールドの書き換え
		c.print01();//同じクラスのクラスメソッド(静的メソッド)
		c.print02();//同じクラスのインスタンスメソッド
		
		
		Sub.a03 += 10;//別のクラス（外部クラス）のクラス変数（静的フィールド）の書き換え
		Sub.print03();//別のクラス（外部クラス）のクラスメソッド(静的メソッド)
		
		Sub s = new Sub();
		s.a03 += 10;//別のクラスのクラス変数（静的フィールド）変数の書き換え
		s.a04 += 10;//別のクラス（外部クラス）のインスタンスフィールドの書き換え
		s.print03();//別のクラス（外部クラス）のクラスメソッド(静的メソッド)
		s.print04();//別のクラス（外部クラス）のインスタンスメソッド
	}

}


class Sub {//クラスごとに別クラスファイルとして作成する場合は「public class Sub」と記述する
	static int a03 = 3;//staticがあるのでクラス変数（静的フィールド）
	int a04 = 4;//staticがないのでインスタンスフィールド
	public static void print03() {//staticがあるのでクラスメソッド(静的メソッド)
		System.out.printf("print03別のクラスのクラスメソッド%d%n",a03);
	}

	public void print04() {//staticがないのでインスタンスメソッド
		System.out.printf("print04別のクラスのインスタンスメソッド%d%n",this.a04);
		//インスタンスメソッドではクラス変数も使える
		System.out.printf("print02別のクラスのインスタンスメソッド%d%n",a03);
		//インスタンスメソッドではクラスメソッドも使える
		print03();

	}
}