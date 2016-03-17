package com.example.andrewliu.fatbaby.SlidMenu;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import com.example.andrewliu.fatbaby.R;
import com.tuesda.walker.circlerefresh.CircleRefreshLayout;

public class MainTab02 extends Fragment
{
	private ListView mList;
	private View messageLayout;
	private CircleRefreshLayout mRefreshLayout;
	private Button mStop;
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setHasOptionsMenu(true);
	}
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
	{
		messageLayout = inflater.inflate(R.layout.main_tab_02, container, false);

		mRefreshLayout = (CircleRefreshLayout) messageLayout.findViewById(R.id.refresh_tab02);
		mList = (ListView) messageLayout.findViewById(R.id.list);
		mStop = (Button) messageLayout.findViewById(R.id.stop_refresh);
		String[] strs = {
				"The",
				"Canvas",
				"class",
				"holds",
				"the",
				"draw",
				"calls",
				".",
				"To",
				"draw",
				"something,",
				"you",
				"need",
				"4 basic",
				"components",
				"Bitmap",
		};
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(getContext(), android.R.layout.simple_list_item_1, strs);
		mList.setAdapter(adapter);
		mStop.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				mRefreshLayout.finishRefreshing();
			}
		});
		mRefreshLayout.setOnRefreshListener(
				new CircleRefreshLayout.OnCircleRefreshListener() {
					@Override
					public void refreshing() {
						// do something when refresh starts
					}

					@Override
					public void completeRefresh() {
						// do something when refresh complete
					}
				});
		return messageLayout;
	}
	@Override
	public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
		// Inflate the menu; this adds items to the action bar if it is present.
		super.onCreateOptionsMenu(menu, inflater);
		inflater.inflate(R.menu.menu_main,menu);
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();

		//noinspection SimplifiableIfStatement
		if (id == R.id.action_settings) {
			return true;
		}

		return super.onOptionsItemSelected(item);
	}
}
