package chapter3.adt;

import java.util.LinkedList;

/**
 * 使用LinkedList实现的双端队列
 * @author wenl
 *
 * add by simon
 *
 * 循环双向链表数据结构---LinkedList 来实现双端队列
 *
 * @param <AnyType>
 */
public class MyDeque<AnyType> {

	/**
	 * 定义双向链表 items
	 */
	private LinkedList<AnyType> items;

	public MyDeque() {
		items=new LinkedList<AnyType>();
	}

	/**
	 * @TODO 思考：拓展下插入元素在指定位置
	 * Inserts the specified element at the beginning of this list.
	 * @param x
	 */
	public void push(AnyType x){
		items.addFirst(x);
	}

	/**
	 * @TODO 思考：拓展下删除元素在指定位置
	 *  Removes and returns the first element from this list.
	 *
	 * @return
	 */
	public AnyType pop(){
		return items.removeFirst();
	}

	/**
	 *
	 * Appends the specified element to the end of this list.
	 *
	 * @param x
	 */
	public void inject(AnyType x){
		items.addLast(x);
	}

	/**
	 * Removes and returns the last element from this list.
	 *
	 * @return
	 */
	public AnyType eject(){
		return items.removeLast();
	}
}
