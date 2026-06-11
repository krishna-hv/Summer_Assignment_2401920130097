class Solution {
    int index = 0;

    public String decodeString(String s) {
        StringBuilder result = new StringBuilder();

        while (index < s.length() && s.charAt(index) != ']') {

            char ch = s.charAt(index);

            if (Character.isLetter(ch)) {
                result.append(ch);
                index++;
            } else if (Character.isDigit(ch)) {
                int num = 0;

                while (index < s.length() &&
                       Character.isDigit(s.charAt(index))) {
                    num = num * 10 + (s.charAt(index) - '0');
                    index++;
                }

                index++; 

                String decodedPart = decodeString(s);

                index++; 

                for (int i = 0; i < num; i++) {
                    result.append(decodedPart);
                }
            }
        }

        return result.toString();
    }
}
