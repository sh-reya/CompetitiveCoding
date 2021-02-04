class Solution 
{
    public int diameterOfBinaryTree(TreeNode root) 
    {
        if (root==null)
        {
            return 0;
        }
        else
        {
            int LD=diameterOfBinaryTree(root.left);
            int RD=diameterOfBinaryTree(root.right);
            int LH=height(root.left);
            int RH=height(root.right);
            int res= LH+RH;
            
            return Math.max(res,Math.max(LD,RD));
        }
        
    }
    static int height(TreeNode root)
    {
        if(root==null)
        {
            return 0;
        }
        
        else
        {
            int LLH=height(root.left);
            int RRH=height(root.right);
            
            return 1+Math.max(LLH,RRH);
            
        }
    }
}
