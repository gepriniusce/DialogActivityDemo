package com.example.diaglogactivitydemo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleAdapter;

public class DialogActivity extends Activity {
	private ListView lv;
	private List<Map<String, String>> datas = new ArrayList<Map<String, String>>();

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_dialog);

		lv = (ListView) findViewById(R.id.dialog_content);
		Map<String, String> map = new HashMap<String, String>();
		map.put("name", "公关部");
		Map<String, String> map1 = new HashMap<String, String>();
		map1.put("name", "外联部");
		Map<String, String> map2 = new HashMap<String, String>();
		map2.put("name", "秘书部");
		Map<String, String> map3 = new HashMap<String, String>();
		map3.put("name", "研发部");
		datas.add(map);
		datas.add(map1);
		datas.add(map2);
		datas.add(map3);
		SimpleAdapter adapter = new SimpleAdapter(getApplicationContext(), datas, R.layout.item,
				new String[] { "name" }, new int[] { R.id.item_name });
		lv.setAdapter(adapter);
	}
}
