import java.io.*;
import java.util.*;


public class Solution {
    public static class Node {
        int data;
        Node left;
        Node right;

        Node (int data){
            this.data = data;
        }
    }
    
    public static void preOT(Node node){
        if (node == null){
            return;
        }
        
        System.out.println(node.data);
        preOT(node.left);
        preOT(node.right);
    }

    public static void main(String[] args) {
        //Creating the nodes
        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);
        Node e = new Node(50);
        Node f = new Node(60);
        Node g = new Node(70);
        Node h = new Node(80);
        
        //Connecting the nodes
        a.left = b;
        a.right = c;
        b.left = d;
        d.left = g;
        c.left = e;
        c.right = f;
        f.left = h;
        
        preOT(a);
    }
}
