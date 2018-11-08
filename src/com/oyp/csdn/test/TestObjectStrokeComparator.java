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
