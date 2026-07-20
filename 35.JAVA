class Solution(object):
    def searchInsert(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: int
        """
        if target in nums:
             return nums.index(target)
        else:
           for i in nums:
                if target<i:
                    return nums.index(i)
                    break
                elif nums[-1]<target:
                    return len(nums)
                    break
