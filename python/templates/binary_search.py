# Function to perform Binary Search
def binary_search(nums, target):
    left = 0
    right = len(nums) - 1

    while left <= right:
        mid = left + (right - left) // 2

        if nums[mid] == target:
            return mid
        elif nums[mid] < target:
            left = mid + 1
        else:
            right = mid - 1

    return -1

# Example usage:
nums = [1, 3, 5, 7, 9, 11, 13, 15]
target = 7

result = binary_search(nums, target)
if result != -1:
    print("Element found at index:", result)
else:
    print("Element not found.")