class Solution {
    public String reverseWords(String s) {
        int l = 0, r = s.length() - 1;

        // Trim left
        while (l <= r && s.charAt(l) == ' ') l++;

        // Trim right
        while (r >= l && s.charAt(r) == ' ') r--;

        StringBuilder sb = new StringBuilder();

        // Remove extra spaces
        while (l <= r) {
            if (s.charAt(l) != ' ') {
                sb.append(s.charAt(l));
            } else {
                if (sb.length() > 0 && sb.charAt(sb.length() - 1) != ' ') {
                    sb.append(' ');
                }
            }
            l++;
        }

        // Reverse entire string
        reverse(sb, 0, sb.length() - 1);

        // Reverse each word
        int start = 0;
        for (int end = 0; end <= sb.length(); end++) {
            if (end == sb.length() || sb.charAt(end) == ' ') {
                reverse(sb, start, end - 1);
                start = end + 1;
            }
        }

        return sb.toString();
    }

    private void reverse(StringBuilder sb, int i, int j) {
        while (i < j) {
            char temp = sb.charAt(i);
            sb.setCharAt(i, sb.charAt(j));
            sb.setCharAt(j, temp);
            i++;
            j--;
        }
    }
}