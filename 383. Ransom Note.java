
#https://leetcode.com/problems/ransom-note/description/?envType=study-plan-v2&envId=top-interview-150

class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {

        Map<Character, Integer> ransomNoteMap = new HashMap<>();

        Map<Character, Integer> magazineMap = new HashMap<>();

        for (char c : ransomNote.toCharArray()) {
            ransomNoteMap.put(c, ransomNoteMap.getOrDefault(c, 0) + 1);
        }

        for (char c : magazine.toCharArray()) {
            magazineMap.put(c, magazineMap.getOrDefault(c, 0) + 1);

        }

        for (Map.Entry<Character, Integer> entry : ransomNoteMap.entrySet()) {
            if (ransomNoteMap.get(entry.getKey()) > magazineMap.getOrDefault(entry.getKey(), 0)) {
                return false;
            }
        }
        return true;
    }
}
