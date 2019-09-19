# 0624030 盧友舜

## 0624030 盧友舜

### 0624030 盧友舜

#### 0624030 盧友舜

##### 0624030 盧友舜

###### 0624030 盧友舜

`0624030`

```
0624030
```

**粗體**

*斜體*

~~刪除線~~

| 1 | 2 | 3 |
| :----- | :-----: | -----: |
| abasfb | afbfdahfda | bdafbadfb |
| 1 | 2 | 3 |

```java
//利用do while 迴圈來重複進行計算
import java.io.*;
public class demo11{  
	public static void main(String args[]) throws Exception
	{  //程式進入點
		String getbr;
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		int i;
		double radius,height,width;
		do
		{
		  /*****請使用者輸入選項**********/
		  System.out.print("請輸入 0. 結束 1.計算圓形面積 2.計算三角形面積 3.矩形面積：");
		  getbr = br.readLine();
		  i=Integer.parseInt(getbr);
		  /****開始計算***/
		  switch (i)
		  {
		    case 0: //結束
			System.out.println("謝謝使用！");
			break;
		    case 1: //圓形
		   	System.out.print("請輸入半徑：");
			getbr = br.readLine();
			radius=Double.parseDouble(getbr);
			System.out.println("半徑 "+radius+" 之圓形面積是 "+3.14159*radius*radius);
			break;
		    case 2: //三角形
			   System.out.print("請輸入底：");
			   getbr = br.readLine();
			   width=Double.parseDouble(getbr);
			   System.out.print("請輸入高：");
			   getbr = br.readLine();
			   height=Double.parseDouble(getbr);
			   System.out.println("底 "+width+" 高 "+height+" 之三角形面積是"+width*height/2);
			   break;
		    case 3: //矩形
			   System.out.print("請輸入長：");
			   getbr = br.readLine();
			   width=Double.parseDouble(getbr);
			   System.out.print("請輸入寬：");
			   getbr = br.readLine();
			   height=Double.parseDouble(getbr);
			   System.out.println("長 "+width+" 寬 "+height+" 之矩形面積是"+width*height);
			   break;
		    default:
			   System.out.println("奇怪？只請你輸入1到3，你輸這是什麼阿？！");
		  } //switch 結束
		} while (i!=0); //do While 結束
	} //main 結束
}
```

