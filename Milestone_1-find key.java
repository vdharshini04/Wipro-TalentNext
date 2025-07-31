/*
You are provided with 3 numbers: input1, input2 and input3.
Each of these are four digit numbers within the range >=1000 and <=9999.
i.e.
1000 <=input1 <= 9999
1000 <=input2 <= 9999
1000 <= input3 <= 9999

You are expected to find the Key using the below formula -

Key = [LARGEST digit in the thousands place of all three numbers - smallest digit in the thousands place of all three numbers] [LARGEST digit in the hundreds place of all three numbers - smallest digit in the hundreds place of all three numbers] [LARGEST digit in the tens place of all three numbers - smallest digit in the tens place of all three numbers] [LARGEST digit in the units place of all three numbers - smallest digit in the units place of all three numbers]

example:
input1 = 3521, input2=2452, input3=1352
output: 2231
Explanation:
Key = (3-1] [5-3] [5-2] [2-1] = 2231

Assuming that the 3 numbers are passed to the given function, Complete the function to find and return the Key.
*/

import java.util.*;

class Key
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int n3=sc.nextInt();
		
		//getting digits from inputs on there place values
		int[] thou={(n1/1000),(n2/1000),(n3/1000)};
		int[] hun={((n1/100)%10),((n2/100)%10),((n3/100)%10)};
		int[] ten={((n1/10)%10),((n2/10)%10),((n3/10)%10)};
		int[] one={n1%10,n2%10,n3%10};
		
		//difference of largest and smallest in each place
		int thousand=maxmin_diff(thou);
		int hundred=maxmin_diff(hun);
		int tens=maxmin_diff(ten);
		int ones=maxmin_diff(one);
		
		//get key
		int key=(thousand*1000)+(hundred*100)+(tens*10)+ones;
		
		System.out.println(key);
	}
	public static int maxmin_diff(int[] n){
	    int max = n[0];
        int min = n[0];
        for (int val : n) {
            if (val > max) max = val;
            if (val < min) min = val;
        }
        
        //return largest-smallest
        return max - min;
	}
}
