class Solution {
    public String addBinary(String a, String b) {
        int alen=a.length()-1;
        int blen=b.length()-1;
        int i=0;
        int carry=0;
        StringBuilder sb = new StringBuilder(); 
        while(i<=alen || i<=blen || carry!=0) {
            int x=0;
            if(i<=alen && a.charAt(alen-i)=='1') {
                x=1;
            }
            int y=0;
            if(i<=blen && b.charAt(blen-i)=='1') {
                y=1;
            }
            sb=sb.append((x+y+carry)%2);
            carry=(x+y+carry)/2;
            i++;
        }
        return (sb.reverse()).toString();
    }
}