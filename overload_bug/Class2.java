package overload_bug;
import java.util.ArrayList;

public class Class2 {
	public long mul(int a){
		return (long)a * a;
	}

	public long mul(int a, int n) {
		return a * n;
	}

	public int div(int a) {
		return a / 2;
	}

	public ArrayList<Integer> getSubList(ArrayList<Integer> list, int l, int r){
		if(l < 0 || r >= list.size() || l >= r) {
			return null;
		}

		ArrayList<Integer> res = new ArrayList<Integer>();
		for(; l < r; l++) {
			res.add(list.get(l));
		}
		return res;
	}
}
