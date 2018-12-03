package br.com.diomar.hackerrank.array;

import java.util.ArrayList;
import java.util.List;

public class DegreeOfArray {
	
	public static void main(String[] args) {
		
//		List<Integer> arr = new ArrayList<Integer>();
//		arr.add(1);
//		arr.add(2);
//		arr.add(2);
//		arr.add(3);
//		arr.add(1);
		
		/*List<Integer> arr = new ArrayList<Integer>();
		arr.add(1);
		arr.add(1);
		arr.add(2);
		arr.add(1);
		arr.add(2);
		arr.add(2);
		*/
		
		List<Integer> arr = new ArrayList<Integer>();
		arr.add(17);
		arr.add(802);
		arr.add(88);
		arr.add(747);
		arr.add(23);
		
		arr.add(160);
		arr.add(681);
		arr.add(254);
		arr.add(46);
		arr.add(663);
		arr.add(752);
		arr.add(741);
		arr.add(857);
		arr.add(802);
		arr.add(387);
		
		arr.add(790);
		arr.add(528);
		arr.add(93);
		
		
		
		System.out.println(degreeOfArray(arr));
		
	}
	
	static class Degree {
		
		public Degree(Integer value) {
			this.value= value;
		}
		
		public Integer value = 0;
		public Integer count = 0;
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((value == null) ? 0 : value.hashCode());
			return result;
		}
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Degree other = (Degree) obj;
			if (value == null) {
				if (other.value != null)
					return false;
			} else if (!value.equals(other.value))
				return false;
			return true;
		}
		
		
		
	}
	
	public static int degreeOfArray(List<Integer> arr) {
		
		List<Degree> degress = new ArrayList<Degree>();
		
		Integer max = Integer.MIN_VALUE;
		
		for (Integer v : arr) {
			
			Degree de = new Degree(v);
			
			Integer index = degress.indexOf(de);
			if (index >= 0) {
				de = degress.get(index);
				de.count++;
			} else {
				de.count++;
				degress.add(de);
			}
			
			if (max < de.count) {
				max = de.count;
			}
			
		}

		Integer minValue = Integer.MAX_VALUE;
		
		for (Degree de : degress) {
			
			if (de.count == max) {
				List<Integer> r = new ArrayList<>();
				Integer count = 0;
				for (Integer v : arr) {
					
					if (v == de.value || !r.isEmpty()) {
						if (v.equals(de.value)) {
							count++;
						}
						r.add(v);
					}
					
					if (de.count == count) {
						if (minValue > r.size()) {
							minValue = r.size();
						}
					}
					
				}
				
			}
			
		}
			
			
		return minValue;
		
	}
	
	

}
