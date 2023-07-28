#include <iostream>
#include <vector>

// Function to perform Binary Search
int binarySearch(const std::vector<int>& nums, int target) {
    int left = 0;
    int right = nums.size() - 1;

    while (left <= right) {
        int mid = left + (right - left) / 2;

        if (nums[mid] == target) {
            return mid;
        } else if (nums[mid] < target) {
            left = mid + 1;
        } else {
            right = mid - 1;
        }
    }

    return -1;
}

// Example usage:
int main() {
    std::vector<int> nums = {1, 3, 5, 7, 9, 11, 13, 15};
    int target = 7;

    int result = binarySearch(nums, target);
    if (result != -1) {
        std::cout << "Element found at index: " << result << std::endl;
    } else {
        std::cout << "Element not found." << std::endl;
    }

    return 0;
}