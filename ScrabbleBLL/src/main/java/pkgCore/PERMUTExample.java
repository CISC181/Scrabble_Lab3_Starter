package pkgCore;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

import com.google.common.collect.Collections2;

public class PERMUTExample {

	public static void main(String[] args)
	{
		ArrayList<String> combin = COMBINExample.Combin("ABCDE");
		
		ArrayList<String> words = new ArrayList<String>();
		
		for (String strPossibleWord : combin)
		{
			ArrayList<Character> arrLetters = new ArrayList<Character>();

			for (int i = 0; i < strPossibleWord.length(); i++) {
				char c = strPossibleWord.charAt(i);
				arrLetters.add(c);
			}
			
			Collection<List<Character>> ch = Collections2.orderedPermutations(arrLetters);
			for (final List<Character> p : ch) {
				{
					String strBuild = "";
					for (Character chrs : p) {
						strBuild = strBuild + chrs;
					}
					words.add(strBuild);
				}
			}
		}
		
		for (String w: words)
		{
			System.out.println(w);
		}
		
		
		
	}
	
}
