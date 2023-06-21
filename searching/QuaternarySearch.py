import time

class QuaternarySearch:
    def searching(self, s, e, nums, target):
        if s <= e:
            mid1 = s + (e - s) // 4
            mid2 = s + (e - s) // 2
            mid3 = e - (e - s) // 2
            mid4 = e - (e - s) // 4

            if nums[mid1] == target:
                return mid1
            elif nums[mid2] == target:
                return mid2
            elif nums[mid3] == target:
                return mid3
            elif nums[mid4] == target:
                return mid4
            else:
                if target < nums[mid1]:
                    return self.searching(s, mid1 - 1, nums, target)
                elif target > nums[mid4]:
                    return self.searching(mid4 + 1, e, nums, target)
                elif target < nums[mid2]:
                    return self.searching(mid1 + 1, mid2 - 1, nums, target)
                elif target > nums[mid3]:
                    return self.searching(mid3 + 1, mid4 - 1, nums, target)
                else:
                    return self.searching(mid2 + 1, mid3 - 1, nums, target)
        else:
            return -1

    def search(self, nums, target: int) -> int:
        left = 0
        right = len(nums) - 1
        return self.searching(left, right, nums, target)


solution = QuaternarySearch()

# Generate a large test case with worst-case scenario
nums = list(range(1, 100000001))  # A list of numbers from 1 to 10,000,000
target = 100000001  # A target number that is not present in the list

# Measure the time taken for searching
start_time = time.perf_counter()
result = solution.search(nums, target)
end_time = time.perf_counter()

# Calculate the elapsed time in milliseconds
elapsed_time = (end_time - start_time) * 1000

print("Search Result:", result)
print("Elapsed Time:", elapsed_time, "ms")
