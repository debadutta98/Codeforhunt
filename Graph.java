import java.util.*;
//Graph Representation algorithim in matrix
//and BFS algorithim
class Node
{
    int data;
    Node next;
    Node(int data)
    {
        this.data=data;
        this.next=null;
    }
}
class Head
{
    int val;
    Head down;
    Node left;
    Head(int val)
    {
        this.val=val;
        this.down=null;
        this.left=null;
    }
}
public class Graph {
    static Head head=null;
    static Head tail=null;
    private static Queue<Head> queue;
    private static Stack<Head> stack;
    public static void DepthFirstSearch(int size)
    {
        boolean bool[]=new boolean[size];
    for(int i=0;i<size;i++)
    {
        bool[i]=false;
    }
    Head temp=head;
    stack.push(temp);
    System.out.println(temp.val);
    bool[temp.val]=true;
    Head arr[]=new Head[size];
    int k=0;
   while(temp!=null)
    {
        arr[k]=temp;
        temp=temp.down;
        k++;
    }
    boolean t=true;
while(!stack.isEmpty())
{
    Head temp1=stack.peek();
    
    Node temp2=temp1.left;
    while(temp2!=null)
    {
        if(bool[temp2.data]==false)
        {
            stack.push(arr[temp2.data]);
            System.out.println(arr[temp2.data].val);
            t=false;
            bool[temp2.data]=true;
            break;
        }
        temp2=temp2.next;
    }
    if(t)
    {
        stack.pop();
    }
    t=true;
}
    }
    public static void BreathFirstSearch(int size)
    {
    boolean bool[]=new boolean[size];
    for(int i=0;i<size;i++)
    {
        bool[i]=false;
    }
    Head temp=head;
    queue.add(temp);
    bool[temp.val]=true;
    Head arr[]=new Head[size];
    int k=0;
   while(temp!=null)
    {
        arr[k]=temp;
        temp=temp.down;
        k++;
    }
    while(!queue.isEmpty())
    {
    Head  temp1=queue.remove();
    System.out.println(temp1.val);
    Node temp2=temp1.left;
    while(temp2!=null)
    {
        if(bool[temp2.data]==false)
        {
queue.add(arr[temp2.data]);
bool[temp2.data]=true;
        }
        temp2=temp2.next;
    }
    }
    }
    public static void printGraph()
    {
        Head temp=head;
        while(temp!=null)
        {
            Node temp1=temp.left;
            System.out.print(temp.val+"->");
            while(temp1!=null)
            {
              System.out.print(temp1.data+"-> ");
              temp1=temp1.next;  
            }
            System.out.print("NULL");
            System.out.println();
            System.out.println("|");
            temp=temp.down;
        }
        System.out.println("NULL");
    }
    public static Node addEdges(int arr[],Node start)
    {
        Node tail=null;
        for(int i=0;i<arr.length;i++)
        {
            if(start==null)
            {
                start=new Node(arr[i]);
                tail=start;
            }
            else
            {
                tail.next=new Node(arr[i]);
                tail=tail.next;
            }
        }
        return start;
    }
    public static void main(String[] args) {
System.out.println("Enter the number of vertices");
int size;
Scanner sc=new Scanner(System.in);
size=sc.nextInt();
for(int i=0;i<size;i++)
{
   System.out.println("Enter the vertices that are connected to vartex "+i);
   int n;
   System.out.println("Enter the number of edges");
   n=sc.nextInt();
   int arr[]=new int[n];
   for(int j=0;j<n;j++)
   {
        arr[j]=sc.nextInt();
   }
   if(n>0)
   {
       Node start = null;
      if(head==null)
      {
          head=new Head(i);
          head.left=addEdges(arr,start);
         // start=null;
          tail=head;
      }  
      else
      {
          tail.down=new Head(i);
          tail.down.left=addEdges(arr,start);
          tail=tail.down;
         // start=null;
      }
   }
   else
   {
        if(head==null)
        {
head=new Head(i);
tail=head;
        }
        else{
tail.down=new Head(i);
tail=tail.down;
        }
   }

}
printGraph();
System.out.println("Breadth First Search:");
queue = new LinkedList<>();
BreathFirstSearch(size);
stack=new Stack<>();
System.out.println("Depth first search:");
DepthFirstSearch(size);
}
}
