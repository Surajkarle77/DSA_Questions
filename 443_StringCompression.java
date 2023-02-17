class Solution {
    public int compress(char[] chars) {

        int i=0;
        int j=0;

        while(i<chars.length){
            int grplen=1;
            while(i+grplen <chars.length && chars[i]==chars[grplen+i]){
                grplen++;
            }
            chars[j++]=chars[i];
            if(grplen>1){
                for(char ch:Integer.toString(grplen).toCharArray()){
                    chars[j++]=ch;
                }
            }
            i+=grplen;
        }
        return j;

    }
}
