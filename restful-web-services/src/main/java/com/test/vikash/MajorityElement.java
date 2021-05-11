package com.test.vikash;

public class MajorityElement {
	static void findElementByMajority(int arr[], int n)
    {
        int totalCount = 0;
        int index = -1;
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (arr[i] == arr[j])
                    count++;
            }
            if (count > totalCount) {
            	totalCount = count;
                index = i;
            }
        }
        if (totalCount > n / 2)
            System.out.println(arr[index]);
 
        else
            System.out.println("No Majority Element");
    }
    public static void main(String[] args)
    {
        int arr[] = { 1, 2, 2, 5, 5, 5, 5 };
        int n = arr.length;
        findElementByMajority(arr, n);
    }

}
