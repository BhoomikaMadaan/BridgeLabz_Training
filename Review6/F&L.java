package BridgeLabz_Training.Review6;

public class F&L
{
    public class FirstOccurence{
public static int firstOccurence(int[] nums, int target){
int left=0;
int right=nums.length-1;
int ans=-1;
while(left<=right){
int mid=(left+right)/2;

if(nums[mid]==target){
ans=mid;
right=mid-1;

}
else if(nums[mid]<target)
left=mid+1;

else
{
right=mid-1;
}
return ans;
}

public static lastOccurence(int[] nums,int target){
int left=0;
int right=nums.length-1;
int ans=-1;

while(left<=right){
int mid=(left+right)/2;
if(nums[mid]==target){
ans=mid;
left=mid+1;
}
else if(nums[mid]<target)
{
left=mid+1;
}
else
{
right=mid-1;
}
return ans;
}

public static void main(String[] args)
{
int[] nums={5,7,7,8,8,10};
int target=8;
System.out.println("[" + firstOccurence(nums,target) + lastOccurence(nums,target) + "]");
}
}


}
