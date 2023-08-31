class Solution {
    public int romanToInt(String s) {
        int sum=0;
        for(int i=0 ; i<s.length() ; i++) {
            // V
            if(s.charAt(i)=='V') {
                sum+=5;
            }else if(s.charAt(i)=='L') {
                sum+=50;
            }else if(s.charAt(i)=='D') {
                sum+=500;
            }else if(s.charAt(i)=='M') {
                sum+=1000;
            }

            if(i<s.length()-1) {
                // I
                if(s.charAt(i)=='I') {
                    if(s.charAt(i+1)=='V') {
                        sum+=4;
                        i++;
                    }else if(s.charAt(i+1)=='X') {
                        sum+=9;
                        i++;
                    }else {
                        sum+=1;
                    }
                }
                // X
                else if(s.charAt(i)=='X') {
                    if(s.charAt(i+1)=='L') {
                        sum+=40;
                        i++;
                    }else if(s.charAt(i+1)=='C') {
                        sum+=90;
                        i++;
                    }else {
                        sum+=10;
                    }
                }
                // C
                else if(s.charAt(i)=='C') {
                    if(s.charAt(i+1)=='D') {
                        sum+=400;
                        i++;
                    }else if(s.charAt(i+1)=='M') {
                        sum+=900;
                        i++;
                    }else {
                        sum+=100;
                    }
                }
            }else {
                // I
                if(s.charAt(i)=='I') {
                    sum+=1;
                }
                // X
                else if(s.charAt(i)=='X') {
                    sum+=10;
                }
                // C
                else if(s.charAt(i)=='C') {
                    sum+=100;
                }
            }    
        }

        return sum;
        
    }
}