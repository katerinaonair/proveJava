package demo;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class GenericList<T> {

	
	private class Node<T>
	{
		private T data;
		private Node<T> link;
		
		public Node()
		{
			data = null;
			link =null;
		}
		
		public Node(T newData, Node<T> linkVlue)
		{
			data = newData;
			link = linkVlue;
		}
	}
	
	private Node<T> head;
	
	public GenericList()
	{
		head = null;
	}
	
	public void addToStart(T itemData)
	{
		head = new Node<T> (itemData, head);
	}
	
	public void outputList()
	{
		Node<T> position = head;
		while(position != null)
		{
			System.out.println(position.data);
			position = position.link;
		}
	}
	
	public int size()
	{
		int count = 0;
		Node<T> position = head;
		while(position != null)
		{
			count++;
			position = position.link;
		}
		return count;
	}
	
	
	
	
}

