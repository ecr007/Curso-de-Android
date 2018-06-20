package evercuevas.com.evergram;

import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

import evercuevas.com.evergram.fragments.HomeFragment;
import evercuevas.com.evergram.fragments.SearchFragment;

public class ContentActivity extends AppCompatActivity {

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:

                    HomeFragment obj = new HomeFragment();
                    getSupportFragmentManager()
                            .beginTransaction()
                            .replace(R.id.ecrFrameContent,obj)
                            .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
                            .disallowAddToBackStack()
                            .commit();

                    return true;
                case R.id.navigation_search:
                    SearchFragment objs = new SearchFragment();
                    getSupportFragmentManager()
                            .beginTransaction()
                            .replace(R.id.ecrFrameContent,objs)
                            .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
                            .disallowAddToBackStack()
                            .commit();

                    return true;
                case R.id.navigation_profile:

                    SearchFragment objss = new SearchFragment();
                    getSupportFragmentManager()
                            .beginTransaction()
                            .replace(R.id.ecrFrameContent,objss)
                            .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
                            .disallowAddToBackStack()
                            .commit();

                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_content);

        HomeFragment obj = new HomeFragment();
        getSupportFragmentManager()
                .beginTransaction()
                .add(R.id.ecrFrameContent,obj)
                .commit();

        BottomNavigationView navigation = findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }

}
