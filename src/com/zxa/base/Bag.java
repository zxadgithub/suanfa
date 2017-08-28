package com.zxa.base;

import java.util.Iterator;

/**
 * Created by 张新安 on 2017/8/28.
 */

public class Bag<Item> implements Iterable<Item> {
    
    private Node first;
    
    private class Node {
        Item item;
        Node next;
    }
    
    public void  add(Item item){
        Node oldNode = first;
        first = new Node();
        first.item = item;
        oldNode.next = first;
    }
    
    
    
    @Override
    public Iterator<Item> iterator() {
        return new ListIterator();
    }
    
    private class ListIterator implements Iterator<Item>{
        private Node current = first;
        
        @Override
        public boolean hasNext() {
            return current != null;
        }
    
        @Override
        public Item next() {
            Item item = current.item;
            current = current.next;
            return item;
        }
    }
}
