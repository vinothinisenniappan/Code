class Solution {
    public boolean checkPerfectNumber(int num) {
        int value=0;
        for(int i=1;i<num;i++){
            if(num%i==0){
                value+=i;
            }
        }
        if(value==num){
                return true;
        }
        else{
        return false;
        }
    }
}