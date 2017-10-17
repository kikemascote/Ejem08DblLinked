/*
 * Copyright (c) 2017. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu. no lo copie no sea cabron!
 */

package node;

public class node<T> {

        private T value = null;
        private node <T> next = null;
        private node <T> back  = null;
        private long index = 0;



        public node()
        {
            this.value= null;
        }
        public long getIndex()
        {
            return index;
        }
        public long setIndex()
        {
            return index;
        }

        public node (T value)
        {
            this.value  = value;
        }

        public T getValue() {
            return value;
        }


        public void setValue(T value) {
            this.value = value;
        }


        public node<T> getNext() {
            return next;
        }


        public void setNext(node<T> next) {
            this.next = next;
        }


        public node<T> getBack() {
            return back;
        }


        public void setBack(node<T> back) {
            this.back = back;
        }

        public String toString()
        {
            return super.toString();
        }

    }
