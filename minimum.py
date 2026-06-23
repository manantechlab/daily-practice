class Solution(object):
    def minimumDifference(self, nums, k):
        nums.sort()

        answer = float('inf')

        for i in range(len(nums) - k + 1):
            difference = nums[i + k - 1] - nums[i]
            answer = min(answer, difference)

        return answer


obj = Solution()
result = obj.minimumDifference([9, 4, 1, 7], 2)
print(result)