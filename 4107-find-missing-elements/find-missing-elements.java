class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        Arrays.sort(nums);
        ArrayList<Integer> list1 = new ArrayList<>();
        for (int num : nums) 
        {
            list1.add(num);
        }
        ArrayList<Integer> list2 = new ArrayList<>();

        int smallest = nums[0];
        int largest = nums[nums.length-1];

        int idx=0;

        for(int i=smallest;i<=largest;i++)
        {
            if(!list1.contains(i)) list2.add(i);
        }

        return list2;

    }
}