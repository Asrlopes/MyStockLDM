package com.labdispmoveis.mystock.ui.about;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class AboutViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public AboutViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Essa é a pagina 'Sobre'");
    }

    public LiveData<String> getText() {
        return mText;
    }
}