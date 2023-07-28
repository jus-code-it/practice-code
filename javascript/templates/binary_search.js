// Function to perform Binary Search
function binarySearch(nums, target) {
    let left = 0;
    let right = nums.length - 1;

    while (left <= right) {
        let mid = Math.floor((left + right) / 2);

        if (nums[mid] === target) {
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
const nums = [1, 3, 5, 7, 9, 11, 13, 15];
const target = 7;

const result = binarySearch(nums, target);
if (result !== -1) {
    console.log("Element found at index:", result);
} else {
    console.log("Element not found.");
}