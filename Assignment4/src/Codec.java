public class Codec {
    public String serialize(TreeNode root) {
        if(root == null){
            return "#";
        }
        return String.valueOf(root.val) + "," + serialize(root.left) + "," + serialize(root.right);
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        String[]strs = data.split(",");
        return deserialize(strs, new int[]{0});
    }
    private TreeNode deserialize(String[]arr, int[]idx){
        if(arr[idx[0]].equals("#")){
            idx[0]++;
            return null;
        }
        TreeNode root = new TreeNode(Integer.parseInt(arr[idx[0]++]));
        root.left = deserialize(arr, idx);
        root.right = deserialize(arr, idx);
        return root;
    }
}
