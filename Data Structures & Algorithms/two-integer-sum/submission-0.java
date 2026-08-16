
class Solution {
    public static int[] twoSum(int[] nums, int target) {
        for(int i=0;i<nums.length;i++){
          
            for(int j=0;j<nums.length;j++){
          if(nums[i]+nums[j]==target&&i!=j){
            return new int[]{i,j};

          }
            }
        }
        int[] r={-1,-1};
        return r;
    }
    public static void main(String[] ags){
        Scanner sc=new Scanner(System.in);
     ArrayList<Integer> arr=new ArrayList<>();
     while(sc.hasNextInt()){
        arr.add(sc.nextInt());
     }
     int t=sc.nextInt();
     int n=arr.size();
     int[] a=new int[n];
     for(int i=0;i<n;i++){
        a[i]=arr.get(i);
     }
     System.out.print(twoSum(a,t));
    }
} 