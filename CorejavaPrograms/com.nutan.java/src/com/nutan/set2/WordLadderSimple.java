package com.nutan.set2;
import java.util.*;                               // Import utilities: List, Set, Queue, HashSet, LinkedList, Arrays

public class WordLadderSimple {                    // Define a public class named WordLadderSimple

    // Function that returns the shortest number of steps from beginWord to endWord
    public static int ladderLength(String beginWord, String endWord, List<String> wordList) {

        Set<String> wordSet = new HashSet<>(wordList); // Put dictionary into a HashSet for O(1) lookups

        if (!wordSet.contains(endWord)) {              // If endWord isn't present, no valid transformation exists
            return 0;                                  // Return 0 as per problem requirement
        }

        Queue<String> queue = new LinkedList<>();      // Create a queue for BFS (level-by-level traversal)
        queue.add(beginWord);                          // Start BFS from the beginWord

        int steps = 1;                                 // Level counter: beginWord counts as step 1

        while (!queue.isEmpty()) {                     // Continue until there are no words left to explore
            int size = queue.size();                   // Number of nodes/words at the current BFS level

            for (int i = 0; i < size; i++) {           // Process exactly this level's words
                String word = queue.poll();            // Take one word from the queue

                if (word.equals(endWord)) {            // If we've reached the endWord
                    return steps;                      // Return the number of steps used to get here
                }

                char[] chars = word.toCharArray();     // Work with a mutable char array for letter changes
                for (int j = 0; j < chars.length; j++) { // For each position in the word
                    char originalChar = chars[j];        // Remember the original character

                    for (char c = 'a'; c <= 'z'; c++) {  // Try replacing with every letter 'a' to 'z'
                        if (c == originalChar) continue; // Skip if letter doesn't change

                        chars[j] = c;                    // Replace the j-th character with c
                        String newWord = new String(chars); // Build the candidate transformed word

                        if (wordSet.contains(newWord)) { // If this candidate is in the dictionary
                            queue.add(newWord);          // Enqueue to explore it in the next BFS level
                            wordSet.remove(newWord);     // Mark as visited by removing from the set
                        }
                    }

                    chars[j] = originalChar;             // Restore original letter before moving to next position
                }
            }

            steps++;                                     // Finished a level; increase step count for next level
        }

        return 0;                                       // If queue empties without finding endWord, no path exists
    }

    public static void main(String[] args) {            // Entry point for running the program
        String beginWord = "hit";                       // Given start word
        String endWord = "cog";                         // Given target word
        List<String> wordList = Arrays.asList(          // Given dictionary/list of allowed intermediate words
            "hot", "dot", "dog", "lot", "log", "cog"
        );

        int result = ladderLength(beginWord, endWord, wordList); // Call the BFS solver
        System.out.println("Shortest transformation length: " + result); // Print the answer
    }
}
