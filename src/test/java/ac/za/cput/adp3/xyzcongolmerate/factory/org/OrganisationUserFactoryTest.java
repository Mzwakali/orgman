package ac.za.cput.adp3.xyzcongolmerate.factory.org;

import ac.za.cput.adp3.xyzcongolmerate.domain.org.Organisation;
import ac.za.cput.adp3.xyzcongolmerate.domain.org.OrganisationUser;
import ac.za.cput.adp3.xyzcongolmerate.domain.user.User;
import ac.za.cput.adp3.xyzcongolmerate.factory.user.UserFactory;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class OrganisationUserFactoryTest {


    @Test
    public void buildOrganisationUser() {
        Organisation orgName = OrganisationFactory.buildOrganisation("IFA");
        User endUser = UserFactory.buildUser("mzw@gmail.com", "Thando", "Mzwakali");
        OrganisationUser orgUser = OrganisationUserFactory.buildOrganisationUser(orgName.getOrgCode(),endUser
        .getUserEmail());
        Assert.assertNotNull(orgUser);
    }
}