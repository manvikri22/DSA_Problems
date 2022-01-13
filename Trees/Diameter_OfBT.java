package Trees;

import java.util.*;
public class Diameter_OfBT{
    Node root;
    int ans =0;
    Diameter_OfBT(int d)
    {
        root = new Node(d);
    }
    Diameter_OfBT()
    {
        root = null;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Diameter_OfBT t1 = new Diameter_OfBT();
        t1.root = new Node(1);
        t1.root.left = new Node(2);
        t1.root.right= new Node(3);
        t1.root.left.right = new Node(4);

        System.out.println("Diameter of the tree: "+t1.Diameter());
        sc.close();
    }

    int Diameter() { return Diameter(root); }

    int Diameter(Node root)
    {
        if(root ==null) return 0;
        int lh = Diameter(root.left);// Height of left sub tree
        int rh = Diameter(root.right);// Height of right sub tree
        ans = Math.max(ans, 1+lh+rh);
        return 1+ Math.max(lh, rh);
    }

}
class Node
{
    int data;
    Node left, right;

    public Node(int d)
    {
        data = d;
        left = right = null;
    }
}
