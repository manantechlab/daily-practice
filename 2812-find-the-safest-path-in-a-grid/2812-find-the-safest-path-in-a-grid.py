from collections import deque
import heapq

class Solution:
    def maximumSafenessFactor(self, grid):
        n = len(grid)

        # -------------------------------
        # Step 1: Distance from nearest thief
        # -------------------------------
        dist = [[-1] * n for _ in range(n)]
        q = deque()

        # Put every thief into the queue
        for r in range(n):
            for c in range(n):
                if grid[r][c] == 1:
                    dist[r][c] = 0
                    q.append((r, c))

        directions = [(1,0), (-1,0), (0,1), (0,-1)]

        # Multi-source BFS
        while q:
            r, c = q.popleft()

            for dr, dc in directions:
                nr = r + dr
                nc = c + dc

                if 0 <= nr < n and 0 <= nc < n:
                    if dist[nr][nc] == -1:
                        dist[nr][nc] = dist[r][c] + 1
                        q.append((nr, nc))

        # -------------------------------
        # Step 2: Maximum safeness path
        # -------------------------------
        heap = [(-dist[0][0], 0, 0)]

        visited = [[False]*n for _ in range(n)]

        while heap:

            safe, r, c = heapq.heappop(heap)

            safe = -safe

            if visited[r][c]:
                continue

            visited[r][c] = True

            if r == n-1 and c == n-1:
                return safe

            for dr, dc in directions:

                nr = r + dr
                nc = c + dc

                if 0 <= nr < n and 0 <= nc < n:

                    if not visited[nr][nc]:

                        new_safe = min(safe, dist[nr][nc])

                        heapq.heappush(heap,
                                       (-new_safe, nr, nc))