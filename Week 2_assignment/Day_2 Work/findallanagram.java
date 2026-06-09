class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans = new ArrayList<>();

    if(p.length() > s.length()){
        return ans;
    }
    int[] pCount = new int[26];
    int[] windowCount = new int[26];

    for(int i = 0; i<p.length() ; i++ ){
        pCount[p.charAt(i) - 'a']++;
    }
    int left = 0;
    for(int right = 0 ; right < s.length(); right++){

        windowCount[s.charAt(right) - 'a']++;

        if(right - left + 1 > p.length()){
            windowCount[s.charAt(left) - 'a']--;
            left++;
        }
    

if(Arrays.equals(pCount,windowCount)){
    ans.add(left);
}
    }


return ans;
    }
}
