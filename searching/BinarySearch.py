import time

class BinarySearch:
    def binarySearch(self, nums, target):
        return self.binarySearchRecursive(nums, target, 0, len(nums) - 1)

    def binarySearchRecursive(self, nums, target, left, right):
        if left > right:
            return -1

        mid = left + (right - left) // 2

        if nums[mid] == target:
            return mid
        elif nums[mid] < target:
            return self.binarySearchRecursive(nums, target, mid + 1, right)
        else:
            return self.binarySearchRecursive(nums, target, left, mid - 1)

# Create an instance of the Solution class
solution = BinarySearch()

# Generate a large test case with worst-case scenario
nums = list(range(1, 1000000001))  # A list of numbers from 1 to 10,000,000
target = 1000000001  # A target number that is not present in the list


# Measure the time taken for searching
start_time = time.perf_counter()
result = solution.binarySearch(nums, target)
end_time = time.perf_counter()

# Calculate the elapsed time in milliseconds
elapsed_time = (end_time - start_time) * 1000


print("Search Result:", result)
print("Elapsed Time:", elapsed_time, "ms")
