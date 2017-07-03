package com.jsheng.exttablayout.sample.content;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.jsheng.exttablayout.sample.R;
import com.jsheng.exttablayout.sample.base.BaseFragment;

import butterknife.BindView;

/**
 * Created by 十六楼的小盛 on 2017/6/30.
 */

public class ContentFragment extends BaseFragment {

    public static final String COLOR_KEY = "COLOR_KEY";
    public static final String TITLE_KEY = "TITLE_KEY";

    @BindView(R.id.content_layout)
    ViewGroup mContentLayout;

    @BindView(R.id.text_view)
    TextView mTextView;


    public static ContentFragment newInstance(int color, int title) {
        Bundle args = new Bundle();
        args.putInt(COLOR_KEY, color);
        args.putInt(TITLE_KEY, title);

        ContentFragment fragment = new ContentFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    protected int getFragmentLayout() {
        return R.layout.fragment_common;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Bundle arguments = getArguments();
        if (arguments != null) {
            mContentLayout.setBackgroundResource(arguments.getInt(COLOR_KEY));
            mTextView.setText(arguments.getInt(TITLE_KEY));
        }
    }
}
