package com.kevll.blade;

import org.junit.Test;

import java.util.Stack;

/**
 * @author: kevin
 * @date: 2018/6/13
 * @description:
 */
public class Q5_BuildQueueWithStack {
    /**
     * 栈和队列 用两个栈实现队列
     * 用两个栈来实现一个队列，完成队列的Push和Pop操作。队列中的元素为int类型。
     */

    /**
     * 思路
     * 入队：将元素进栈A
     * 出队：判断栈B是否为空，如果为空，则将栈A中所有元素pop，并push进栈B，栈B出栈；
     * 如果不为空，栈B直接出栈。
     * <p>
     * 因为栈中的元素pop再push一次之后，顺序就正好颠倒了，最先加入的元素到了栈顶，此时pop就是先进先出了
     */
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    void push(int node) {
        stack1.push(node);
    }

    int pop() {
        if (!stack2.empty()) {
            return stack2.pop();
        } else {
            int size = stack1.size();
            for (int i = 0; i < size; i++) {
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }

    @Test
    public void test() {
        push(1);
        push(2);
        push(3);
        System.out.println(pop());
        System.out.println(pop());
        push(4);
        System.out.println(pop());
        push(5);
        System.out.println(pop());
        System.out.println(pop());
    }
}
