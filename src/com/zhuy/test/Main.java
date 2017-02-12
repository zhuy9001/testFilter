package com.zhuy.test;

public class Main {
	
	/**
	 * 先序遍历
	 * @param tree
	 */
	public static void preOrder(Tree tree){
		if(tree!=null){
			System.out.print("--"+tree.data);
			preOrder(tree.left);
			preOrder(tree.rigth);
		}
	}
	
	/**
	 * 中序遍历
	 * @param tree
	 */
	public static void inOrder(Tree tree){
		if(tree!=null){
			inOrder(tree.left);
			System.out.print("--"+tree.data);
			inOrder(tree.rigth);
		}
	}

	
	/**
	 * 后序遍历
	 * @param tree
	 */
	public static void postOrder(Tree tree){
		if(tree!=null){
			postOrder(tree.left);
			postOrder(tree.rigth);
			System.out.print("--"+tree.data);
		}
	}
	
	
	
	public static void main(String[] str){
		  int[] array = {12,76,35,22,16,48,90,46,9,40};
		  Tree root = new Tree(array[0]);   //创建二叉树
		  for(int i=1;i<array.length;i++){
		   root.addTree(array[i],root);       //向二叉树中插入数据
		  }
		  System.out.println("先根遍历：");
		  preOrder(root);
		  System.out.println();
		  System.out.println("中根遍历：");
		  inOrder(root);
		  System.out.println();
		  System.out.println("后根遍历：");
		  postOrder(root);
	}
}
