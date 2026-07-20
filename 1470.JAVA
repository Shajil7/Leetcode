class Solution(object):
    def shuffle(self, nums, n):
        """
        :type nums: List[int]
        :type n: int
        :rtype: List[int]
        """
        b=[]
        a=[]
        c=[]
        for i in range(n):
           a.append(nums[i])
        for j in range(n,len(nums)):
             b.append(nums[j])
    

        for k in range(len(a)):
            c.append(a[k])
            if k<len(b):
               c.append(b[k])
        return c

