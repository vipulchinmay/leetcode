// Last updated: 04/10/2025, 15:51:40
import java.util.*;

class Solution {
    public String[] spellchecker(String[] wordlist, String[] queries) {
        Set<String> exact = new HashSet<>();
        Map<String, String> caseInsensitive = new HashMap<>();
        Map<String, String> vowelInsensitive = new HashMap<>();

        for (String word : wordlist) {
            exact.add(word);

            String lower = word.toLowerCase();
            caseInsensitive.putIfAbsent(lower, word);

            String devoweled = devowel(lower);
            vowelInsensitive.putIfAbsent(devoweled, word);
        }

        String[] result = new String[queries.length];
        for (int i = 0; i < queries.length; i++) {
            String q = queries[i];
            if (exact.contains(q)) {
                result[i] = q; // rule 1
            } else {
                String lower = q.toLowerCase();
                if (caseInsensitive.containsKey(lower)) {
                    result[i] = caseInsensitive.get(lower); // rule 2
                } else {
                    String devoweled = devowel(lower);
                    if (vowelInsensitive.containsKey(devoweled)) {
                        result[i] = vowelInsensitive.get(devoweled); // rule 3
                    } else {
                        result[i] = ""; // rule 4
                    }
                }
            }
        }
        return result;
    }

    private String devowel(String word) {
        StringBuilder sb = new StringBuilder();
        for (char c : word.toCharArray()) {
            if ("aeiou".indexOf(c) >= 0) {
                sb.append('#'); // replace vowels with placeholder
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
