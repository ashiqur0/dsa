/*
LeetCode : 3. Longest Substring Without Repeating Characters
Learning : Hash Table, String, Sliding Window
Description : Given a string s, find the length of the longest substring without duplicate characters.
Example 1:
Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.

Example 2:
Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.

Example 3:
Input: s = "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
*/

#include <bits/stdc++.h>
using namespace std;

int lengthOfLongestSubstring(string s) {
    unordered_set<char> window;
    int start = 0, end = 0, max_len = 0;
    while (end < s.size()) {
        if (!window.count(s[end])) {
            window.insert(s[end]);
            max_len = max(max_len, end - start + 1);
            end++;
        } else {
            window.erase(s[start]);
            start++;
        }
    }
    return max_len;
}

int main() {

    // string s = "abcabcbb";  // 3
    string s = "bbbbb";  // 1
    // string s = "pwwkew";  // 3
    cout << lengthOfLongestSubstring(s) << endl;

  return 0;
}