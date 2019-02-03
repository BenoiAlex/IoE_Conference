package ioeconference.benoi.com.ioeconference;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class PageAdapter extends FragmentStatePagerAdapter {
    int mNoOfTabs;

    public PageAdapter(FragmentManager fm, int NumberOfTabs) {
        super(fm);
        this.mNoOfTabs = NumberOfTabs;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {

            case 0:
                ioeconference.benoi.com.ioeconference.Home home = new ioeconference.benoi.com.ioeconference.Home();
                return home;
            case 1:
                ioeconference.benoi.com.ioeconference.AboutConference aboutConference = new ioeconference.benoi.com.ioeconference.AboutConference();
                return aboutConference;
            case 2:
                ioeconference.benoi.com.ioeconference.CallForPaper callForPaper = new ioeconference.benoi.com.ioeconference.CallForPaper();
                return callForPaper;
            case 3:
                ioeconference.benoi.com.ioeconference.ImportantDates importantDates = new ioeconference.benoi.com.ioeconference.ImportantDates();
                return importantDates;
            case 4:
                ioeconference.benoi.com.ioeconference.AuthorGuidelines authorGuidelines = new ioeconference.benoi.com.ioeconference.AuthorGuidelines();
                return authorGuidelines;
            case 5:
                ioeconference.benoi.com.ioeconference.Registration registration = new ioeconference.benoi.com.ioeconference.Registration();
                return registration;
            case 6:
                ioeconference.benoi.com.ioeconference.AdvisoryBoard advisoryBoard = new ioeconference.benoi.com.ioeconference.AdvisoryBoard();
                return advisoryBoard;
            case 7:
                ioeconference.benoi.com.ioeconference.ContactUs contactUs = new ioeconference.benoi.com.ioeconference.ContactUs();
                return contactUs;
            default:
                return null;

        }

    }

    @Override
    public int getCount() {
        return mNoOfTabs;
    }
}
