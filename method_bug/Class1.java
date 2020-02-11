package method_bug;
import java.util.ArrayList;

public class Class1 {
	public long run (ArrayList<Integer> list, int a, int n, int l, int h){
		if(list == null || list.isEmpty()){
			return -1;
		}
		for(Integer integer : list){
			if(integer == null) return -1;
		}

		Class2 sample = new Class2();

		int x, y;
		x = (int)(sample.mul(a) % list.size());
		y = (int)(sample.mul(a, n) % list.size());

		ArrayList<Integer> subList = sample.getSubList(list, x, y);
		if(subList == null) {
			return -1;
		}

		long sum = 0;
		for(int i : subList) {
			if(i >= l && i <= h) {
				sum += sample.mul(i); // bug
			}
		}
		return sum;
	}
}
