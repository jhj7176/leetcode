class Solution {
    public boolean isValid(String s) {
       
       Boolean boo = true;
		//String input = "{[[]()()[()]{}{}{()[]}]}";
        String input = s;
		StringBuilder sb1 = new StringBuilder();
        
		for (int i = 0; i < input.length(); i++) {
			String chara = String.valueOf(input.charAt(i));
			String lastChar = "";
			if(sb1.length()!=0) lastChar = String.valueOf(sb1.charAt(sb1.length()-1));
			sb1.append(chara);
           if (chara.equals("}")) {

				if (!lastChar.equals("{")) {
					boo = false;
					break;
				} else {
					sb1.delete(sb1.lastIndexOf("{}"), sb1.lastIndexOf("{}") + 2);

				}

			} else if (chara.equals(")")) {

				if (!lastChar.equals("(")) {
					boo = false;
					break;
				} else {
					sb1.delete(sb1.lastIndexOf("()"), sb1.lastIndexOf("()") + 2);

				}

			} else if (chara.equals("]")) {

				if (!lastChar.equals("[")) {
					boo = false;
					break;
				} else {
					sb1.delete(sb1.lastIndexOf("[]"), sb1.lastIndexOf("[]") + 2);

				}

			}

		}
        
		if(!sb1.toString().equals("")) boo = false;
        return boo;
    }
}