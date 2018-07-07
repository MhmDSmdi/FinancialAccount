package com.bluecode.mhmd.tarabin.ui.base;

public interface MvpPresenter<V extends MvpView> {

    void onAttach(V mvpView);

    void onDetach();

    void setUserAsLoggedOut();
}
