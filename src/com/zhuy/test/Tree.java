package com.zhuy.test;

public class Tree {

	int data;
	Tree left;

	Tree rigth;

	public Tree() {

	}

	public Tree(int dat, Tree left, Tree rigth) {
		this.left = left;
		this.rigth = rigth;
		this.data = dat;

	}

	public Tree(int data){
		this.data=data;
		this.rigth=null;
		this.left=null;
	}
	
	

	public  void addTree(int data,Tree root){
		if(data>root.data){
			
			if(root.rigth==null){
				root.rigth=new Tree(data);
			}else{
				addTree(data, root.rigth);
			}
			
		}else{
			if(root.left==null){
				root.left=new Tree(data);
			}else{
				addTree(data,root.left);
			}
			
		}
		
	}
}
