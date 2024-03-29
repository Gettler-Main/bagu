package com.gettler;

/**
 * 静态方法为什么不能调用非静态成员?
 * <p>
 * 静态方法是属于类的，在类加载的时候就会分配内存，可以通过类名直接访问。
 * 非静态成员属于实例对象，只有在对象实例化之后才存在，需要通过类的实例对象去访问。
 * <p>
 * 在类的非静态成员不存在的时候静态成员就已经存在了，此时调用在内存中还不存在的非静态成员，属于非法操作。
 */
public class StaticStudy {
    int a = 1;
    static String s = "Static";

    public static void main(String[] args) {
        // System.out.println(a);
        System.out.println(s);
    }
}