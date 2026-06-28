class Solution2(object):
    def maximumElementAfterDecrementingAndRearranging(self, arr):
        arr.sort()
        arr[0] = 1

        for i in range(1, len(arr)):
            arr[i] = min(arr[i], arr[i - 1] + 1)

        return arr[-1]


obj = Solution2()
arr = [2, 2, 1, 2, 1]

print(obj.maximumElementAfterDecrementingAndRearranging(arr))