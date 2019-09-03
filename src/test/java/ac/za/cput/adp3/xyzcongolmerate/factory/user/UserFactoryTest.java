package ac.za.cput.adp3.xyzcongolmerate.factory.user;

import ac.za.cput.adp3.xyzcongolmerate.domain.user.User;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class UserFactoryTest {


    @Test
    public void buildUser() {
        User endUser = UserFactory.buildUser("mzw@gmail.com", "Thando", "Mzwakali");
        Assert.assertNotNull(endUser);

    }
}