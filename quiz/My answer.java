// My answer
//Q1
public class quiz1 {
	public static void main(String[] args) {
		int i = 100;
		int j = 1;
		int k = 1;
		int l = 1;
		while(i <1000) {
			j = i / 100;
			k = (i%100) / 10;
			l = (i%10);
			if (Math.pow(j, 3)+Math.pow(k, 3)+Math.pow(l, 3) == i) {
				System.out.println(i);
			}
			i++;
		}
	}
	
}

//Q2
class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        	int threshold = n / 2;
        	int count = 1;
        	for (int i = 0; i < n; i++) {
        		for (int j = 0; j < n; j++) {
        			if (nums[j] == nums[i]) {
        				count ++;
        			}
        		}
        		if (count > threshold) {
        			return count;
        		}
        	}
        	return count;
    }
}

//Q3
class Solution {
    public boolean isValid(String s) {
        int len = s.length();
		// number of ()
		int count_1 = 0;
		int count_11 = 0;
		
		// number of []
		int count_2 = 0;
		int count_22 = 0;
		
		// number of {}
		int count_3 = 0;
		int count_33 = 0;
		for (int i = 0; i< len; i++) {
			char ch = s.charAt(i);
			if (ch == '(') {
				count_1 ++;
			}
			if (ch == ')') {
				count_11 ++;
			}
			if (ch == '[') {
				count_2++;
			}
			if(ch == ']') {
				count_22++;
			}
			if(ch == '{') {
				count_3++;
			}
			if(ch == '}') {
				count_33++;
			}
		}
		if(count_1 == count_11 & count_2 == count_22 & count_3 == count_33) {
			return true;
		}else {
			return false;
		}
    }
}