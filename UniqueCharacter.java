class UniqueCharacter{
    public static int uniqueCharacter(String s){
        int k=-1;
        int n = s.length();
        
            for(int i=0; i<n-1; i++){
                 for(int j=i+1;j<n;j++){
                    if(s.charAt(i)==s.charAt(j)){
                        return i;
                        
                    }
                }  
            }
        
        return -1;
    }
    public static void main(String[] args) {
        String s = "Leetcode";
        int c = uniqueCharacter(s);
        System.out.println(c);

    }
}