<div align="center">

# Bài tập nâng cao
</div>

### Ví dụ 1: dịch số

Cho một số nguyên **N** *(1 <= n <= 10^1000)*. Hãy in ra cách đọc tiếng Việt của số tự nhiên đó.

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
|222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222| Hai trăm hai mươi hai triệu tỷ tỷ tỷ tỷ tỷ tỷ tỷ tỷ tỷ tỷ tỷ tỷ tỷ tỷ hai trăm hai mươi hai ngàn tỷ tỷ tỷ tỷ tỷ tỷ tỷ tỷ tỷ tỷ tỷ tỷ tỷ tỷ hai trăm hai mươi hai tỷ tỷ tỷ tỷ tỷ tỷ tỷ tỷ tỷ tỷ tỷ tỷ tỷ tỷ hai trăm hai mươi hai triệu tỷ tỷ tỷ tỷ tỷ tỷ tỷ tỷ tỷ tỷ tỷ tỷ tỷ hai trăm hai mươi hai ngàn tỷ tỷ tỷ tỷ tỷ tỷ tỷ tỷ tỷ tỷ tỷ tỷ tỷ hai trăm hai mươi hai tỷ tỷ tỷ tỷ tỷ tỷ tỷ tỷ tỷ tỷ tỷ tỷ tỷ hai trăm hai mươi hai triệu tỷ tỷ tỷ tỷ tỷ tỷ tỷ tỷ tỷ tỷ tỷ tỷ hai trăm hai mươi hai ngàn tỷ tỷ tỷ tỷ tỷ tỷ tỷ tỷ tỷ tỷ tỷ tỷ hai trăm hai mươi hai tỷ tỷ tỷ tỷ tỷ tỷ tỷ tỷ tỷ tỷ tỷ tỷ hai trăm hai mươi hai triệu tỷ tỷ tỷ tỷ tỷ tỷ tỷ tỷ tỷ tỷ tỷ hai trăm hai mươi hai ngàn tỷ tỷ tỷ tỷ tỷ tỷ tỷ tỷ tỷ tỷ tỷ hai trăm hai mươi hai tỷ tỷ tỷ tỷ tỷ tỷ tỷ tỷ tỷ tỷ tỷ hai trăm hai mươi hai triệu tỷ tỷ tỷ tỷ tỷ tỷ tỷ tỷ tỷ tỷ hai trăm hai mươi hai ngàn tỷ tỷ tỷ tỷ tỷ tỷ tỷ tỷ tỷ tỷ hai trăm hai mươi hai tỷ tỷ tỷ tỷ tỷ tỷ tỷ tỷ tỷ tỷ hai trăm hai mươi hai triệu tỷ tỷ tỷ tỷ tỷ tỷ tỷ tỷ tỷ hai trăm hai mươi hai ngàn tỷ tỷ tỷ tỷ tỷ tỷ tỷ tỷ tỷ hai trăm hai mươi hai tỷ tỷ tỷ tỷ tỷ tỷ tỷ tỷ tỷ hai trăm hai mươi hai triệu tỷ tỷ tỷ tỷ tỷ tỷ tỷ tỷ hai trăm hai mươi hai ngàn tỷ tỷ tỷ tỷ tỷ tỷ tỷ tỷ hai trăm hai mươi hai tỷ tỷ tỷ tỷ tỷ tỷ tỷ tỷ hai trăm hai mươi hai triệu tỷ tỷ tỷ tỷ tỷ tỷ tỷ hai trăm hai mươi hai ngàn tỷ tỷ tỷ tỷ tỷ tỷ tỷ hai trăm hai mươi hai tỷ tỷ tỷ tỷ tỷ tỷ tỷ hai trăm hai mươi hai triệu tỷ tỷ tỷ tỷ tỷ tỷ hai trăm hai mươi hai ngàn tỷ tỷ tỷ tỷ tỷ tỷ hai trăm hai mươi hai tỷ tỷ tỷ tỷ tỷ tỷ hai trăm hai mươi hai triệu tỷ tỷ tỷ tỷ tỷ hai trăm hai mươi hai ngàn tỷ tỷ tỷ tỷ tỷ hai trăm hai mươi hai tỷ tỷ tỷ tỷ tỷ hai trăm hai mươi hai triệu tỷ tỷ tỷ tỷ hai trăm hai mươi hai ngàn tỷ tỷ tỷ tỷ hai trăm hai mươi hai tỷ tỷ tỷ tỷ hai trăm hai mươi hai triệu tỷ tỷ tỷ hai trăm hai mươi hai ngàn tỷ tỷ tỷ hai trăm hai mươi hai tỷ tỷ tỷ hai trăm hai mươi hai triệu tỷ tỷ hai trăm hai mươi hai ngàn tỷ tỷ hai trăm hai mươi hai tỷ tỷ hai trăm hai mươi hai triệu tỷ hai trăm hai mươi hai ngàn tỷ hai trăm hai mươi hai tỷ hai trăm hai mươi hai triệu hai trăm hai mươi hai ngàn hai trăm hai mươi hai  |

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