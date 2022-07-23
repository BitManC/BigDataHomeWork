object diameterOfBinaryTree {
  private var res = 0

  def diameterOfBinaryTree(root: TreeNode): Int = {
      depth(root)
      res - 1
  }

  def depth(root: TreeNode): Int = {
    if (root == null){
      return 0
    }
    val l = depth(root.left)
    val r = depth(root.right)
    res = math.max(res, l + r + 1 )
    math.max(l, r) + 1
  }
}
