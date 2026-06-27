from collections import Counter

class Solution:
    def maximumLength(self, nums):
        freq = Counter(nums)
        ans = 0  # or 1 if problem guarantees non-empty and expects at least 1

        # Handle 1s specially
        if 1 in freq:
            ones = freq[1]
            if ones % 2 == 0:
                ans = max(ans, ones - 1)
            else:
                ans = max(ans, ones)

        # Handle other values
        for x in freq:
            if x == 1:
                continue

            length = 0
            cur = x

            while True:
                count = freq.get(cur, 0)
                if count >= 2:
                    length += 2
                    cur = cur * cur
                elif count == 1:
                    length += 1
                    break
                else:
                    length -= 1  # remove this if penalty not desired
                    break

            ans = max(ans, length)

        return ans
