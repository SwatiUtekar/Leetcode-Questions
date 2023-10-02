class Solution {
    public boolean winnerOfGame(String colors) {
        int count=0;
        for(int i=1 ; i<colors.length()-1 ; i++) {
            char prev=colors.charAt(i-1);
            char current=colors.charAt(i);
            char next=colors.charAt(i+1);
//             Alice turn
            if(prev=='A' && current=='A' && next=='A') {
                count++;
            }
//             Bob turn
            if(prev=='B' && current=='B' && next=='B') {
                count--;
            }
            
        }
        return count>0;        
    }
}