package ioeconference.benoi.com.ioeconference;

import android.net.Uri;
import android.support.design.widget.TabLayout;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements ioeconference.benoi.com.ioeconference.Home.OnFragmentInteractionListener,ioeconference.benoi.com.ioeconference.AboutConference.OnFragmentInteractionListener, ioeconference.benoi.com.ioeconference.CallForPaper.OnFragmentInteractionListener, ioeconference.benoi.com.ioeconference.ImportantDates.OnFragmentInteractionListener, ioeconference.benoi.com.ioeconference.AuthorGuidelines.OnFragmentInteractionListener, ioeconference.benoi.com.ioeconference.Registration.OnFragmentInteractionListener, ioeconference.benoi.com.ioeconference.AdvisoryBoard.OnFragmentInteractionListener, ioeconference.benoi.com.ioeconference.ContactUs.OnFragmentInteractionListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tablayout);
        tabLayout.addTab(tabLayout.newTab().setText(R.string.home_tab));
        tabLayout.addTab(tabLayout.newTab().setText(R.string.about_conference));
        tabLayout.addTab(tabLayout.newTab().setText(R.string.call_for_papers));
        tabLayout.addTab(tabLayout.newTab().setText(R.string.important_dates));
        tabLayout.addTab(tabLayout.newTab().setText(R.string.author_guidelines));
        tabLayout.addTab(tabLayout.newTab().setText(R.string.registration));
        tabLayout.addTab(tabLayout.newTab().setText(R.string.advisory_board));
        tabLayout.addTab(tabLayout.newTab().setText(R.string.contact_us));
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);
        tabLayout.setTabTextColors(getResources().getColor(R.color.white_alpha), getResources().getColor(R.color.white));

        final ViewPager viewPager = (ViewPager) findViewById(R.id.pager);
        final PagerAdapter adapter = new PageAdapter(getSupportFragmentManager(), tabLayout.getTabCount());
        viewPager.setAdapter(adapter);
        viewPager.setOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));

        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
