package leetCode.sharui;

import java.util.HashMap;
import java.util.Stack;

public class _020_有效的括号 {
	private static HashMap<Character, Character> map = new HashMap<Character, Character>();
	static {
		map.put('(', ')');
		map.put('[', ']');
		map.put('{', '}');
	}

	public boolean isValid(String s) {
		int length = s.length();
		Stack<Character> stack = new Stack<>();
		for (int i = 0; i < length; i++) {
			Character character = s.charAt(i);

			if (map.containsKey(character)) {
				stack.push(character);
			} else {
				if (stack.isEmpty()) {
					return false;
				}
				if (character != map.get(stack.pop())) {
					return false;
				}
			}
		}
		if (stack.isEmpty()) {
			return true;
		}
		return false;
	}
}
