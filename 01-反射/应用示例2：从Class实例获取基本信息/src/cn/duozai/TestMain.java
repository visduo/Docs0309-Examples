package cn.duozai;

import java.lang.reflect.Modifier;

/**
 * 测试类
 *
 * @author 多仔ヾ
 */
public class TestMain {

    public static void main(String[] args) throws ClassNotFoundException {
        // 获取Person用户类的Class实例
        Class clz = Class.forName("cn.duozai.entity.Person");

        // 获取类的全名
        System.out.println("类的名称：" + clz.getName());

        // 获取类的简称
        System.out.println("类的简称：" + clz.getSimpleName());

        // 获取类所在的包
        Package pkg = clz.getPackage();
        System.out.println("类所在的包：" + pkg.getName());

        // 获取父类
        Class superClz = clz.getSuperclass();
        System.out.println("父类的名称：" + superClz.getName());

        // 获取类实现的所有接口
        Class[] interfaces = clz.getInterfaces();
        for (Class anInterface : interfaces) {
            System.out.println("类实现的接口：" + anInterface.getName());
        }

        // 获取类的修饰符
        System.out.println("类的修饰符（解码前）：" + clz.getModifiers());
        System.out.println("类的修饰符（解码后）：" + Modifier.toString(clz.getModifiers()));
    }

}
