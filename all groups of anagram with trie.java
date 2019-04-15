import java.util.*; 

class Trie {
	boolean end;
	Trie next[];
	List<Integer> ls;
	
	Trie()
	{
		end=false;
		next=new Trie[26];
		ls=new ArrayList<Integer>();
	}
	
	static void insert(Trie root,String str,int index)
	{
		int i,ind;
		for(i=0;i<str.length();i++)
		{
			ind=str.charAt(i)-97;
			if(root.next[ind]!=null)
			{
				root=root.next[ind];
			}
			else
			{
				root.next[ind]=new Trie();
				root=root.next[ind];
			}
		}
		
		root.end=true;
		root.ls.add(index);
	}
	
	static void traverse(Trie root,Set<Set<String> > res,String arr[])
	{
		if(root.end)
		{
			Set<String> st=new HashSet<String>();
			List<Integer> ls=root.ls;
			for(int i=0;i<ls.size();i++)
				st.add(arr[ls.get(i)]);
			
			res.add(st);
			return ;
		}
		
		for(int i=0;i<26;i++)
		{
			if(root.next[i]!=null)
				traverse(root.next[i],res,arr);
		}
	}
}

class Util implements Comparable<Util>
{
	String str;
	int ind;
	
	@Override
	public int compareTo(Util o) {
		return this.str.compareTo(o.str);
	}	
}

class Solution 
{
	static Set<Set<String> > allGroupsOfAnagramUsingTrie(String arr[])
	{
		int n,i;
		n=arr.length;
		
		String temp[]=new String[n];
		char ch[];
		for(i=0;i<n;i++)
		{
			ch=arr[i].toCharArray();
			Arrays.sort(ch);
			temp[i]=new String(ch);
		}
		
		//root of trie
		Trie root=new Trie();
		
		//inserting sorted string in trie 
		for(i=0;i<n;i++)
			Trie.insert(root,temp[i],i);
		
		Set<Set<String> > st;
		Trie trie;
		
		//now traversing the trie
		Set<Set<String> > res=new HashSet<Set<String> >();
		Trie.traverse(root,res,arr);
		
		return res;
	}
	
	static Set<Set<String> > allGroupsOfAnagramUsingHashing(String arr[])
	{
		int n,i;
		n=arr.length;
		String temp[]=new String[n];
		char ch[];
		for(i=0;i<n;i++)
		{
			ch=arr[i].toCharArray();
			Arrays.sort(ch);
			temp[i]=new String(ch);
		}
		
		Map<String, List<Integer> > mp=new HashMap<String, List<Integer> >();
		for(i=0;i<n;i++)
		{
			if(mp.containsKey(temp[i]))
			{
				List<Integer> ls=mp.get(temp[i]);
				ls.add(i);
				mp.put(temp[i],ls);
			}
			else
			{
				List<Integer> ls=new ArrayList<Integer>();
				ls.add(i);
				mp.put(temp[i],ls);
			}
		}
		
		Set<Set<String> > res=new HashSet<Set<String> >();
		for(String key:mp.keySet())
		{
			List<Integer> ls=mp.get(key);
			Set<String> st=new HashSet<String>();
			for(i=0;i<ls.size();i++)
			{
				st.add(arr[ls.get(i)]);
			}
			
			res.add(st);
		}
		
		return res;
	}
	
	static Set<Set<String> > allGroupsOfAnagramUsingOnlySorting(String arr[])
	{
		int n,i,j;
		n=arr.length;
		Util temp[]=new Util[n];
		
		char ch[];
		for(i=0;i<n;i++)
		{
			ch=arr[i].toCharArray();
			Arrays.sort(ch);
			
			temp[i]=new Util();
			temp[i].str=new String(ch);
			temp[i].ind=i;
		}
		
		Arrays.sort(temp);
		
		Set<Set<String> > res=new HashSet<Set<String> >();
		i=j=0;
		
		String str;
		while(i<n && j<n)
		{ 
			str=temp[i].str;
			Set<String> st=new HashSet<String>();
			while(j<n && str.compareTo(temp[j].str)==0)
			{
				st.add(arr[temp[j].ind]);
				j++;
			}
			
			res.add(st);
			i=j;
		}
		
		return res;
	}
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n,i;
		n=sc.nextInt();
		String arr[]=new String[n];
		
		for(i=0;i<n;i++)
			arr[i]=sc.next();
		
		Set<Set<String> > st=allGroupsOfAnagramUsingTrie(arr);
		System.out.println(st);
		
		Set<Set<String> > st1=allGroupsOfAnagramUsingHashing(arr);
		System.out.println(st1);
		
		Set<Set<String> > st2=allGroupsOfAnagramUsingOnlySorting(arr);
		System.out.println(st2);
		
		sc.close();
	}
} 
