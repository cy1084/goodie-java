package chap13;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/*
 * Stack : LIFO(Last in First out)
 *   Stack 클래스 : Vector 하위 클래스
 *   주요 메서드
 *     push(Object) : 객체를 Stack에 추가
 *     Object pop() : Stack에 저장된 객체를 꺼냄. 제거
 *     Object peek() : Stack에 저장된 객체를 꺼냄. 조회 
 *
 * Queue : FIFO(First in First out)
 *   Queue 인터페이스 : LinkedList가 구현 클래스임.    
 *   주요 메서드
 *     offer(Object) : 객체를 Queue에 추가
 *     Object poll() : Queue에 저장된 객체를 꺼냄. 제거
 *     Object peek() : Queue에 저장된 객체를 꺼냄. 조회 
 */

public class StackQueueEx1 {
	public static void main(String[] args) {
	  String[] subject = {"Java","SQL","JSP","HTML","CSS","JavaScript","Spring"};
	  Stack<String> stack = new Stack<>();
	  Queue<String> queue = new LinkedList<>();
	  for(String s : subject) {
		  stack.push(s);  //객체 추가
		  queue.offer(s); //객체 추가
	  }
	  System.out.println(stack);
	  System.out.println(queue);
	  System.out.println("stack 에 저장된 요수의 갯수:"+stack.size());
	  System.out.println("queue 에 저장된 요수의 갯수:"+queue.size());
	  System.out.println("stack 의 조회 대상 객체:" + stack.peek()); //Spring
	  System.out.println("stack 에 저장된 요수의 갯수:"+stack.size()); //7
	  System.out.println("stack 의 조회 대상 객체 제거:" + stack.pop()); //Spring
	  System.out.println("stack 에 저장된 요수의 갯수:"+stack.size()); //6
	  System.out.println("stack 의 조회 대상 객체 제거:" + stack.pop()); //JavaScript
	  System.out.println("stack 에 저장된 요수의 갯수:"+stack.size()); //5
	  System.out.println("queue 의 조회 대상 객체:" + queue.peek()); //Java
	  System.out.println("queue 에 저장된 요수의 갯수:"+queue.size()); //7
	  System.out.println("queue 의 조회 대상 객체 제거:" + queue.poll()); //Java
	  System.out.println("queue 에 저장된 요수의 갯수:"+queue.size()); //6
	  System.out.println("queue 의 조회 대상 객체 제거:" + queue.poll()); //SQL
	  System.out.println("queue 에 저장된 요수의 갯수:"+queue.size()); //5
		
	}

}
