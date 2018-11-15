# ChineseStrokeSorting
中文笔划排序，博客介绍链接为： https://blog.csdn.net/ouyang_peng/article/details/83863693

关于Android实现 中文拼音排序以及中文笔划排序和英文排序Demo，参考博客介绍链接：https://blog.csdn.net/ouyang_peng/article/details/84109727

github地址：https://github.com/ouyangpeng/ChinesePinyinSortAndStrokeSort


# demo 

## 测试 StringStrokeComparator

```java

package com.oyp.csdn.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.junfeng.strokesort.comparator.StringStrokeComparator;

public class TestStringStrokeComparator {

    public static void main(String[] args) {
        List<String> name = new ArrayList<String>();
        name.add("欧阳鹏");
        name.add("阿森松島");
        name.add("安道爾");
        name.add("阿拉伯聯合大公國");
        name.add("阿富汗");
        name.add("安地卡及巴布達");
        name.add("安圭拉");
        name.add("阿爾巴尼亞");
        name.add("亞美尼亞");
        name.add("安哥拉");
        name.add("南極洲");
        name.add("阿根廷");
        name.add("美屬薩摩亞");
        name.add("奧蘭群島");
        name.add("波士尼亞赫塞哥維納");
        name.add("巴林");
        name.add("聖巴泰勒米");
        name.add("汶萊");
        name.add("玻利維亞");
        name.add("聖克里斯多福及尼維斯");
        name.add("朝鮮");
        name.add("韓國");
        name.add("科威特");
        name.add("開曼群島");
        name.add("哈薩克");
        name.add("寮國");
        name.add("黎巴嫩");
        name.add("聖露西亞");
        name.add("薩爾瓦多");
        name.add("馬約特");
        name.add("台灣（中國）");
        name.add("香港（中國）");
        name.add("澳門（中國）");
        name.add("蘇丹");

        //添加部分 生僻字
        name.add("嘣");
        name.add("嚋");
        name.add("蘇丹");
        name.add("哜");
        name.add("囆");
        name.add("囎");
        name.add("囼");
        name.add("圀");
        name.add("壝");
        name.add("壝");
        name.add("墪");
        name.add("夨");
        name.add("夒");
        name.add("孅");
        name.add("孏");
        name.add("孆");
        name.add("媘");
        name.add("孑");
        name.add("孒");
        name.add("孓");
        name.add("孖");
        name.add("孠");
        name.add("孧");
        name.add("滽");
        name.add("滽");
        name.add("瀶");
        name.add("瀶");
        name.add("犪");
        name.add("犓");
        name.add("犫");

        /** 使用 */
        Collections.sort(name, new StringStrokeComparator());
        for (String string : name) {
            System.out.println(string);
        }
    }
}
```

测试结果


```
孑
孒
孓
夨
巴林
台灣（中國）
孖
安圭拉
安地卡及巴布達
安哥拉
安道爾
汶萊
阿拉伯聯合大公國
阿根廷
阿富汗
阿森松島
阿爾巴尼亞
亞美尼亞
囼
孠
孧
欧阳鹏
波士尼亞赫塞哥維納
南極洲
哈薩克
哜
圀
玻利維亞
科威特
美屬薩摩亞
香港（中國）
馬約特
媘
朝鮮
開曼群島
聖巴泰勒米
聖克里斯多福及尼維斯
聖露西亞
嘣
奧蘭群島
滽
滽
犓
墪
寮國
澳門（中國）
黎巴嫩
薩爾瓦多
嚋
韓國
壝
壝
夒
蘇丹
蘇丹
孅
孆
瀶
瀶
囆
囎
孏
犪
犫

```


## 测试 ObjectStrokeComparator

代码

```java
package com.oyp.csdn.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.junfeng.strokesort.comparator.ObjectStrokeComparator;
import com.junfeng.strokesort.model.Stroke;

public class TestObjectStrokeComparator {

	public static void main(String[] args) {
		List<Stroke> strokes = new ArrayList<Stroke>();
		Stroke stroke1 = new Stroke();
		stroke1.setName("张三无");
		strokes.add(stroke1);
		stroke1 = new Stroke();
		stroke1.setName("赵明红匠");
		strokes.add(stroke1);
		stroke1 = new Stroke();
		stroke1.setName("李四");
		strokes.add(stroke1);
		stroke1 = new Stroke();
		stroke1.setName("王东栋");
		strokes.add(stroke1);
		stroke1 = new Stroke();
		stroke1.setName("李四仨");
		strokes.add(stroke1);
		stroke1 = new Stroke();
		stroke1.setName("张三");
		strokes.add(stroke1);
		stroke1 = new Stroke();
		stroke1.setName("欧阳鹏");
		strokes.add(stroke1);
		
		/** 使用 */
		Collections.sort(strokes, new ObjectStrokeComparator(Stroke.class, "name"));

		for (Stroke stroke : strokes) {
			System.out.println(stroke.getName());
		}

		System.out.println("----------");

		List<CountryOrRegion> countryOrRegionArrayList = new ArrayList<CountryOrRegion>();
		CountryOrRegion countryOrRegion = new CountryOrRegion();
		countryOrRegion.setName("阿森松島");
		countryOrRegionArrayList.add(countryOrRegion);
		countryOrRegion = new CountryOrRegion();
		countryOrRegion.setName("安道爾");
		countryOrRegionArrayList.add(countryOrRegion);
		countryOrRegion = new CountryOrRegion();
		countryOrRegion.setName("聖克里斯多福及尼維斯");
		countryOrRegionArrayList.add(countryOrRegion);
		countryOrRegion = new CountryOrRegion();
		countryOrRegion.setName("阿爾巴尼亞");
		countryOrRegionArrayList.add(countryOrRegion);
		countryOrRegion = new CountryOrRegion();
		countryOrRegion.setName("美屬薩摩亞");
		countryOrRegionArrayList.add(countryOrRegion);

		/** 使用 */
		Collections.sort(countryOrRegionArrayList, new ObjectStrokeComparator(CountryOrRegion.class, "name"));
		for (CountryOrRegion countryOrRegionItem : countryOrRegionArrayList) {
			System.out.println(countryOrRegionItem.getName());
		}

		System.out.println("----------");
		
		List<String> name = new ArrayList<String>();
		name.add("阿森松島");
		name.add("安道爾");
		name.add("阿拉伯聯合大公國");
		name.add("阿富汗");
		name.add("安地卡及巴布達");
		name.add("安圭拉");
		name.add("阿爾巴尼亞");
		name.add("亞美尼亞");
		name.add("安哥拉");
		name.add("南極洲");
		name.add("阿根廷");
		name.add("美屬薩摩亞");
		name.add("奧蘭群島");
		name.add("波士尼亞赫塞哥維納");
		name.add("巴林");
		name.add("聖巴泰勒米");
		name.add("汶萊");
		name.add("玻利維亞");
		name.add("聖克里斯多福及尼維斯");
		name.add("朝鮮");
		name.add("韓國");
		name.add("科威特");
		name.add("開曼群島");
		name.add("哈薩克");
		name.add("寮國");
		name.add("黎巴嫩");
		name.add("聖露西亞");
		name.add("薩爾瓦多");
		name.add("馬約特");
		name.add("台灣（中國）");
		name.add("香港（中國）");
		name.add("澳門（中國）");
		name.add("蘇丹");
		/** 使用 */
		Collections.sort(name, new ObjectStrokeComparator(String.class, null));

		for (String string : name) {
			System.out.println(string);
		}
	}
}

```

测试结果

```
王东栋
张三
张三无
李四
李四仨
欧阳鹏
赵明红匠
----------
安道爾
阿森松島
阿爾巴尼亞
美屬薩摩亞
聖克里斯多福及尼維斯
----------
巴林
台灣（中國）
安圭拉
安地卡及巴布達
安哥拉
安道爾
汶萊
阿拉伯聯合大公國
阿根廷
阿富汗
阿森松島
阿爾巴尼亞
亞美尼亞
波士尼亞赫塞哥維納
南極洲
哈薩克
玻利維亞
科威特
美屬薩摩亞
香港（中國）
馬約特
朝鮮
開曼群島
聖巴泰勒米
聖克里斯多福及尼維斯
聖露西亞
奧蘭群島
寮國
澳門（中國）
黎巴嫩
薩爾瓦多
韓國
蘇丹
```


