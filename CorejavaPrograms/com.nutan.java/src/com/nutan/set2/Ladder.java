package com.nutan.set2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

public class Ladder 
{
	public static int laddrlenght(String beginword,String endword,List<String> wordlist)
	{
		Set<String>wordset=new HashSet<String>(wordlist);
		
		if(!wordset.contains(endword))
		{
			return 0;
		}
		
		Queue<String> queue=new LinkedList<String>();
		queue.add(beginword);
		
		int steps=1;
		
		while(!queue.isEmpty())
		{
			int size=queue.size();
			
			for(int i=0;i<size;i++)
			{
				String word = queue.poll();
				
				if(word.equals(endword))
				{
					return steps;
				}
				
				char[] chars=word.toCharArray();
				for(int j=0;j<chars.length;j++)
				{
					char originalchar=chars[j];
					for(char c='a';c<='z';c++)
					{
						if(c==originalchar)continue;
						
						chars[j]=c;
						String newword=new String(chars);
						
						if(wordset.contains(newword))
						{
							queue.add(newword);
							wordset.remove(newword);
						}
					}
					chars[j]=originalchar;
				}
			}
			steps++;
		}
		return 0;
	}
	public static void main(String[] args) 
	{
		String beginWord = "hit";                       // Given start word
        String endWord = "cog";                         // Given target word
        List<String> wordList = Arrays.asList(          // Given dictionary/list of allowed intermediate words
            "hot", "dot", "dog", "lot", "log", "cog"
        );

        int result = laddrlenght(beginWord, endWord, wordList); // Call the BFS solver
        System.out.println("Shortest transformation length: " + result); 

	}
	

}
