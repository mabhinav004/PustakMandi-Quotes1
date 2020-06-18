package com.ishika.pustakmandiquotes.ui.bookmark;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class bookmarkViewmodel extends ViewModel {

        private MutableLiveData<String> mText;

        public bookmarkViewmodel() {
            mText = new MutableLiveData<>();
            mText.setValue("This is bookmark fragment");
        }

        public LiveData<String> getText() {
            return mText;
        }
    }
