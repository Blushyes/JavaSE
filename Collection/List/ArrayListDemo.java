import java.util.ArrayList;
import java.util.List;

/**
 * 测试ArrayList
 *
 */
public class ArrayListDemo {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        //测试不使用泛型的ArrayList
        {
            List list = new ArrayList();
            System.out.println("测试不使用泛型的ArrayList:");

            //尾插一个内容
            System.out.print("尾插一个内容：");

            list.add(1);
            list.add("这是一个字符串");
            list.add(1.0f);

            System.out.println(list);

            //获取指定索引位置内容
            System.out.print("获取指定索引位置内容：");

            System.out.println(list.get(1));

            //是否含有某个元素
            System.out.print("是否含有某个元素：");

            System.out.println(list.contains(1.0f));

            //是否含有一个集合中的所有元素
            System.out.print("是否含有一个集合中的所有元素：");

            List judgeList1 = List.of(1, 2);
            List judgeList2 = List.of(1, "这是一个字符串");

            System.out.print(list.containsAll(judgeList1) + " ");
            System.out.println(list.containsAll(judgeList2));

            //判空
            System.out.print("判空：");

            System.out.println(list.isEmpty());

            //根据索引删除元素
            System.out.print("根据索引删除元素：");

            list.remove(0);

            System.out.println(list);

            //根据内容删除元素
            System.out.print("根据内容删除元素：");

            list.remove("这是一个字符串");

            System.out.println(list);

            //改变值
            System.out.print("改变值：");

            list.set(0, "改变后的值");

            System.out.println(list);

            //插入一个集合中的所有元素
            System.out.print("插入一个集合中的所有元素：");

            List inertList = List.of(1, "哈哈哈");
            list.addAll(inertList);

            System.out.println(list);

            //获取指定元素的索引
            System.out.print("获取指定元素的索引：");

            System.out.print(list.indexOf("哈哈哈") + " ");
            System.out.println(list.indexOf("嘿嘿嘿"));
            System.out.println();
        }

        //测试使用泛型的ArrayList
        {
            System.out.println("测试使用泛型的ArrayList:");
            List<Integer> list = new ArrayList<>();
            list.add(3);
            list.add(2);
            list.add(1);
            System.out.println(list);
            list.sort((a, b) -> a - b);
            System.out.println(list);
        }
    }
}