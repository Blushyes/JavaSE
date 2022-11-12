# Collection

![Collection](Collection.png)

# List

List类似python的列表，只不过方法不一样，比如python的list利用append()进行元素添加，而List利用add()进行元素添加。

具体方法看[官方帮助文档](https://docs.oracle.com/en/java/javase/17/docs/api/index.html)。

## ArrayList的扩容机制

+ 无参构造时容量未进行初始化，第一次扩容直接变为10个元素，后续每次扩容将容量扩为1.5倍

+ 指定容量构造时，初始为指定容量，后续若所需容量大于数组容量，则扩容1.5倍

## Vector和ArrayList的区别

+ ArrayList是线程不安全的，Vector 是线程安全的——**ArrayList效率更高**。
+ ArrayList 使用默认构造器创建对象时是在调用 add() 方法时对 ArrayList 的默认容量进行初始化的，Vector 在调用构造器时就对容量进行了初始化
+ ArrayList 存储数据的 Object 数组使用了 transient 关键字（序列化时忽略被transient修饰的属性），Vector 的 Object 数组没有
+ ArrayList 和 Vector 的扩容机制不同（Vector为2倍扩容）
+ Vector 可以设置增长因子，而 ArrayList 不可以

# Set

Set中不允许有重复的元素，`HashSet`是无序的，`LinkedHashSet`可以保证**元素添加的顺序**，`TreeSet`可以保证**元素自然的顺序**。

## HashSet

HashSet中的元素是**无序**的，它底层是用`HashMap`实现的，大概就是用一个`HashMap<val, PRESENT>`实现，其中`PRESENT`为一个常量`Object`，占位的。

## LInkedHashSet

继承了`HashSet`，**底层利用双向链表保证对添加顺序**。