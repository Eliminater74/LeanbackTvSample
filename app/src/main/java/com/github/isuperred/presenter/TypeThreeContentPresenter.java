package com.github.isuperred.presenter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.leanback.widget.Presenter;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.github.isuperred.R;
import com.github.isuperred.bean.Content;
import com.github.isuperred.utils.FontDisplayUtil;

public class TypeThreeContentPresenter extends Presenter {
    private static final String TAG = "TypeThreeContentPresenter";
    private Context mContext;

    @Override
    public Presenter.ViewHolder onCreateViewHolder(ViewGroup parent) {
        if (mContext == null) {
            mContext = parent.getContext();
        }
        View view = LayoutInflater.from(mContext).inflate(R.layout.item_type_three_layout, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(Presenter.ViewHolder viewHolder, Object item) {
        if (item instanceof Content.DataBean.WidgetsBean) {
            ViewHolder vh = (ViewHolder) viewHolder;
            Glide.with(mContext)
                    .load(((Content.DataBean.WidgetsBean) item).getUrl())
                    .apply(new RequestOptions()
                            .centerCrop()
                            .override(FontDisplayUtil.dip2px(mContext, 124),
                                    FontDisplayUtil.dip2px(mContext, 186))
                            .placeholder(R.drawable.bg_shape_default))
                    .into(vh.mIvTypeThreePoster);
        }
    }

    @Override
    public void onUnbindViewHolder(Presenter.ViewHolder viewHolder) {

    }

    public static class ViewHolder extends Presenter.ViewHolder {

        private final ImageView mIvTypeThreePoster;

        public ViewHolder(View view) {
            super(view);
            mIvTypeThreePoster = view.findViewById(R.id.iv_type_three_poster);
        }
    }
}

