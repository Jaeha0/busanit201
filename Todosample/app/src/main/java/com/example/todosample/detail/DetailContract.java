package com.example.todosample.detail;

import com.example.todolist.base.BasePresenter;
import com.example.todolist.base.BaseView;
import com.example.todolist.model.Item;

public class DetailContract {
    public interface View extends BaseView {
        void fetchItemDone(Item item);
    }

    public interface Presenter extends BasePresenter<View> {
        void fetchItem(int no);
    }
}
