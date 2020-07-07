public class Solution {
    static class Pair {
	    TreeNode t;
	    int x;
	    Pair(TreeNode t,int x) {
	        this.t=t;
	        this.x=x;
	    }
	}

	public int solve() {
		Queue<Pair> q=new LinkedList<Pair>();
	    q.add(new Pair(root,0));
    }
}