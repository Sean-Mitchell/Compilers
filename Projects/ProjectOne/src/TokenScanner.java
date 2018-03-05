package Starter;

import java.io.*;
import java.util.*;

public class TokenScanner {
	private static ArrayList<Token> validTokens = new ArrayList<>();
	private static boolean keepGoing = true;
	
	public static Token[] scanFile(String fileName) {
		if (fileName.equals("prog2.txt")) {
			System.out.println("fdasfdsafds");
		}
		Token[] returnArray;
		initializeValidTokens();
		
		File f = new File(fileName);

		
		
		FileReader fr = null;
		try {
			fr = new FileReader(f);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		ArrayList<Token> tokenList = new ArrayList<>();
		Token next = getNextToken(fr);
		while(keepGoing ){
			tokenList.add(next);
			next = getNextToken(fr);
		}

		returnArray = new Token[tokenList.size()];
		for (int i = 0; i < tokenList.size(); i++) {
			returnArray[i] = tokenList.get(i);
		}
		
		return returnArray;		
	}
	
	private static Token getNextToken(FileReader fr) {
		String partialToken = "";
		char tempChar = Character.MIN_VALUE;
		try {
			tempChar = (char)fr.read();
			
			//end of file check return dummy token
			if ((byte)tempChar == -1 ) {
				keepGoing = false;
				return new Token(-1, "", "");
			}
			
			
			partialToken = "" + tempChar;
			while (partialToken.trim().length() == 0) {// Whitespace check
				tempChar = (char)fr.read();
				if ((byte)tempChar == -1 ) {
					keepGoing = false;
					return new Token(-1, "", "");
				}
				partialToken = "" + tempChar;
			}
		
		Token[] possibleTokens = getPossibleTokens(partialToken);
		
		while (possibleTokens.length > 0) {
			for (int i = 0; i < possibleTokens.length; i++) {
				if (possibleTokens[i].value.equals(partialToken)) {
					if (partialToken.equals("/*")){
						//While the comments aren't over, keep reading
						while ( !partialToken.substring(partialToken.length() - 2, 
								partialToken.length()).equals("*/")) {
							partialToken += (char)fr.read();
						}
						return new Token(possibleTokens[i].type, possibleTokens[i].value, possibleTokens[i].token);
					} else if (partialToken.equals("//")) {
						while ((char)fr.read() != '\n');
						return new Token(possibleTokens[i].type, possibleTokens[i].value, possibleTokens[i].token);
					} else {
						return new Token(possibleTokens[i].type, possibleTokens[i].value, possibleTokens[i].token);
					}
					
				}
			}
			
			String next = "";
			
			try {
				next = "" + (char)fr.read();
			} catch (Exception e) {}
			
			if (next == null || next.trim().length() == 0 ) { 
				if (!validTokens.contains(40) || !validTokens.contains(41)){
					Token newToken = new Token(-1, "", "");
					try {
						Integer.parseInt(next);
						newToken = new Token(41, partialToken, "<TNumber>");
						validTokens.add(newToken);
						return newToken;
					} catch (Exception e) {
						if (!validTokens.contains(40)) {
							newToken = new Token(40, partialToken, "<TId>");
							validTokens.add(newToken);
							return newToken;
						}
					}
				}
			}

			partialToken = partialToken + next;
			possibleTokens = getPossibleTokens(partialToken);
		}
		} catch (Exception e) {

		}
		return new Token(-1, "", "");
	}
	
	private static Token[] getPossibleTokens(String partialToken) {
		Token[] returnArray;
		if (partialToken.length() == 0) {
			returnArray = new Token[validTokens.size()];
			for (int i = 0; i < validTokens.size(); i++) {
				returnArray[i] = validTokens.get(i);
			}
			return returnArray;
		}
		ArrayList<Token> possibleTokens = new ArrayList<>();
		for (int i = 0; i < validTokens.size(); i++) {
			if (validTokens.get(i).value.length() < partialToken.length()) {
				continue;
			}
			if (validTokens.get(i).value.substring(0, partialToken.length()).equals(partialToken)) {
				possibleTokens.add(validTokens.get(i));
			}
		}
		
		returnArray = new Token[possibleTokens.size()];
		for (int i = 0; i < possibleTokens.size(); i++) {
			returnArray[i] = possibleTokens.get(i);
		}
		
		return returnArray;
	}
	
	private static void initializeValidTokens() {
		validTokens.add(new Token(0, "class", "<TClass>"));
		validTokens.add(new Token(1, "public", "<TPublic>"));
		validTokens.add(new Token(2, "static", "<TStatic>"));
		validTokens.add(new Token(3, "void", "<TVoid>"));
		validTokens.add(new Token(4, "main", "<TMain>"));
		validTokens.add(new Token(5, "String", "<TString>"));
		validTokens.add(new Token(6, "{", "<TLcurly>"));
		validTokens.add(new Token(7, "}", "<TRcurly>"));
		validTokens.add(new Token(8, "[", "<TLbracket>"));
		validTokens.add(new Token(9, "]", "<TRbracket>"));
		validTokens.add(new Token(10, "(", "<TLparen>"));
		validTokens.add(new Token(11, ")", "<TRparen>"));
		validTokens.add(new Token(12, "extends", "<TExtends>"));
		validTokens.add(new Token(14, ";", "<TSemicolon>"));
		validTokens.add(new Token(15, "return", "<TReturn>"));
		validTokens.add(new Token(16, "int", "<TInt>"));
		validTokens.add(new Token(17, "boolean", "<TBool>"));
		validTokens.add(new Token(18, "if", "<TIf>"));
		validTokens.add(new Token(19, "else", "<TElse>"));
		validTokens.add(new Token(20, "while", "<TWhile>"));
		validTokens.add(new Token(21, "System.out.println", "<TPrint>"));
		validTokens.add(new Token(22, "=", "<TEqual>"));
		validTokens.add(new Token(23, "&&", "<TAnd>"));
		validTokens.add(new Token(24, "<", "<TLt>"));
		validTokens.add(new Token(25, "+", "<TPlus>"));
		validTokens.add(new Token(26, "-", "<TMinus>"));
		validTokens.add(new Token(27, "*", "<TTimes>"));
		validTokens.add(new Token(28, ".", "<TPeriod>"));
		validTokens.add(new Token(29, "length", "<TLength>"));
		validTokens.add(new Token(30, ",", "<TComma>"));
		validTokens.add(new Token(31, "true", "<TTrue>"));
		validTokens.add(new Token(32, "false", "<TFalse>"));
		validTokens.add(new Token(33, "this", "<TThis>"));
		validTokens.add(new Token(34, "new", "<TNew>"));
		validTokens.add(new Token(35, "!", "<TExc>"));
		validTokens.add(new Token(36, "//", "<TComments>"));
		validTokens.add(new Token(37, "/*", "<TComments>"));
		validTokens.add(new Token(38, "*/", ""));
		validTokens.add(new Token(39, "<TInt><TPeriod><TInt>", "<TReal>"));
	}
}