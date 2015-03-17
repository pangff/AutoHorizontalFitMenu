package com.pangff.autohorizontalfitmenu;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;

public class AutoHorizontalFitMenuView extends LinearLayout{

	int totalWidth;
	public AutoHorizontalFitMenuView(Context context, AttributeSet attrs) {
		super(context, attrs);
	}
	
	public void resetChilder(){
		totalWidth = 0;
		for(int i=0;i<this.getChildCount();i++){
			TextView textView = (TextView) this.getChildAt(i);
			totalWidth+=textView.getPaint().measureText(textView.getText().toString());
		}
		for(int i=0;i<this.getChildCount();i++){
			TextView textView = (TextView) this.getChildAt(i);
			LinearLayout.LayoutParams lp = (LayoutParams) textView.getLayoutParams();
			lp.weight = (textView.getPaint().measureText(textView.getText().toString()))/totalWidth;
			textView.setLayoutParams(lp);
		}
		requestLayout();
	}
}
