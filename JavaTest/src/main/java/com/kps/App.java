package com.kps;

import com.kps.javatest.abstracttest.AbstractChild;
import com.kps.javatest.implementstest.ImplementChild;
import com.kps.javatest.implementstest.ImplementParent;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        AbstractChild abstractChild = new AbstractChild();
        abstractChild.occupation();

        ImplementParent implementParent = new ImplementChild();
        implementParent.defaultMethod();
        implementParent.sleep("张三");
        //静态方法通过接口本身调用
        //Java中接口的静态方法只能通过接口本身来调用，而不能通过实现了该接口的类或对象来调用。
        ImplementParent.staticMethod();
    }
}
