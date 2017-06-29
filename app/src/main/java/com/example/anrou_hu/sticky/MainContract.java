package com.example.anrou_hu.sticky;

import com.example.anrou_hu.sticky.model.data.Sticky;
import com.example.anrou_hu.sticky.presenters.BasePresenter;
import com.example.anrou_hu.sticky.views.BaseView;

import java.util.ArrayList;

/**
 * @author anrou_hu
 */

public interface MainContract {


    interface View extends BaseView<Presenter> {

    }

    interface Presenter extends BasePresenter {

        void addSticky(Sticky sticky);

        ArrayList<Sticky> getStickList();
    }
}
