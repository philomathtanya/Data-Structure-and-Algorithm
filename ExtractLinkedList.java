
class ExtractLinkedList
{

	static class Node
	{
		int data;
		Node link;
		Node(int d, Node l)
		{
			data=d;
			link=l;
		}
	}
	static Node start=null;
	static Node newstart=null;
	static void insert(int d)
	{
		Node ob=new Node(d,start);
		start=ob;
	}
	static void extract()
	{
		newstart=start.link;
		Node temp1=start;
		Node temp2=newstart;
		while(temp2!=null && temp2.link!=null)
		{
			temp1.link=temp1.link.link;
			temp2.link=temp2.link.link;
			temp1=temp1.link;
			temp2=temp2.link;
		}temp1.link=null;
	}
	static Node reverse(Node n)
	{
		Node prev=null;
		Node current=n;
		Node next=null;
		while(current!=null)
		{
			next=current.link;
			current.link=prev;
			prev=current;
			current=next;
		}
		n=prev;
		return n;
	}
	static void show()
	{
		Node temp=start;
		while(temp!=null)
		{
			System.out.print(temp.data+" ");
			temp=temp.link;
		}
	}
	static void add()
	{
		Node temp=start;
		while(temp.link!=null)
		{
			temp=temp.link;
		}
		temp.link=newstart;
	}
	public static void main(String args[])
	{
		insert(1);
		insert(2);
		insert(3);
		insert(4);
		insert(5);
		insert(6);
		extract();
		newstart=reverse(newstart);
		add();
		show();
	}
}