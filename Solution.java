// // class Solution {
// Function to count all digits in n
//     public int countDigit(int n) {
//         // Edge case
//         if (n == 0)
//             return 1;

//         // Set counter to 0
//         int cnt = 0;

//         // Iterate until n is greater than zero
//         while (n > 0) {
//             // Increment count of digits

//             n = n / 10;
//             cnt = cnt + 1;
//         }

//         return cnt;
//     }
// }
// class Solution {
//     public boolean isPalindrome(int n) {
//         int rev = 0;
//         int temp;
//         temp = rev;
//         while (n > 0) {
//             int digit = n % 10;
//             rev = rev * 10 + digit;
//             n = n / 10;
//         }

//         if (temp == n) {
//             return true;
//         }
//         return false;
//     }
// }

// class Main {
//     public static void main(String[] args) {
//         int n = 6678;

//         /*
//          * Creating an instance of
//          * Solution class
//          */
//         Solution sol = new Solution();
//         System.out.println(sol.isPalindrome(n));

//     }
// }
// import java.util.*;

// class Solution {
//     public int sumHighestAndLowestFrequency(int[] nums) {
//         int highest = 0, lowest = 0;
//         int sum = 0;
//         HashMap<Integer, Integer> map = new HashMap<>();
//         for (int i = 0; i < nums.length; i++) {
//             map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
//         }
//         for (int val : map.values()) {
//             highest = Math.max(val, highest);
//             lowest = Math.min(val, lowest);
//         }
//         sum = highest + lowest;
//         return sum;
//     }

//     public static void main(String[] args) {
//         int[] nums = { 4, 4, 5, 5, 6, 7 };
//         Solution sol = new Solution();

//         /*
//          * Function call to get the second
//          * highest occurring element in array
//          */
//         int ans = sol.sumHighestAndLowestFrequency(nums);

//         System.out.println("The second highest occurring element in the array is: " + ans);
//     }
// }
// import java.util.Arrays;

// class Solution {
//     // Method to find the longest common prefix in an array of strings
//     public String longestCommonPrefix(String[] v) {
//         // Use StringBuilder to build the result
//         StringBuilder ans = new StringBuilder();

//         // Sort the array to get the lexicographically smallest and largest strings
//         Arrays.sort(v);
//         // First string (smallest in sorted order)
//         String first = v[0];
//         // Last string (largest in sorted order)
//         String last = v[v.length - 1];

//         // Compare characters of the first and last strings
//         for (int i = 0; i < Math.min(first.length(), last.length()); i++) {
//             // If characters don't match, return the current prefix
//             if (first.charAt(i) != last.charAt(i)) {
//                 return ans.toString();
//             }
//             // Append the matching character to the result
//             ans.append(first.charAt(i));
//         }

//         // Return the longest common prefix found
//         return ans.toString();
//     }

//     // Main method to test the longestCommonPrefix method
//     public static void main(String[] args) {
//         Solution solution = new Solution();
//         String[] input = { "race", "race", "race" };
//         String result = solution.longestCommonPrefix(input);
//         System.out.println("Longest Common Prefix: " + result); // Output: "fl"
//     }
// }

// import java.util.Arrays;

// class Solution {
//     public boolean anagramStrings(String s, String t) {
//         // your code goes here
//         s = s.toLowerCase();
//         t = t.toLowerCase();
//         if (s.length() != t.length())
//             return false;
//         int[] hash = new int[26];
//         int[] hash1 = new int[26];
//         for (char c : s.toCharArray()) {
//             hash[c - 'a']++;
//         }
//         for (char c1 : t.toCharArray()) {
//             hash1[c1 - 'a']++;
//         }
//         return Arrays.equals(hash, hash1);
//     }

//     public static void main(String[] args) {
//         Solution solution = new Solution();
//         String str1 = "INTEGER";
//         String str2 = "TEGERNI";
//         boolean result = solution.anagramStrings(str1, str2);
//         System.out.println(result ? "True" : "False");
//     }
// }
// class Solution {
//     public boolean isomorphicString(String s, String t) {
//         // your code goes here
//         int[] m1 = new int[256];
//         int[] m2 = new int[256];
//         int n = s.length();
//         for (int i = 0; i < n; i++) {
//             if (m1[s.charAt(i)] != m2[t.charAt(i)]) {
//                 return false;
//             }
//             m1[s.charAt(i)] = i + 1;
//             m2[t.charAt(i)] = i + 1;

//         }
//         return true;

//     }

//     public static void main(String[] args) {
//         Solution solution = new Solution();
//         String s = "apple";
//         String t = "bbnbm";
//         if (solution.isomorphicString(s, t)) {
//             System.out.println("Strings are isomorphic.");
//         } else {
//             System.out.println("Strings are not isomorphic.");
//         }
//     }
// }
// class Solution {

//     private int fact(int n) {
//         // Base case: out of bounds
//         int f = 1;
//         int r = 1;
//         if (n == 1) {
//             return 1;
//         }

//         f = fact(n - 1);
//         System.out.println(f);
//         r = n * f;
//         System.out.println(r);
//         return r;

// //     }

// //     // Main method for testing
// //     public static void main(String[] args) {
// //         Solution solution = new Solution();
// //         int nums = 7;
// //         int result = solution.fact(nums);
// //         System.out.println(result);
// //     }
// // }
// // Definition for a binary tree node
// class TreeNode {
//     int val;
//     TreeNode left;
//     TreeNode right;

//     TreeNode(int val) {
//         this.val = val;
//         this.left = null;
//         this.right = null;
//     }
// }

// class Solution {
//     // Method to compute the height of the binary tree
//     public int maxDepth(TreeNode root) {
//         int val = 0;
//         if (root == null) {
//             System.out.println("root" + root);
//             return 0;
//         }
//         int lh = maxDepth(root.left);
//         System.out.println("left" + lh);
//         int rh = maxDepth(root.right);
//         System.out.println("ryt" + rh);
//         val = 1 + Math.max(lh, rh);
//         System.out.println("val" + val);

//         return val;
//     }

//     // Main method to test the height calculation
//     public static void main(String[] args) {
//         // Creating the binary tree:
//         // 1
//         // / \
//         // 2 3
//         // / \
//         // 4 5

//         TreeNode root = new TreeNode(1);
//         root.left = new TreeNode(2);
//         root.right = new TreeNode(3);
//         root.left.left = new TreeNode(4);
//         root.left.left.left = new TreeNode(6);
//         root.right.left = new TreeNode(5);

//         // root.left.right = new TreeNode(0);

//         Solution solution = new Solution();
//         int height = solution.maxDepth(root);

//         System.out.println("Height of the binary tree: " + height); // Output: 3
//     

import java.util.*;

// public class RecursiveBubbleSort {

// Main function for sorting using bubble sort with recursion
// public static void insertBottom(Stack<Integer> s, int m) {
// if (arr.size() <= 1)
// return;
// int temp = arr.remove(arr.size() - 1);
// bubbleSort(arr);
// insert(arr, temp);
// }
// if (s.size() == 1)
// return;
// int temp = s.pop();
// InsertionSort(s);
// insert(s, temp);
// int t = 0;
// if (m == 1) {
// s.pop();
// return;
// }
// t = s.pop();
// remove(s, m - 1);
// s.push(t);
//     int t = 0;
//     if (s.isEmpty()) {
//         s.push(m);
//         return;
//     }
//     t = s.pop();
//     insertBottom(s, m);
//     s.push(t);

// }

// public static void reverse(Stack<Integer> stack, int n) {
// if (arr.size() == 0 || arr.get(arr.size() - 1) <= val) {
// arr.add(val);
// return;
// }
// int t1 = arr.remove(arr.size() - 1);
// insert(arr, val);
// arr.add(t1);
// if (stack.size() == 0 || stack.peek() <= val) {
// stack.push(val);
// return;
// }
// int t1 = stack.pop();
// insert(stack, val);
// stack.push(t1);
// int k = 0;
// if (stack.size() % 2 != 0) {
// k = n / 2 + 1;
// } else {
// k = n + 1 / 2;
// }
// remove(stack, k);
//     int t = 0;
//     if (n == 0) {
//         return;
//     }
//     t = stack.pop();
//     reverse(stack, n - 1);
//     insertBottom(stack, t);
// }

// }

//     public static void main(String[] args) {
//         Stack<Integer> s1 = new Stack<>();
//         s1.add(1);
//         s1.add(2);
//         s1.add(3);
//         s1.add(4);
//         s1.add(5);
//         // s1.add(8);
//         // s1.add(1);
//         int n = s1.size();
//         reverse(s1, n);

//         System.out.println(s1); // Output: [1, 2, 3, 4, 5]
//     }
// }
// public class Solution {
//     public void generate(List<Integer> inp, List<Integer> op, Set<Set<Integer>> ans) {
//         if (inp.size() == 0) {
//             ans.add(new HashSet<>(op));
//             return;
//         }
//         List<Integer> op1 = new ArrayList<>(op);
//         List<Integer> op2 = new ArrayList<>(op);
//         op2.add(inp.get(0));
//         List<Integer> newIp = new ArrayList<>(inp);
//         newIp.remove(0);
//         generate(newIp, op1, ans);
//         generate(newIp, op2, ans);

//     }

//     public Set<Set<Integer>> subsets(int[] nums) {
//         List<Integer> input = new ArrayList<>();
//         for (int num : nums) {
//             input.add(num);
//         }
//         Collections.sort(input);
//         Set<Set<Integer>> ans = new HashSet<>();
//         List<Integer> output = new ArrayList<>();
//         generate(input, output, ans);
//         return ans;
//     }

//     public static void main(String[] args) {
//         Solution sol = new Solution();
//         int[] nums = { 1, 1, 2, 1 };
//         Set<Set<Integer>> subsets = sol.subsets(nums);
//         for (Set<Integer> subset : subsets) {
//             System.out.println(subset);
//         }

//     }
// }
// public class Solution {
//     public void permutations(String input, String output) {
//         if (input.length() == 0) {
//             System.out.println(output);
//             return;
//         }
//         String currentInput = "" + input.charAt(0);
//         String remaining = input.substring(1);
//         permutations(remaining, output + " " + currentInput);
//         permutations(remaining, output + currentInput);
//     }

//     public static void main(String[] args) {
//         Solution sol = new Solution();
//         String str = "ABC";
//         String output = "" + str.charAt(0);
//         String input = str.substring(1);
//         // System.out.println(output);
//         // System.out.println(input);
//         sol.permutations(input, output);

//     }

// }
// public class Solution {
//     public void permuteCase(String input, String output, ArrayList<String> arr) {
//         if (input.length() == 0) {
//             arr.add(output);
//             System.out.println(arr);
//             return;
//         }
//         String op = "" + input.charAt(0);
//         String in = input.substring(1);

//         permuteCase(in, output + op.toLowerCase(), arr);
//         permuteCase(in, output + op.toUpperCase(), arr);

//     }

//     public static void main(String[] args) {
//         Solution sol = new Solution();
//         ArrayList<String> arr = new ArrayList<>();
//         String str = "ABC";
//         String input = str.toLowerCase();
//         String output = "";
//         sol.permuteCase(input, output, arr);
//     }
// }

// public class Solution {
//     public void permuteCase(String in, String op, List<String> ans) {
//         int n = in.length();
//         if (n == 0) {
//             ans.add(op);
//             System.out.println(ans);
//             return;
//         }
//         char ch = in.charAt(0);
//         String newIp = in.substring(1);
//         if (Character.isAlphabetic(ch)) {
//             permuteCase(newIp, op + Character.toLowerCase(ch), ans);
//             permuteCase(newIp, op + Character.toUpperCase(ch), ans);
//         } else {
//             // if it is digit then directly append to op
//             permuteCase(newIp, op + ch, ans);
//         }
//     }

//     public static void main(String[] args) {
//         Solution sol = new Solution();
//         List<String> arr = new ArrayList<>();
//         String str = "a1B2";
//         String input = str.toLowerCase();
//         String output = "";
//         sol.permuteCase(input, output, arr);

//     }
// }
//josephus problem
// public class Solution {

//     public static void main(String[] args) {
//         int n = 5, k = 2;
//         int index = 0, ans = -1;
//         List<Integer> soldiers = new ArrayList<>();

//         for (int i = 1; i <= n; i++) {
//             soldiers.add(i);
//         }
//         int res = solve(soldiers, k, index, ans);
//         System.out.println("Last soldier standing is: " + res);
//     }

//     private static int solve(List<Integer> soldiers, int k, int index, int ans) {
//         if (soldiers.size() == 1) {
//             ans = soldiers.get(0);
//             return ans;
//         }
//         index = (index + k - 1) % soldiers.size();
//         System.out.println("Soldier " + soldiers.remove(index) + " killed");

//         return solve(soldiers, k, index, ans);
//     }
// }
//sort an array
// uisng recursion(insertion+Recursion)

// public class Solution {
//     public void insert(ArrayList<Integer> arr, int temp) {
//         if (arr.size() == 0 || arr.get(arr.size() - 1) <= temp) {
//             arr.add(temp);
//             return;
//         }
//         int ele = arr.remove(arr.size() - 1);
//         insert(arr, temp);
//         arr.add(ele);
//     }

//     public void sort(ArrayList<Integer> arr) {
//         if (arr.size() == 1) {//base
//             return;
//         }
//         int n = arr.size();
//         int temp;
//         temp = arr.remove(n - 1);
//         sort(arr);//hypothesis
//         insert(arr, temp);//induction
//     }

//     public static void main(String[] args) {
//         ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(8, 3, 1, 6, 7));
//         System.out.println(arr);
//         Solution sol = new Solution();
//         sol.sort(arr);
//         System.out.print(arr);
//     }
// }
//sort an stack
// public class Solution {
//     public void insert(Stack<Integer> stack, int temp) {
//         if (stack.size() == 0 || stack.peek() <= temp) {
//             stack.push(temp);
//             return;
//         }
//         int val = stack.pop();
//         insert(stack, temp);
//         stack.push(val);

//     }

//     public void sort(Stack<Integer> s) {
//         if (s.size() == 1) {
//             return;
//         }
//         int ele = s.pop();
//         sort(s);
//         insert(s, ele);

//     }

//     public static void main(String[] args) {
//         Stack<Integer> s = new Stack<>();
//         s.push(2);
//         s.push(3);
//         s.push(1);
//         s.push(0);
//         System.out.print(s);
//         Solution sol = new Solution();
//         sol.sort(s);
//         System.out.print(s);

//     }
// }
// public class Solution {
//     public void delete(Stack<Integer> s, int temp) {

//         if (temp == 1) {
//             s.pop();
//             return;
//         }
//         int ele = s.pop();
//         delete(s, temp - 1);
//         s.push(ele);
//     }

//     public static void main(String[] args) {
//         Stack<Integer> s = new Stack<>();
//         s.push(2);
//         s.push(3);
//         s.push(1);
//         s.push(0);

//         System.out.print(s);
//         Solution sol = new Solution();
//         int k = 0;
//         int n = s.size();
//         if (s.size() % 2 != 0) {
//             k = (n + 1) / 2;
//         } else {
//             k = n / 2 + 1;
//         }
//         sol.delete(s, k);
//         System.out.print(s);

//     }
// }
//reverse the stack
// public class Solution {
//     public void unwinding(Stack<Integer> stack, int val) {
//         if (stack.isEmpty()) {
//             stack.push(val);
//             return;
//         }
//         int top = stack.pop();
//         unwinding(stack, val);
//         stack.push(top);

//     }

//     public void reverse(Stack<Integer> s) {
//         int n = s.size();
//         if (s.size() <= 1) {
//             return;
//         }
//         int ele = s.pop();
//         reverse(s);
//         unwinding(s, ele);
//     }

//     public static void main(String[] args) {
//         Stack<Integer> s = new Stack<>();
//         s.push(2);
//         s.push(3);
//         s.push(1);
//         s.push(0);
//         System.out.print(s);
//         Solution sol = new Solution();
//         sol.reverse(s);
//         System.out.print(s);
//     }
// }
//Permutations of string
// public class Solution {
//     public static void permutations(String input, String output, HashSet<String> arr) {
//         if (input.length() == 0) {
//             arr.add(output);
//             return;
//         }
//         int n = input.length();
//         for (int i = 0; i < n; i++) {
//             String newInput = input.substring(0, i) + input.substring(i + 1);
//             char newOutput = input.charAt(i);
//             permutations(newInput, output + newOutput, arr);

//         }
//     }

//     public static void main(String args[]) {
//         String input = "aab";
//         String output = "";
//         // List<String> arr = new ArrayList<>();
//         HashSet<String> arr = new HashSet<>();
//         permutations(input, output, arr);
//         for (String s : arr) {
//             System.out.println(s);

//         }
//     }
// }
// public class Solution {
//     public static void swap(char[] a, int start, int end) {
//         char temp = a[start];
//         a[start] = a[end];
//         a[end] = temp;
//     }

//     public static void permutations(char[] arr, int index, List<String> res) {
//         // basecondition
//         int n = arr.length;
//         if (n == index) {
//             System.out.println("Reached base: " + new String(arr));
//             res.add(new String(arr));
//             return;
//         }
//         for (int i = index; i < n; i++) {
//             System.out.println("Before swap: index=" + index + ", i=" + i + ", arr=" +
//                     Arrays.toString(arr));
//             swap(arr, index, i);
//             System.out.println("After swap: " + Arrays.toString(arr));
//             permutations(arr, index + 1, res);
//             swap(arr, index, i);
//             System.out.println("After undo: " + Arrays.toString(arr));
//         }

//     }

//     public static void main(String args[]) {

//         char[] arr = { 'x', 'y' };
//         // HashSet<String> arr = new HashSet<>();

//         List<String> result = new ArrayList<>();
//         permutations(arr, 0, result);
//         for (String s : result) {
//             System.out.println(s);

//         }
//     }
// }
// public class Solution {
//     public static void swap(char[] a, int start, int end) {
//         char temp = a[start];
//         a[start] = a[end];
//         a[end] = temp;
//     }

//     public static void permutations(char[] arr, int k, int index, List<String> res) {
//         // basecondition
//         int n = arr.length;
//         if (index == k) {
//             System.out.println("Reached base: " + new String(arr));
//             res.add(new String(arr));
//             return;
//         }
//         for (int i = index; i < n; i++) {
//             System.out.println("Before swap: index=" + index + ", i=" + i + ", arr=" +
//                     Arrays.toString(arr));
//             swap(arr, index, i);
//             System.out.println("After swap: " + Arrays.toString(arr));
//             permutations(arr, k, index + 1, res);
//             swap(arr, index, i);
//             System.out.println("After undo: " + Arrays.toString(arr));
//         }

//     }

//     public static void main(String args[]) {

//         String str = "3435335";
//         int k = 3;
//         // HashSet<String> arr = new HashSet<>();
//         char[] chars = str.toCharArray();

//         List<String> result = new ArrayList<>();
//         permutations(chars, k, 0, result);
//         Collections.sort(result);
//         int n = result.size();
//         System.out.println(result.get(n - 1));

//     }
// }
//binary search
// public class Solution {
//     public static int LowerBound(int arr[], int x) {
//         int low = 0;
//         int n = arr.length;
//         int high = n - 1;
//         // int mid = (low + high) / 2;
//         int ans = n;
//         while (low <= high) {
//             int mid = low + (high - low) / 2;
//             if (arr[mid] >= x) {
//                 ans = mid;
//                 high = mid - 1;
//             } else {
//                 low = mid + 1;
//             }
//         }
//         return ans;
//     }

//     public static void main(String args[]) {
//         int[] arr = { 2, 3, 4, 5, 6, 7 };
//         int x = 8;
//         int value = LowerBound(arr, x);

//         System.out.println("the valu eid" + value);

//     }
// }
// public class Solution {
//     public static int LowerBound(int arr[], int x) {
//         int low = 0;
//         int n = arr.length;
//         int high = n - 1;
//         // int mid = (low + high) / 2;
//         int ans = n;
//         while (low <= high) {
//             int mid = low + (high - low) / 2;
//             if (arr[mid] >= x) {
//                 ans = mid;
//                 high = mid - 1;
//             } else {
//                 low = mid + 1;
//             }
//         }
//         return ans;
//     }

//     public static void main(String args[]) {
//         int[] arr = { 1, 3, 3, 5, 5, 7, 9 };
//         int x = 5;
//         int value = LowerBound(arr, x);

//         System.out.println("the valu eid" + value);

//     }
// }

// public class Solution {
//     public static int ArrayRotation(int arr[], int x) {
//         int low = 0;
//         int n = arr.length;
//         int high = n - 1;
//         while (low <= high) {
//             int mid = low + (high - low) / 2;
//             if (arr[mid] == x) {
//                 return mid;
//             }
//             if (arr[low] == arr[mid] && arr[mid] == arr[high]) {
//                 low++;
//                 high--;
//                 continue;
//             }
//             if (arr[low] <= arr[mid]) {
//                 // left half
//                 if (arr[low] <= x && x <= arr[mid]) {
//                     high = mid - 1;
//                 } else {
//                     low = mid + 1;
//                 }
//             } else {
//                 // right half
//                 if (arr[mid] < x && x <= arr[high]) {
//                     low = mid + 1;
//                 } else {
//                     high = mid - 1;
//                 }
//             }

//         }
//         return -1;
//     }

//     public static void main(String args[]) {
//         int[] arr = { 2, 2, 2, 3, 4, 2 };
//         int x = 3;
//         int value = ArrayRotation(arr, x);

//         System.out.println("the valu eid" + value);

//     }
// }
// public class Solution {
//     public static int firstOccurence(int arr[], int x) {
//         int low = 0;
//         int n = arr.length;
//         int high = n - 1;
//         int ans = -1;
//         while (low <= high) {
//             int mid = low + (high - low) / 2;
//             if (arr[mid] == x) {
//                 ans = mid;
//                 // search on left for the smaller values
//                 high = mid - 1;
//             } else if (arr[mid] < x) {
//                 low = mid + 1;
//             } else {
//                 high = mid - 1;
//             }

//         }
//         return ans;
//     }

//     public static int lastOccurence(int arr[], int x) {
//         int n = arr.length;
//         int low = 0;
//         int high = n - 1;
//         int ans = -1;
//         while (low <= high) {
//             int mid = low + (high - low) / 2;
//             if (arr[mid] == x) {
//                 ans = mid;
//                 // seacrh on right for the larger values
//                 low = mid + 1;
//             } else if (arr[mid] < x) {
//                 low = mid + 1;
//             } else {
//                 high = mid - 1;
//             }
//         }
//         return ans;
//     }

//     public static int Countof(int arr[], int x) {
//         int first = firstOccurence(arr, x);
//         int last = lastOccurence(arr, x);
//         int count = last - first + 1;
//         return count;

//     }

//     public static void main(String args[]) {
//         int[] arr = { 1, 2, 2, 2, 2, 3, 4, 5 };
//         int x = 2;
//         int value = Countof(arr, x);

//         System.out.println("the value id" + value);

//     }
// }
// public class Solution {
//     public static int Min(int arr[]) {
//         int low = 0;
//         int n = arr.length;
//         int high = n - 1;
//         int min = Integer.MAX_VALUE;
//         while (low <= high) {
//             int mid = (low + high) / 2;
//             if (arr[low] <= arr[mid]) {
//                 min = Math.min(min, arr[low]);
//                 // search on right side
//                 low = mid + 1;

//             } else {
//                 min = Math.min(min, arr[mid]);
//                 high = mid - 1;
//             }

//         }
//         return min;
//     }

//     public static void main(String args[]) {
//         int[] arr = { 5, 6, 7, 0, 1, 2, 3, 4 };
//         // int x = 2;
//         int value = Min(arr);

//         System.out.println("the value id" + value);

//     }
// }

// public class Solution {
//     public static int Nthroot(int n, int m) {
//         int low = 1;
//         // int n = arr.length;
//         int high = m;
//         while (low <= high) {
//             int mid = (low + high) / 2;
//             int value = 1;
//             value = (int) Math.pow(mid, n);
//             if (value == m) {
//                 return mid;
//             } else if (value > m) {
//                 high = mid - 1;
//             } else {
//                 low = mid + 1;
//             }

//         }
//         return -1;

//     }

//     public static void main(String args[]) {
//         // int[] arr = { 5, 6, 7, 0, 1, 2, 3, 4 };
//         // int x = 2;

//         // int value = Min(arr);
//         int n = 1, m = 838098533;
//         int res = Nthroot(n, m);
//         System.out.println("the value id" + res);

//     }
// }

// public class Solution {
//     public static int Max(int[] arr) {
//         int max = 0;
//         for (int i = 0; i < arr.length; i++) {
//             if (arr[i] > max) {
//                 max = arr[i];
//             }
//         }
//         return max;
//     }

//     public static int Sum(int[] arr, int divisor) {
//         int sum = 0;
//         for (int i = 0; i < arr.length; i++) {
//             int res = (int) Math.ceilDiv(arr[i], divisor);
//             sum += res;
//         }
//         return sum;
//     }

//     public static int SmallestDivisor(int[] arr, int limit) {
//         int low = 1;
//         int high = Max(arr);
//         int ans = 0;
//         while (low <= high) {
//             int mid = (low + high) / 2;
//             int val = Sum(arr, mid);
//             if (val <= limit) {
//                 ans = mid;
//                 high = mid - 1;
//             } else {
//                 low = mid + 1;
//             }
//         }
//         return ans;

//     }

//     public static void main(String args[]) {
//         int[] arr = { 8, 4, 2, 3 };
//         int limit = 4;

//         // int value = Min(arr);
//         // int n = 1, m = 838098533;
//         int res = SmallestDivisor(arr, limit);
//         System.out.println("the value id" + res);

//     }
// }
// public class Solution {
//     public static int Max(int[] arr) {
//         int max = 0;
//         for (int i = 0; i < arr.length; i++) {
//             if (arr[i] > max) {
//                 max = arr[i];
//             }
//         }
//         return max;
//     }

//     public static int Sum(int[] arr, int mid) {
//         int n = arr.length;
//         int sum = 0;
//         for (int i = 0; i < n; i++) {

//             sum += (int) Math.ceil((double) arr[i] / mid);
//         }
//         return sum;

//     }

//     public static int KoKo(int[] arr, int h) {
//         int low = 1;
//         // int n = arr.length;
//         int high = Max(arr);
//         int ans = -1;
//         while (low <= high) {
//             int mid = (low + high) / 2;
//             int value = Sum(arr, mid);
//             if (value <= h) {
//                 ans = mid;
//                 high = mid - 1;
//             } else {
//                 low = mid + 1;
//             }

//         }
//         return ans;

//     }

//     public static void main(String args[]) {
//         int[] arr = { 3, 7, 6, 11 };
//         int h = 8;

//         // int value = Min(arr);
//         // int n = 1, m = 838098533;
//         int res = KoKo(arr, h);
//         System.out.println("the value id" + res);

//     }
// }
class Solution {
    public int rowWithMax1s(int[][] mat) {
        int row = -1;
        int max = 0;
        for (int i = 0; i < mat.length; i++) {
            int count = 0;
            for (int j = 0; j < mat[0].length; j++) {
                if (mat[i][j] == 1) {
                    count++;
                }
                // if (count > max) {
                // max = count;
                // row = i;
                // }

            }
            if (count > max) {
                max = count;
                row = i;
            }

        }
        return row;
    }

    public static void main(String[] args) {
        int[][] matrix = { { 1, 1, 1 }, { 0, 0, 1 }, { 0, 0, 0 } };

        // Create an instance of the Solution class
        Solution sol = new Solution();

        // Print the answer
        System.out.println("The row with maximum number of 1's is: " +
                sol.rowWithMax1s(matrix));
    }

}