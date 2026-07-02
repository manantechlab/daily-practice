from collections import deque

class Solution:
    def findSafeWalk(self, grid, health):

        m = len(grid)
        n = len(grid[0])

        # Health after standing on the first cell
        health = health - grid[0][0]

        if health <= 0:
            return False

        # Store the best health left at each cell
        visited = [[-1] * n for _ in range(m)]
        visited[0][0] = health

        q = deque()
        q.append((0, 0, health))

        # Down, Up, Right, Left
        dir = [(1, 0), (-1, 0), (0, 1), (0, -1)]

        while q:

            row, col, hp = q.popleft()

            # Reached destination
            if row == m - 1 and col == n - 1:
                return True

            for dr, dc in dir:

                new_row = row + dr
                new_col = col + dc

                # Check boundaries
                if 0 <= new_row < m and 0 <= new_col < n:

                    new_hp = hp - grid[new_row][new_col]

                    # Health must be positive
                    if new_hp <= 0:
                        continue

                    # Visit only if this path is better
                    if new_hp > visited[new_row][new_col]:

                        visited[new_row][new_col] = new_hp
                        q.append((new_row, new_col, new_hp))

        return False