class Solution {
    public boolean halvesAreAlike(String s) {
        int n=s.length();

        String str1=s.substring(0,n/2);
        int a=0;
        for(int i=0 ; i<str1.length() ; i++) {
            char c1=str1.charAt(i);
            if(c1=='a' || c1=='e' || c1=='i' || c1=='o' || c1=='u' || c1=='A' || c1=='E' || c1=='I' || c1=='O' || c1=='U') {
                a++;
            }
        }

        String str2=s.substring(n/2,n);
        int b=0;
        for(int j=0 ; j<str2.length() ; j++) {
            char c2=str2.charAt(j);
            if(c2=='a' || c2=='e' || c2=='i' || c2=='o' || c2=='u' || c2=='A' || c2=='E' || c2=='I' || c2=='O' || c2=='U') {
                b++;
            }
        }

        return a==b;

    }
}