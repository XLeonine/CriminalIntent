package com.example.decyer.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by decyer on 2016/11/13.
 */

public class CrimeListActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment(){
        return new CrimeListFragment();
    }
}
