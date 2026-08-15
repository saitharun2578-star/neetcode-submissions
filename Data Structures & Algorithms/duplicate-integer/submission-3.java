
class Solution {
    public static boolean hasDuplicate(int[] nums) {
        for(int i=0;i<nums.length;i++){
            int c=0;
            for(int j=0;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    c++;
                }
            }
            if(c>1){
                return true;
            }
        }
        return false;
    }
 public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        
ArrayList<Integer> n=new ArrayList<>();
 while(sc.hasNextInt()){
      n.add(sc.nextInt());
    
}
int[] num=new int[n.size()];
for(int i=0;i<n.size();i++){
    num[i]=n.get(i);
}

System.out.print(hasDuplicate(num));
    }
}


