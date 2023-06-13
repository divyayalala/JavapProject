package collection;

import java.util.Comparator;

public class IdComparator implements Comparator<Emp> {
	@Override
	public int compare(Emp o1, Emp o2) {
		return o1.getEmpid()-o2.getEmpid();
	}

}
