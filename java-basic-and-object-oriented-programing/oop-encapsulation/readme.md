<div align="center">

# Tính đóng gói trong lập trình hướng đối tượng
</div>

Tạo package **pA** chứa 2 class **A** và **B**, tạo  package **pB** chứa 1 class **C** kế thừa đối tượng **A**

### Ví dụ 1
Tạo một thuộc tính int a trong class **A** mà không cho phép truy cập trực tiếp tự bên ngoài class.

<details>
<summary> <strong>🟢 Bài giải mẫu 📚</strong></summary>

Để giới hạn phạm vi sử dụng chỉ dùng trong một class chúng ta sẽ sử dụng **private**

- A.java

```Java
package pA;

public class A {
	private int a;
}

```

</details>
<br>

### Ví dụ 2
Tiếp tục tạo thêm hàm **inc()** có thể tăng giá trị của **a** thêm 1 đơn vị trong class **A**, hàm này chỉ dùng được trong cùng một **package**

<details>
<summary> <strong>🟢 Bài giải mẫu 📚</strong></summary>

Để sử dụng được trong cùng một package chúng ta sẽ sử dụng **default**

Như thế thì hàm **inc()** chỉ được dùng trong các class của package **pA**

- A.java

```Java
package pA;

public class A {
	private int a;
	
	void inc() {
		this.a++;
	}
}

```

</details>
<br>

### Ví dụ 3
Tiếp tục tạo thêm hàm **sqr()** có thể trả về giátrị của **a^2** class **A**, hàm này chỉ dùng được trong cùng một **package** và dùng trong các class **C** (supclass)

<details>
<summary> <strong>🟢 Bài giải mẫu 📚</strong></summary>

Để sử dụng được trong cùng một package và dùng được trong các subclass chúng ta sẽ sử dụng **protected**

Như thế thì hàm **sqr()** chỉ được dùng trong các class của package **pA** và các lớp con của class **A**

- A.java

```Java
package pA;

public class A {
	private int a;
	
	void inc() {
		this.a++;
	}
	
	protected int sqr() {
		return a * a;
	}
}

```

Lúc này hàm sqr() có thể được dùng cùng package và trong các lớp con của class **A**.

- B.java

```java
package pA;

public class B {
	public B() {
		A a = new A();
		a.sqr();
	}
}

```

- C.java

```java
package pB;

import pA.A;

public class C extends A{
	public C() {
		System.out.println(sqr());
	}
}

```

</details>
<br>

### Ví dụ 4
Tiếp tục tạo thêm hàm **setA()** và **getA()** có thể thảy đổi và trả về giá trị của **a** trong class **A**, hàm này chỉ dùng được trong cả project

<details>
<summary> <strong>🟢 Bài giải mẫu 📚</strong></summary>

Để giới hạn phạm vi sử dụng trong cả project chúng ta sẽ sử dụng **public**

- A.java

```Java
package pA;

public class A {
	private int a;
	
	void inc() {
		this.a++;
	}
	
	protected int sqr() {
		return a * a;
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}
}
```

</details>
<br>