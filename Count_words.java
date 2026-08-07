class Solution {
    public int countSegments(String s) {
        String[] t = s.split(" ");
        int count=0;
        for(int i=0;i<t.length;i++){
            if(!t[i].equals("")){
            count=count+1;
            }
        }
        return count;
    }
}