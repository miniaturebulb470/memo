package memo;
import java.util.ArrayList;

public class ArrayList5_1 {

	public static void main(String[] args) {
		ArrayList<String> months = new ArrayList<String>();
		months.add("January");
		months.add("February");
		months.add("March");
		
		System.out.println(months.size());
		for(int i = 0; i < months.size(); i++) {
			System.out.println(months.get(i));
		}
		
		months.remove(1);
		System.out.println(months.size());
		for(int i = 0; i < months.size(); i++) {
		
			System.out.println(months.get(i));
		}
		
		ArrayList<Integer> integerList = new ArrayList<Integer>();
		integerList.add(Integer.valueOf(50));
		integerList.add(Integer.valueOf(100));
		integerList.add(Integer.valueOf(30));
		integerList.add(Integer.valueOf(200));
		int sum = 0;
		for(int i = 0; i < integerList.size(); i++) {
			sum += integerList.get(i);
			System.out.println(integerList.get(i));
		}
		System.out.println(sum
				);
		for(int i = 0; i < integerList.size(); i++) {
			System.out.println(integerList.get(i).intValue());
		}
		
		
		
	}

}
