<div align="center">

# Bài tập nâng cao
</div>

### Ví dụ 1: Số lương số không cuối cùng

Viết phương thức in số lượng chữ số **0** cuối cùng của **n!** <br>*(1 ≤ n ≤ 10^18)*.

<details>
<summary> <strong>📝Test case 🧪</strong></summary>

#### Testcase 1:

|Input| Output|
|-----|:-----:|
|5| 1|

#### Testcase 2:

|Input| Output|
|-----|:-----:|
|12| 2|

#### Testcase 3:

|Input| Output|
|-----|:-----:|
|17| 3|

#### Testcase 4:

|Input| Output|
|-----|:-----:|
|26| 6|

#### Testcase 5:

|Input| Output|
|-----|:-----:|
|48| 10|

#### Testcase 6:

|Input| Output|
|-----|:-----:|
|236| 57|

#### Testcase 7:

|Input| Output|
|-----|:-----:|
|74823| 18700|

#### Testcase 8:

|Input| Output|
|-----|:-----:|
|736283948372635| 184070987093150|

#### Testcase 9:

|Input| Output|
|-----|:-----:|
|19283746253648293| 4820936563412061|

#### Testcase 10:

|Input| Output|
|-----|:-----:|
|11111111111111111| 2777777777777765|

#### Testcase 11:

|Input| Output|
|-----|:-----:|
|999999999999999999| 249999999999999977|

#### Testcase 12:

|Input| Output|
|-----|:-----:|
|82739402938472634| 20684850734618145|

#### Testcase 13:

|Input| Output|
|-----|:-----:|
|27122712271227129| 6780678067806772|

#### Testcase 14:

|Input| Output|
|-----|:-----:|
|42763948273847263| 10690987068461806|

#### Testcase 15:

|Input| Output|
|-----|:-----:|
|1| 0|

</details>
<br>

<details>
<summary> <strong>🟢 Bài giải mẫu 📚</strong></summary>

Chưa có bài giải.<br> Nếu cần thiết có thể liên hệ facebook [Phan Đức Hải](https://www.facebook.com/chiatayde)

</details>
<br>

### Ví dụ 2: dịch số

Cho một số nguyên **N** *(1 ≤ n ≤ 10^1000)*.<br> Hãy in ra cách đọc tiếng Việt của số tự nhiên đó.

<details>
<summary> <strong>📝Test case 🧪</strong></summary>

#### Testcase 1:

|Input| Output|
|-----|:-----:|
|5	| Năm|

#### Testcase 2:

|Input| Output|
|-----|:-----:|
|12| Mười hai |

#### Testcase 3:

|Input| Output|
|-----|:-----:|
|27| Hai mươi bảy |

#### Testcase 4:

|Input| Output|
|-----|:-----:|
|123| Một trăm hai mươi ba |

#### Testcase 5:

|Input| Output|
|-----|:-----:|
|9302| Chín ngàn ba trăm lẻ hai |

#### Testcase 6:

|Input| Output|
|-----|:-----:|
|2938473| Hai triệu chín trăm ba mươi tám ngàn bốn trăm bảy mươi ba |

#### Testcase 7:

|Input| Output|
|-----|:-----:|
|938473648| Chín trăm ba mươi tám triệu bốn trăm bảy mươi ba ngàn sáu trăm bốn mươi tám |

#### Testcase 8:

|Input| Output|
|-----|:-----:|
|736283948372635| Bảy trăm ba mươi sáu ngàn tỷ hai trăm tám mươi ba tỷ chín trăm bốn mươi tám triệu ba trăm bảy mươi hai ngàn sáu trăm ba mươi năm |

#### Testcase 9:

|Input| Output|
|-----|:-----:|
|346873683658343645747| Ba trăm bốn mươi sáu tỷ tỷ tám trăm bảy mươi ba triệu tỷ sáu trăm tám mươi ba ngàn tỷ sáu trăm năm mươi tám tỷ ba trăm bốn mươi ba triệu sáu trăm bốn mươi năm ngàn bảy trăm bốn mươi bảy |

#### Testcase 10:

|Input| Output|
|-----|:-----:|
|2222222222222222222222222<br>2222222222222222222222222<br>2222222222222222222222222<br>2222222222222222222222222<br>2222222222222222222222222<br>2222222222| Hai trăm hai mươi hai triệu tỷ tỷ tỷ tỷ tỷ tỷ tỷ tỷ tỷ tỷ tỷ tỷ tỷ tỷ hai trăm hai mươi hai ngàn tỷ tỷ tỷ tỷ tỷ tỷ tỷ tỷ tỷ tỷ tỷ tỷ tỷ tỷ hai trăm hai mươi hai tỷ tỷ tỷ tỷ tỷ tỷ tỷ tỷ tỷ tỷ tỷ tỷ tỷ tỷ hai trăm hai mươi hai triệu tỷ tỷ tỷ tỷ tỷ tỷ tỷ tỷ tỷ tỷ tỷ tỷ tỷ hai trăm hai mươi hai ngàn tỷ tỷ tỷ tỷ tỷ tỷ tỷ tỷ tỷ tỷ tỷ tỷ tỷ hai trăm hai mươi hai tỷ tỷ tỷ tỷ tỷ tỷ tỷ tỷ tỷ tỷ tỷ tỷ tỷ hai trăm hai mươi hai triệu tỷ tỷ tỷ tỷ tỷ tỷ tỷ tỷ tỷ tỷ tỷ tỷ hai trăm hai mươi hai ngàn tỷ tỷ tỷ tỷ tỷ tỷ tỷ tỷ tỷ tỷ tỷ tỷ hai trăm hai mươi hai tỷ tỷ tỷ tỷ tỷ tỷ tỷ tỷ tỷ tỷ tỷ tỷ hai trăm hai mươi hai triệu tỷ tỷ tỷ tỷ tỷ tỷ tỷ tỷ tỷ tỷ tỷ hai trăm hai mươi hai ngàn tỷ tỷ tỷ tỷ tỷ tỷ tỷ tỷ tỷ tỷ tỷ hai trăm hai mươi hai tỷ tỷ tỷ tỷ tỷ tỷ tỷ tỷ tỷ tỷ tỷ hai trăm hai mươi hai triệu tỷ tỷ tỷ tỷ tỷ tỷ tỷ tỷ tỷ tỷ hai trăm hai mươi hai ngàn tỷ tỷ tỷ tỷ tỷ tỷ tỷ tỷ tỷ tỷ hai trăm hai mươi hai tỷ tỷ tỷ tỷ tỷ tỷ tỷ tỷ tỷ tỷ hai trăm hai mươi hai triệu tỷ tỷ tỷ tỷ tỷ tỷ tỷ tỷ tỷ hai trăm hai mươi hai ngàn tỷ tỷ tỷ tỷ tỷ tỷ tỷ tỷ tỷ hai trăm hai mươi hai tỷ tỷ tỷ tỷ tỷ tỷ tỷ tỷ tỷ hai trăm hai mươi hai triệu tỷ tỷ tỷ tỷ tỷ tỷ tỷ tỷ hai trăm hai mươi hai ngàn tỷ tỷ tỷ tỷ tỷ tỷ tỷ tỷ hai trăm hai mươi hai tỷ tỷ tỷ tỷ tỷ tỷ tỷ tỷ hai trăm hai mươi hai triệu tỷ tỷ tỷ tỷ tỷ tỷ tỷ hai trăm hai mươi hai ngàn tỷ tỷ tỷ tỷ tỷ tỷ tỷ hai trăm hai mươi hai tỷ tỷ tỷ tỷ tỷ tỷ tỷ hai trăm hai mươi hai triệu tỷ tỷ tỷ tỷ tỷ tỷ hai trăm hai mươi hai ngàn tỷ tỷ tỷ tỷ tỷ tỷ hai trăm hai mươi hai tỷ tỷ tỷ tỷ tỷ tỷ hai trăm hai mươi hai triệu tỷ tỷ tỷ tỷ tỷ hai trăm hai mươi hai ngàn tỷ tỷ tỷ tỷ tỷ hai trăm hai mươi hai tỷ tỷ tỷ tỷ tỷ hai trăm hai mươi hai triệu tỷ tỷ tỷ tỷ hai trăm hai mươi hai ngàn tỷ tỷ tỷ tỷ hai trăm hai mươi hai tỷ tỷ tỷ tỷ hai trăm hai mươi hai triệu tỷ tỷ tỷ hai trăm hai mươi hai ngàn tỷ tỷ tỷ hai trăm hai mươi hai tỷ tỷ tỷ hai trăm hai mươi hai triệu tỷ tỷ hai trăm hai mươi hai ngàn tỷ tỷ hai trăm hai mươi hai tỷ tỷ hai trăm hai mươi hai triệu tỷ hai trăm hai mươi hai ngàn tỷ hai trăm hai mươi hai tỷ hai trăm hai mươi hai triệu hai trăm hai mươi hai ngàn hai trăm hai mươi hai  |

#### Testcase 11:

|Input| Output|
|-----|:-----:|
|0| Không |


</details>
<br>

<details>
<summary> <strong>🟢 Bài giải mẫu 📚</strong></summary>

Chưa có bài giải.<br> Nếu cần thiết có thể liên hệ facebook [Phan Đức Hải](https://www.facebook.com/chiatayde)

<!-- ```java
package VKU;

import java.util.ArrayList;

public class TraslateNumber {
	String number;
	ArrayList<String> threes = new ArrayList<>();
	
	public TraslateNumber() {
		this.number = "0";
		solve();
	}
	
	public TraslateNumber(String number) {
		this.number = number;
		solve();
	}
	
	public TraslateNumber(int number) {
		this.number = number + "";
		solve();
	}
	
	private void solve() {
		format();
	}
	
	String translate() {
		String result = "";
		for (int i = 0; i < threes.size(); i++) {
			String rs = traslateThree(threes.get(i), (i != 0));
			if (!rs.equals("không")) {
				result  = result + rs + getLevel(threes.size() - i - 1);
			} else {
				if (threes.size() == 1)
					return rs;
			}
		}
		while(result.contains("  "))
			result = result.replaceAll("  ", " ");
		while(result.length() > 0 && result.charAt(0) == ' ')
			result = result.substring(1);
		result = result.substring(0, 1).toUpperCase() + result.substring(1);
		return result;
	}
	
	private String getLevel(int level) {
		String result = " ";
		while (level >= 3) {
			result = result + "tỷ ";
			level -= 3;
		}
		if (level == 1) {
			result = "ngàn " + result;
		}
		if (level == 2)
			result = "triệu " + result;
		
		return " " + result + " ";
	}
	
	String traslateThree(String number, boolean pre) {
		if (number.equals("000"))
			return "không";
		String vietnamese[] = {"không", "một", "hai", "ba", "bốn", "năm", "sáu", "bảy", "tám", "chín"};
		String result = "";
		if (number.charAt(0) == '0') {
			if (pre == true)
				result = result + " " + vietnamese[0] + " trăm";
		} else {
			result = result + " " + vietnamese[number.charAt(0) - '0'] + " trăm";
		}
		
		if (number.charAt(1) == '0') {
			if (number.charAt(0) != '0' && number.charAt(2) != '0') {
				result = result + " lẻ";
			}
		} else if (number.charAt(1) == '1'){
			result = result + " mười";
		} else {
			result = result + " " + vietnamese[number.charAt(1) - '0'] + " mươi";
		}
		if (number.charAt(2) != '0')
			result = result + " " + vietnamese[number.charAt(2) -'0'];
		return result;
	}
	
	private void format() {
		while(number.length() > 1 && number.charAt(0) == '0') {
			number = number.substring(1);
		}
		while (number.length() % 3 != 0)
			number = "0" + number;
		for (int i = 0; i < number.length(); i += 3)
			threes.add(number.substring(i, i + 3));
	}
	
	@Override
	public String toString() {
		return translate();
	}
	
	public String getTraslate() {
		return translate();
	}
	public static void main(String[] args) {
		TraslateNumber tn = new TraslateNumber("123");
		System.out.println(tn);
	}
}

``` -->
</details>
<br>

### Ví dụ 3: Chuyển đổi chuuỗi nhị phân sang chuỗi hexa

Viết chương trình chuỗi đổi từ chuỗi như phần sang chuỗi hexa.<br>
Chuỗi nhị phần có độ dài không viết quá 10^4 ký tự

<details>
<summary> <strong>📝Test case 🧪</strong></summary>

#### Testcase 1:

|Input| Output|
|-----|:-----:|
|10| 2|

#### Testcase 2:

|Input| Output|
|-----|:-----:|
|1110| E|

#### Testcase 3:

|Input| Output|
|-----|:-----:|
|0101011| 2B|

#### Testcase 4:

|Input| Output|
|-----|:-----:|
|10101010101111111| 1557F|

#### Testcase 5:

|Input| Output|
|-----|:-----:|
|0001010101011111111000000000| 155FE00|

#### Testcase 6:

|Input| Output|
|-----|:-----:|
|011001100101010101010101010101010101010101011111111111111| CCAAAAAAAABFFF|

#### Testcase 7:

|Input| Output|
|-----|:-----:|
|1010101010101010101001101010101010101000000000001010100000111101001010101000| AAAAA6AAA800A83D2A8|

#### Testcase 8:

|Input| Output|
|-----|:-----:|
|001010101010101010101011111111110101010000000110100111100101010100101000000111110010101010101010101010111111111101010100000001101001111001010101001010000001111100101010101010101010101111111111010101000000011010011110010101010010100000011111| 2AAAABFF54069E55281F2AAAABFF54069E55281F2AAAABFF54069E55281F|

#### Testcase 9:

|Input| Output|
|-----|:-----:|
|0| 0|

#### Testcase 10:

|Input| Output|
|-----|:-----:|
|1| 1|

</details>
<br>

<details>
<summary> <strong>🟢 Bài giải mẫu 📚</strong></summary>

Chưa có bài giải.<br> Nếu cần thiết có thể liên hệ facebook [Phan Đức Hải](https://www.facebook.com/chiatayde)

</details>
<br>