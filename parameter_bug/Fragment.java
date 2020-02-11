package parameter_bug;
import java.util.ArrayList;

class Fragment{
	public int resource() {
		Class2 sample = new Class2();
		ArrayList<Integer> list = new ArrayList<>();
		int a = 0, n = 0;

		int x, y;
		x = (int)(sample.mul(a) % list.size());
		y = (int)(sample.mul(a) % list.size());
		x = (int)(sample.mul(a,n) % list.size());
		y = (int)(sample.mul(a,n) % list.size());

		ArrayList<Integer> subList = new ArrayList<>();
		if(subList == null) {
			return -1;
		}
		if(list == null) {
			return -1;
		}

		int i = 0, l = 0, h = 0;
		if(i >= l && i <= h) {
			return 0;
		}
		if(i >= l) {

		}
		if(i <= h) {

		}
		long sum = 0;
		sum += sample.div(i);
		sum += sample.mul(i);
		sum += sample.div(a);
		sum += sample.mul(a);
		sum += sample.div(n);
		sum += sample.mul(n);
		return -1;
	}
}
