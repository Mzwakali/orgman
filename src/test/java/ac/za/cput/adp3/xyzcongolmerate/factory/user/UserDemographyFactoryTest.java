package ac.za.cput.adp3.xyzcongolmerate.factory.user;

import ac.za.cput.adp3.xyzcongolmerate.domain.demography.Gender;
import ac.za.cput.adp3.xyzcongolmerate.domain.demography.Race;
import ac.za.cput.adp3.xyzcongolmerate.domain.user.User;
import ac.za.cput.adp3.xyzcongolmerate.domain.user.UserDemography;
import ac.za.cput.adp3.xyzcongolmerate.factory.demography.GenderFactory;
import ac.za.cput.adp3.xyzcongolmerate.factory.demography.RaceFactory;
import org.junit.Assert;
import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.*;

public class UserDemographyFactoryTest {


    @Test
    public void buildUserDemography() {
        User endUser = UserFactory.buildUser("mzw@gmail.com", "Thando", "Mzwakali");
        Gender f = GenderFactory.buildGender("Female");
        Race b = RaceFactory.buildRace("Black");

        UserDemography userDemo = UserDemographyFactory.buildUserDemography(endUser.getUserEmail(), "Ms", f.getGenderId(), b.getRaceId(), new Date());

        Assert.assertNotNull(userDemo);

    }
}