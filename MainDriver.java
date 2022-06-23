package com.advanced_java.collection_framework_in_java.maindriver_controller;

import com.advanced_java.collection_framework_in_java.treeset_crud_operation.TreeSetCrudOperation;

public class MainDriver
{
	static TreeSetCrudOperation treeSetCrudOperation = new TreeSetCrudOperation();
	public static void main(String[] args)
	{
		treeSetCrudOperation.createTheData();
		
		treeSetCrudOperation.readTheData();
		
		treeSetCrudOperation.updateTheData();
		
		treeSetCrudOperation.deleteTheData();
	}
}