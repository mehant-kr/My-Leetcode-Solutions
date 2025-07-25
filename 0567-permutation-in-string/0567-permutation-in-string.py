class Solution:
    def checkInclusion(self, s1: str, s2: str) -> bool:
        # edge case #1
        if (len(s1) > len(s2)):
            return False
        map_s1 = {chr(s): 0 for s in range(ord('a'), ord('z')+1)}
        map_s2 = {chr(s): 0 for s in range(ord('a'), ord('z')+1)}

        win_len = len(s1)
        # populating the window for the first time
        for i in range(win_len):
            map_s2[s2[i]] += 1
            map_s1[s1[i]] += 1
            # check if two maps are equal --
        if map_s1 == map_s2:
            return True
        # as we slide the window forwared - decrement the previous element number
        print("hello")
        for i in range(len(s2) - win_len):
            print(i)
            r = i+len(s1)
            map_s2[s2[r]] += 1
            map_s2[s2[i]] -= 1
            if map_s1 == map_s2:
                return True
        return False