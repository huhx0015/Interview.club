package huhx0015.interview.club.data;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import huhx0015.interview.club.R;
import huhx0015.interview.club.model.Company;
import huhx0015.interview.club.model.Interviewer;

/**
 * Created by Michael Yoon Huh on 2/27/2016.
 */
public class DummyData {

    /** DUMMY LIST DATA ________________________________________________________________________ **/

    public static List<Interviewer> getInterviewerSet(int setNumber) {

        List<Interviewer> interviewerList = new ArrayList<>();

        switch(setNumber) {

            // ALL:
            case 0:
                interviewerList.add(SALLY_MALIBU());
                interviewerList.add(NICK_BORGE());
                interviewerList.add(DORIS_ESTHER());
                interviewerList.add(DAWN_BELLEPOR());
                interviewerList.add(JENNIFER_MARLOWE());
                interviewerList.add(SHIRLEY_CONNOR());
                interviewerList.add(SONYA_KOSLAVOKA());
                interviewerList.add(MAC_HAMM());
                interviewerList.add(TONY_MCDONALD());
                interviewerList.add(CHARLES_OLSEN());
                interviewerList.add(JANET_HOWELL());
                break;

            // ANDROID:
            case 1:
                interviewerList.add(NICK_BORGE());
                interviewerList.add(MAC_HAMM());
                interviewerList.add(JANET_HOWELL());
                break;

            // IOS:
            case 2:
                interviewerList.add(SALLY_MALIBU());
                interviewerList.add(JENNIFER_MARLOWE());
                interviewerList.add(SHIRLEY_CONNOR());
                break;

            // FRONT-END:
            case 3:
                interviewerList.add(DAWN_BELLEPOR());
                interviewerList.add(TONY_MCDONALD());
                break;

            // BACK-END:
            case 4:
                interviewerList.add(DORIS_ESTHER());
                interviewerList.add(SONYA_KOSLAVOKA());
                interviewerList.add(CHARLES_OLSEN());
                break;

            // DEFAULT: ALL
            default:
                interviewerList.add(SALLY_MALIBU());
                interviewerList.add(NICK_BORGE());
                interviewerList.add(DORIS_ESTHER());
                interviewerList.add(DAWN_BELLEPOR());
                interviewerList.add(JENNIFER_MARLOWE());
                interviewerList.add(SHIRLEY_CONNOR());
                interviewerList.add(SONYA_KOSLAVOKA());
                interviewerList.add(MAC_HAMM());
                interviewerList.add(TONY_MCDONALD());
                interviewerList.add(CHARLES_OLSEN());
                interviewerList.add(JANET_HOWELL());
                break;
        }

        return interviewerList;
    }

    public static Interviewer getRandomInterviewer() {

        int randInt;
        Random randValue = new Random();
        randInt = randValue.nextInt(11);

        switch (randInt) {
            case 0:
                return SALLY_MALIBU();
            case 1:
                return NICK_BORGE();
            case 2:
                return DORIS_ESTHER();
            case 3:
                return DAWN_BELLEPOR();
            case 4:
                return JENNIFER_MARLOWE();
            case 5:
                return SHIRLEY_CONNOR();
            case 6:
                return SONYA_KOSLAVOKA();
            case 7:
                return MAC_HAMM();
            case 8:
                return TONY_MCDONALD();
            case 9:
                return CHARLES_OLSEN();
            case 10:
                return JANET_HOWELL();
            default:
                return SALLY_MALIBU();
        }
    }

    /** DUMMY INTERVIEWER DATA _________________________________________________________________ **/

    public static Interviewer SALLY_MALIBU() {

        Interviewer interviewer = new Interviewer();
        interviewer.setAvatar(R.drawable.blonde_woman_interviewer);
        interviewer.setFullName("Sally Malibu");
        interviewer.setCurrentCompany(new Company("gusto", 0));
        interviewer.setPosition("Junior iOS Developer");
        interviewer.setPositionType(2);

        List<Company> previousCompanies = new ArrayList<>();
        previousCompanies.add(new Company("google", 2));
        previousCompanies.add(new Company("dropbox", 1));
        previousCompanies.add(new Company("gusto", 0));
        interviewer.setPreviousCompanies(previousCompanies);

        return interviewer;
    }

    public static Interviewer NICK_BORGE() {

        Interviewer interviewer = new Interviewer();
        interviewer.setAvatar(R.drawable.contemplating_man_interviewer);
        interviewer.setFullName("Nick Borge");
        interviewer.setCurrentCompany(new Company("dropbox", 1));
        interviewer.setPosition("Android Developer");
        interviewer.setPositionType(3);

        List<Company> previousCompanies = new ArrayList<>();
        previousCompanies.add(new Company("google", 2));
        previousCompanies.add(new Company("dropbox", 1));
        previousCompanies.add(new Company("gusto", 0));
        interviewer.setPreviousCompanies(previousCompanies);

        return interviewer;
    }

    public static Interviewer DORIS_ESTHER() {

        Interviewer interviewer = new Interviewer();
        interviewer.setAvatar(R.drawable.doris_lady_interviewer);
        interviewer.setFullName("Doris Esther");
        interviewer.setCurrentCompany(new Company("google", 2));
        interviewer.setPosition("Senior Back-End Engineer");
        interviewer.setPositionType(1);

        List<Company> previousCompanies = new ArrayList<>();
        previousCompanies.add(new Company("google", 2));
        previousCompanies.add(new Company("dropbox", 1));
        previousCompanies.add(new Company("gusto", 0));
        interviewer.setPreviousCompanies(previousCompanies);

        return interviewer;
    }

    public static Interviewer DAWN_BELLEPOR() {

        Interviewer interviewer = new Interviewer();
        interviewer.setAvatar(R.drawable.executive_woman_interviewer);
        interviewer.setFullName("Dawn Bellepor");
        interviewer.setCurrentCompany(new Company("google", 2));
        interviewer.setPosition("Senior Front-End Engineer");
        interviewer.setPositionType(0);

        List<Company> previousCompanies = new ArrayList<>();
        previousCompanies.add(new Company("google", 2));
        previousCompanies.add(new Company("dropbox", 1));
        previousCompanies.add(new Company("gusto", 0));
        interviewer.setPreviousCompanies(previousCompanies);

        return interviewer;
    }

    public static Interviewer JENNIFER_MARLOWE() {

        Interviewer interviewer = new Interviewer();
        interviewer.setAvatar(R.drawable.fitness_girl_avatar);
        interviewer.setFullName("Jennifer Marlowe");
        interviewer.setCurrentCompany(new Company("gusto", 0));
        interviewer.setPosition("Junior iOS Developer");
        interviewer.setPositionType(2);

        List<Company> previousCompanies = new ArrayList<>();
        previousCompanies.add(new Company("google", 2));
        previousCompanies.add(new Company("dropbox", 1));
        previousCompanies.add(new Company("gusto", 0));
        interviewer.setPreviousCompanies(previousCompanies);

        return interviewer;
    }

    public static Interviewer MAC_HAMM() {

        Interviewer interviewer = new Interviewer();
        interviewer.setAvatar(R.drawable.happy_man_interviewer);
        interviewer.setFullName("Mac Hamm");
        interviewer.setCurrentCompany(new Company("dropbox", 1));
        interviewer.setPosition("Senior Android Engineer");
        interviewer.setPositionType(3);

        List<Company> previousCompanies = new ArrayList<>();
        previousCompanies.add(new Company("google", 2));
        previousCompanies.add(new Company("dropbox", 1));
        previousCompanies.add(new Company("gusto", 0));
        interviewer.setPreviousCompanies(previousCompanies);

        return interviewer;
    }

    public static Interviewer SHIRLEY_CONNOR() {

        Interviewer interviewer = new Interviewer();
        interviewer.setAvatar(R.drawable.happy_woman_interviewer);
        interviewer.setFullName("Shirley Conner");
        interviewer.setCurrentCompany(new Company("dropbox", 1));
        interviewer.setPosition("Junior iOS Developer");
        interviewer.setPositionType(2);

        List<Company> previousCompanies = new ArrayList<>();
        previousCompanies.add(new Company("google", 2));
        previousCompanies.add(new Company("dropbox", 1));
        previousCompanies.add(new Company("gusto", 0));
        interviewer.setPreviousCompanies(previousCompanies);

        return interviewer;
    }

    public static Interviewer SONYA_KOSLAVOKA() {

        Interviewer interviewer = new Interviewer();
        interviewer.setAvatar(R.drawable.mercenary_woman_interviewer);
        interviewer.setFullName("Sonya Koslavoka");
        interviewer.setCurrentCompany(new Company("gusto", 0));
        interviewer.setPosition("Junior Back-end Engineer");
        interviewer.setPositionType(1);

        List<Company> previousCompanies = new ArrayList<>();
        previousCompanies.add(new Company("google", 2));
        previousCompanies.add(new Company("dropbox", 1));
        previousCompanies.add(new Company("gusto", 0));
        interviewer.setPreviousCompanies(previousCompanies);

        return interviewer;
    }

    public static Interviewer TONY_MCDONALD() {

        Interviewer interviewer = new Interviewer();
        interviewer.setAvatar(R.drawable.silly_man_interviewer);
        interviewer.setFullName("Tony McDonald");
        interviewer.setCurrentCompany(new Company("google", 2));
        interviewer.setPosition("Junior Front-end Engineer");
        interviewer.setPositionType(0);

        List<Company> previousCompanies = new ArrayList<>();
        previousCompanies.add(new Company("google", 2));
        previousCompanies.add(new Company("dropbox", 1));
        previousCompanies.add(new Company("gusto", 0));
        interviewer.setPreviousCompanies(previousCompanies);

        return interviewer;
    }

    public static Interviewer CHARLES_OLSEN() {

        Interviewer interviewer = new Interviewer();
        interviewer.setAvatar(R.drawable.speaker_man_interviewer);
        interviewer.setFullName("Charles Olsen");
        interviewer.setCurrentCompany(new Company("google", 2));
        interviewer.setPosition("Senior Back-end Engineer");
        interviewer.setPositionType(1);

        List<Company> previousCompanies = new ArrayList<>();
        previousCompanies.add(new Company("google", 2));
        previousCompanies.add(new Company("dropbox", 1));
        previousCompanies.add(new Company("gusto", 0));
        interviewer.setPreviousCompanies(previousCompanies);

        return interviewer;
    }

    public static Interviewer JANET_HOWELL() {

        Interviewer interviewer = new Interviewer();
        interviewer.setAvatar(R.drawable.woman_phone_interviewer);
        interviewer.setFullName("Janet Howell");
        interviewer.setCurrentCompany(new Company("gusto", 0));
        interviewer.setPosition("Junior Android Developer");
        interviewer.setPositionType(3);

        List<Company> previousCompanies = new ArrayList<>();
        previousCompanies.add(new Company("google", 2));
        previousCompanies.add(new Company("dropbox", 1));
        previousCompanies.add(new Company("gusto", 0));
        interviewer.setPreviousCompanies(previousCompanies);

        return interviewer;
    }
}