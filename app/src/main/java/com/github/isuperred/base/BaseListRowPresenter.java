package com.github.isuperred.base;

import androidx.leanback.widget.BaseOnItemViewClickedListener;
import androidx.leanback.widget.ListRowPresenter;
import androidx.leanback.widget.RowPresenter;


public class BaseListRowPresenter extends ListRowPresenter {

    private BaseOnItemViewClickedListener onItemViewClickedListener;

    @Override
    protected void onRowViewAttachedToWindow(RowPresenter.ViewHolder vh) {
        super.onRowViewAttachedToWindow(vh);
        if (getOnItemViewClickedListener() != null) {
            vh.setOnItemViewClickedListener(getOnItemViewClickedListener());
        }
    }

    @Override
    protected void onRowViewDetachedFromWindow(RowPresenter.ViewHolder vh) {
        super.onRowViewDetachedFromWindow(vh);
        if (getOnItemViewClickedListener() != null) {
            vh.setOnItemViewClickedListener(null);
        }
    }

    public BaseOnItemViewClickedListener getOnItemViewClickedListener() {
        return onItemViewClickedListener;
    }

    public void setOnItemViewClickedListener(BaseOnItemViewClickedListener onItemViewClickedListener) {
        this.onItemViewClickedListener = onItemViewClickedListener;
    }
}
