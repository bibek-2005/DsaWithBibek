class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> arr = new ArrayList<>();

        TreeNode curr = root;
        while(curr != null) {
            if(curr.left != null){
                // find predecessor
                TreeNode pred = curr.left;
                while(pred.right != null && pred.right != curr) pred = pred.right;  // finding the predecessor is complete

                if(pred.right == null){ // this is the linking part
                    pred.right = curr; // fake connection
                    curr = curr.left;
                }
                else { // this is unlinking part 
                    pred.right = null;
                    arr.add(curr.val);
                    curr= curr.right;
                }
            }
            else{
                // add the value of tree in the List.
                arr.add(curr.val);
                curr = curr.right;
            }
        }
        return arr;
    }
}
