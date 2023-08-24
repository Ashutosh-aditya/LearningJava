import java.util.*;
public class maxSubArray {
    public static void solution(ArrayList<Integer> arr, int n, int k) {
        // Create a HashMap to store cumulative sums and their frequencies
        HashMap<Integer, Integer> mp = new HashMap<>();
        // Create a HashMap to store cumulative sums and their corresponding indices
        HashMap<Integer, Integer> mp1 = new HashMap<>();
        int curr = 0; // Current cumulative sum
        int ans = 0; // Number of subarrays with sum equal to k
        int maxSize = -1; // Size of the largest subarray with sum equal to k
        for (int i = 0; i < n; i++) {
            curr += arr.get(i); // Calculate cumulative sum
            if (curr == k) {
                ans++; // Increment subarray count if cumulative sum equals k
                maxSize = Math.max(maxSize, i + 1); // Update maxSize
            }
            if (mp.containsKey(curr - k)) {
                // If a subarray with sum (curr - k) exists, update the answer and maxSize
                ans += mp.get(curr - k);
                maxSize = Math.max(maxSize, i - mp1.get(curr - k));
            }
            mp.put(curr, mp.getOrDefault(curr, 0) + 1); // Update cumulative sum frequency
            if (!mp1.containsKey(curr)) {
                mp1.put(curr, i); // Store index of the first occurrence of cumulative sum
            }
        }
        System.out.println("No of subarrays " + ans); // Print the number of subarrays
        System.out.println("Min Deletion " + (n - maxSize)); // Print the minimum deletion required
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // Read the number of elements
        ArrayList<Integer> a = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            a.add(scanner.nextInt()); // Read the elements of the array
        }
        int k = scanner.nextInt(); // Read the target sum
        solution(a, n, k); // Call the solution function
    }
}