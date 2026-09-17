class Solution {
    public String minRemoveToMakeValid(String s) {

        StringBuilder result = new StringBuilder();
        int open = 0;

        // Step 1: Remove invalid ')'
        for (char ch : s.toCharArray()) {

            if (ch == '(') {
                open++;
                result.append(ch);
            }
            else if (ch == ')') {

                if (open > 0) {
                    open--;
                    result.append(ch);
                }
            }
            else {
                result.append(ch);
            }
        }

        // Step 2: Remove extra '('
        for (int i = result.length() - 1; i >= 0 && open > 0; i--) {

            if (result.charAt(i) == '(') {
                result.deleteCharAt(i);
                open--;
            }
        }

        return result.toString();
    }
}
