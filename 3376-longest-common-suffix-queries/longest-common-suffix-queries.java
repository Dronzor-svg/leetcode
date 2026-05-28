class Solution {

    class TrieNode {
        TrieNode[] children = new TrieNode[26];

        // best index for this suffix
        int idx = -1;

        // shortest length
        int len = Integer.MAX_VALUE;
    }

    TrieNode root = new TrieNode();

    // Insert reversed word into trie
    private void insert(String word, int index) {

        TrieNode node = root;

        // Update root info
        if (word.length() < node.len) {
            node.len = word.length();
            node.idx = index;
        }

        for (int i = word.length() - 1; i >= 0; i--) {

            int ch = word.charAt(i) - 'a';

            if (node.children[ch] == null) {
                node.children[ch] = new TrieNode();
            }

            node = node.children[ch];

            // Keep shortest length word
            if (word.length() < node.len) {
                node.len = word.length();
                node.idx = index;
            }
        }
    }

    // Search longest suffix match
    private int search(String word) {

        TrieNode node = root;

        for (int i = word.length() - 1; i >= 0; i--) {

            int ch = word.charAt(i) - 'a';

            if (node.children[ch] == null) {
                break;
            }

            node = node.children[ch];
        }

        return node.idx;
    }

    public int[] stringIndices(String[] wordsContainer, String[] wordsQuery) {

        // Build Trie
        for (int i = 0; i < wordsContainer.length; i++) {
            insert(wordsContainer[i], i);
        }

        int[] ans = new int[wordsQuery.length];

        // Process queries
        for (int i = 0; i < wordsQuery.length; i++) {
            ans[i] = search(wordsQuery[i]);
        }

        return ans;
    }
}