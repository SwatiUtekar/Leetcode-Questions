class Solution {
    public int[] plusOne(int[] digits) {
        int add=1;
        int sum=0;
        List<Integer> list = new ArrayList<Integer>();
        int i=0;
        while(add>0 || i<=digits.length-1) {
            if(i<=digits.length-1) {
                sum=digits[digits.length-1-i]+add;
                list.add(sum%10);
                add=sum/10;
            }
            else {
                sum=add;
                list.add(sum);
                add=sum/10;
            }
            i++;
        }
        

        int[] result = new int[list.size()];
        for(int j=0 ; j<list.size() ; j++) {
            result[j]=list.get(list.size()-1-j);
        }

        return result;
    }
}