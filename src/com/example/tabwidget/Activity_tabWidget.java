/**
 * 
 */
package com.example.tabwidget;

import android.app.TabActivity;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.TabHost;
import android.widget.TabHost.OnTabChangeListener;
import android.widget.Toast;

/**
 * @author jy_dingsufu
 * 
 */
@SuppressWarnings("deprecation")
public class Activity_tabWidget extends TabActivity {
	// 声明TabHost对象
	TabHost tabHost;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.mian);
		
		// 取得TabHost对象
		tabHost = getTabHost();
		/* 为TabHost添加标签 */
		// 新建一个newTabSpec(newTabSpec)
		// 设置其图标及标签(setIndicator)
		// 设置内容(setContent)
		tabHost.addTab(tabHost
				.newTabSpec("tab_test1")
				.setIndicator(
						"Tab 1",
						getResources().getDrawable(
								R.drawable.common_tab_icon_daily_press))
				.setContent(R.id.textview1));

		tabHost.addTab(tabHost
				.newTabSpec("tab_test2")
				.setIndicator(
						"Tab 2",
						getResources().getDrawable(
								R.drawable.common_tab_icon_home_press))
				.setContent(R.id.textview2));

		tabHost.addTab(tabHost
				.newTabSpec("tab_test3")
				.setIndicator(
						"Tab 3",
						getResources().getDrawable(
								R.drawable.common_tab_icon_myctrip_press))
				.setContent(R.id.textview3));
		
		tabHost.addTab(tabHost
				.newTabSpec("tab_test4")
				.setIndicator(
						"Tab 4",
						getResources().getDrawable(
								R.drawable.common_tab_icon_myctrip_press))
								.setContent(R.id.textview4));

		// 设置TabHost的背景颜色
		tabHost.setBackgroundColor(Color.argb(150, 22, 70, 150));
		// 设置Tabhost的背景图片资源
		tabHost.setBackgroundResource(R.drawable.call_center_hot_problem_top_bg);
		// 设置当前显示哪一个标签
		tabHost.setCurrentTab(0);

		tabHost.setOnTabChangedListener(new OnTabChangeListener() {

			@Override
			public void onTabChanged(String arg0) {
				Toast.makeText(Activity_tabWidget.this, "当前选中" + arg0 + "标签",
						Toast.LENGTH_SHORT).show();
			}
		});
	}

}
