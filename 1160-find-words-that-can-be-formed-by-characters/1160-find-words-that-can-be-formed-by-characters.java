class Solution {
    public int countCharacters(String[] words, String chars) {
        int arr1[] = new int[26];
        for(int i=0; i<chars.length(); i++){
            char ch = chars.charAt(i);
            arr1[ch-97]++;
        }
        int ans = 0;

        for(int i=0; i<words.length; i++){
            String s = words[i];
            int arr2[] = new int[26];
            for(int j=0; j<s.length(); j++){
                arr2[s.charAt(j)-97]++;
            }

            boolean flag = true;
            for(int j=0; j<26; j++){
                if(arr1[j]<arr2[j]){
                    flag = false;
                    break;
                }
            }
            if(flag==true) ans = ans + s.length();
        }
        return ans;
    }
}