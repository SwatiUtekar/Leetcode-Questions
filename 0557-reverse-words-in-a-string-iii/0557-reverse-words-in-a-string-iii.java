class Solution {
    public String reverseWords(String s) {
        String[] arr1=s.split(" ");
        String[] arr2=new String[arr1.length];

        for(int i=0 ; i<arr1.length ; i++) {
            String s1=arr1[i];
            StringBuilder sb=new StringBuilder();
            for(int j=s1.length()-1 ; j>=0 ; j--) {
                sb.append(s1.charAt(j));
            }
            arr2[i]=new String(sb);    
        }

        StringBuilder sbAns=new StringBuilder();

        for(int k=0 ; k<arr2.length ; k++) {
            sbAns.append(arr2[k]);
            if(k!=arr2.length-1) {
                sbAns.append(" ");
            }
        }

        return new String(sbAns);
        
    }
}