package leetcode.easy;

import java.util.HashSet;
import java.util.Set;

/**
 * 83. Remove Duplicates from Sorted List
 * https://leetcode.com/problems/remove-duplicates-from-sorted-list/description/
 * 
	Given a sorted linked list, delete all duplicates such that each element appear only once.
	
	Example 1:
	
	Input: 1->1->2
	Output: 1->2
	Example 2:
	
	Input: 1->1->2->3->3
	Output: 1->2->3
 *
 */
public class RemoveDuplicates83 {
	public int[] deleteDuplicates(int[] input) {
        
		Set<Integer> uniqeSet = new HashSet<Integer>();
		
		for (int entry : input) {
			uniqeSet.add(entry);
		}
			
		int[] outList = new int[uniqeSet.size()];
		
		int i = 0;
		for (Integer intEntry : uniqeSet) {
			outList[i++] = intEntry;
		}

		return outList;
    }
}