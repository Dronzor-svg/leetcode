class Solution {
    public void sortColors(int[] nums) {
        ArrayList<Integer> zeros = new ArrayList<>();
        ArrayList<Integer> ones = new ArrayList<>();
        ArrayList<Integer> twos = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0)
                zeros.add(nums[i]);
            else if (nums[i] == 1)
                ones.add(nums[i]);
            else
                twos.add(nums[i]);
        }
        if (!zeros.isEmpty()) {
            for (int i = 0; i < zeros.size(); i++) {
                nums[i] = zeros.get(i);
            }
        }

        if (!ones.isEmpty()) {
            if (!zeros.isEmpty()) {
                int a = zeros.size();
                for (int i = 0; i < ones.size(); i++) {
                    nums[a] = ones.get(i);
                    a++;
                }
            } else {
                for (int i = 0; i < ones.size(); i++) {
                    nums[i] = ones.get(i);
                }
            }

        }
        if (!twos.isEmpty()) {
            int a = zeros.size() + ones.size();

            for (int i = 0; i < twos.size(); i++) {
                nums[a] = twos.get(i);
                a++;
            }
        }

    }
}