class Solution {
    public boolean isPalindrome(String s) {
        // Initialize two pointers
        int left = 0, right = s.length() - 1;

        while (left < right) {
            // Move the left pointer until an alphanumeric character is found
            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }

            // Move the right pointer until an alphanumeric character is found
            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }

            // Compare the characters (ignoring case)
            if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                return false;
            }

            // Move both pointers towards the center
            left++;
            right--;
        }
        return true;
    }
}
