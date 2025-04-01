package test1_real;

import week03.LinkedListStack;

public class MatchingSymbol {
  // O(N)
  public boolean isBalanced(String symbols) {
    LinkedListStack<Character> stack = new LinkedListStack<>();
    for (int i = 0; i < symbols.length(); i++) {
      char current = symbols.charAt(i);
      if (current == '(' || current == '{' || current == '[') {
        stack.push(current);
      } else {
        // the current character is a closing symbol
        // check if the stack is empty, if so, return false
        if (stack.isEmpty()) {
          return false;
        }
        // pop the top of the stack and check if it matches the current symbol
        char top = stack.peek();
        stack.pop();
        if ((current == ')' && top != '(') ||
            (current == '}' && top != '{') ||
            (current == ']' && top != '[')) {
          return false;
        }
      }
    }
    // check if the stack is empty, if so, return true
    return stack.isEmpty();
  }

  // O(N)
  public int countTop(String symbols) {
    // when the stack is empty and a push occurs, there is a new top-level symbol
    // no need to check for balancedness, as assumed
    int top = 0;
    LinkedListStack<Character> stack = new LinkedListStack<>();
    for (int i = 0; i < symbols.length(); i++) {
      char current = symbols.charAt(i);
      if (current == '(' || current == '{' || current == '[') {
        if (stack.isEmpty()) {
          top++;
        }
        stack.push(current);
      } else {
        stack.pop();
      }
    }
    return top;
  }

  public static void main(String[] args) {
    MatchingSymbol program = new MatchingSymbol();
    System.out.println(program.isBalanced("(){}[]")); // true
    System.out.println(program.isBalanced("{{}}[]")); // true
    System.out.println(program.isBalanced("{{}]")); // false
    System.out.println(program.countTop("[]{}")); // 2
    System.out.println(program.countTop("[{{{}}}(())]")); // 1
    System.out.println(program.countTop("[[]](){}{{{}}}")); // 1
  }
}
