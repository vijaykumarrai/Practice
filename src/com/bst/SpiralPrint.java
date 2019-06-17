/*package com.bst;

class Node {
	int data;
	 Node left;
	struct Node right;

	Node(int x) {
		data = x;
		left = right = NULL;
	}
};

public class SpiralPrint {

	void lotrav(Node *root,int level,int direction)
	{
	    if(root==NULL) return;
	    if(level==1) cout<<root->data<<" ";
	    else
	    {
	        if(direction==0)
	        {
	            lotrav(root->left,level-1,direction);
	            lotrav(root->right,level-1,direction);
	        }
	        else
	        {
	            lotrav(root->right,level-1,direction);
	            lotrav(root->left,level-1,direction);
	        }
	            
	        
	    }
	} https://www.geeksforgeeks.org/must-do-coding-questions-for-companies-like-amazon-microsoft-adobe/#stack

	int height(Node *root)
	{
	    if(root==NULL) return 0;
	    int lh=height(root->left);
	    int rh=height(root->right);
	    return (max(lh,rh)+1);
	}

	void printutil(Node *root)
	{
	    int ht=height(root);
	    int i;
	    for(i=1;i<=ht;i++)
	    {
	        lotrav(root,i,i%2);
	    }
	}

	void printSpiral(Node *root)
	{
	    printutil(root);
	     //Your code here
	}
}
*/