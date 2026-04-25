import java.util.*;

class Solution {

    class Pair {
        TreeNode node;
        int hd;
        int lvl;

        Pair(TreeNode node, int hd, int lvl) {
            this.node = node;
            this.hd = hd;
            this.lvl = lvl;
        }
    }

    public List<List<Integer>> verticalTraversal(TreeNode root) {

        // column -> row -> min heap(sorted values)
        TreeMap<Integer, TreeMap<Integer, PriorityQueue<Integer>>> nodes
                = new TreeMap<>();

        Queue<Pair> q = new LinkedList<>();
        List<List<Integer>> ans = new ArrayList<>();

        if(root == null) return ans;

        q.offer(new Pair(root,0,0));

        while(!q.isEmpty()) {

            Pair temp = q.poll();

            TreeNode frontNode = temp.node;
            int hd = temp.hd;
            int lvl = temp.lvl;

            nodes.putIfAbsent(hd,new TreeMap<>());
            nodes.get(hd).putIfAbsent(lvl,new PriorityQueue<>());

            nodes.get(hd).get(lvl).offer(frontNode.val);

            if(frontNode.left != null){
                q.offer(new Pair(frontNode.left,hd-1,lvl+1));
            }

            if(frontNode.right != null){
                q.offer(new Pair(frontNode.right,hd+1,lvl+1));
            }
        }

        for(TreeMap<Integer, PriorityQueue<Integer>> levelMap : nodes.values()) {

            List<Integer> col = new ArrayList<>();

            for(PriorityQueue<Integer> pq : levelMap.values()) {

                while(!pq.isEmpty()){
                    col.add(pq.poll());
                }
            }

            ans.add(col);
        }

        return ans;
    }
}