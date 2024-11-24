# Cách sử Collections.sort() trong Java

```java
Collections.sort(students, new Comparator<Student>() {
    @Override
    public int compare(Student `o1`, Student `o2`) {
        // TODO Auto-generated method stub
        if (`o1`.getHeight() > `o2`.getHeight())
            return 1;
        else 
            return -1;
    }
});
```
`o1` và `o2` đại diện cho 2 phần tử cần so sánh. `o1` đứng trước `o2` trong mảng.

Compare trả về số nguyên dương nếu muốn đổi chỗ `o1` và `o2`, số nguyên âm nếu không muốn đổi chỗ `o1` và `o2`.

Ví dụ muốn sắp xếp theo chiều cao tăng dần.<br>
Tăng dần theo chiều cao nghĩa là o1.getHeight() < o2.getHeight() thì mảng sẽ được sắp xếp theo chiều tăng dần. Nếu o1.getHeight() > o2.getHeight() thì cần đổi chỗ 2 phần tử.

```java

Collections.sort(students, new Comparator<Student>() {
    @Override
    public int compare(Student `o1`, Student `o2`) {
        // TODO Auto-generated method stub
        if (`o1`.getHeight() > `o2`.getHeight())
            return 1;
        else 
            return -1;
    }
});

```


