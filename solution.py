class Solution(object):
    def maximumLength(self, nums, Counter):
        freq = Counter(nums)
        ans = 1

        if 1 in freq:
            if freq[1] % 2 == 0:
                ans = max(ans, freq[1] - 1)
            else:
                ans = max(ans,freq[1])

        for x in freq:
            if x == 1:
                continue

            length = 0
            cur = x

            while True:
                if freq.get(cur, 0)>=2:
                    length += 2
                    cur = cur * cur
                elif freq.get(cur, 0 ) == 1:
                    length += 1
                    break
                else:
                    length -= 1
                    break
            ans = max(ans, length)
        return ans
        
