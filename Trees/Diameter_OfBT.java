package Trees;

import java.util.*;
public class Diameter_OfBT{
    static Node root;
    static int ans =0;
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
        Diameter_OfBT.root = new Node(1);
        Diameter_OfBT.root.left = new Node(2);
        Diameter_OfBT.root.right= new Node(3);
        Diameter_OfBT.root.left.right = new Node(4);

        System.out.println("Diameter of the tree: "+Diameter(root));
        sc.close();
    }

    public static int Diameter(Node root)
    {
        if(root ==null) return 0;
        int lh = Diameter(root.left);
        int rh = Diameter(root.right);
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
