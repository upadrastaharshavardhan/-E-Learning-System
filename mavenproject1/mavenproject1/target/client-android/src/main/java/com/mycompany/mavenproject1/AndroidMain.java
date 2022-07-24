package com.mycompany.mavenproject1;

import android.app.Activity;

public class AndroidMain extends Activity {
    private AndroidMain() {
    }

    public static void main(android.content.Context context) throws Exception {
        DataModel.onPageLoad();
    }
}
