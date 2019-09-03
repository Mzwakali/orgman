package ac.za.cput.adp3.xyzcongolmerate.factory.user;

import ac.za.cput.adp3.xyzcongolmerate.domain.misc.Role;
import ac.za.cput.adp3.xyzcongolmerate.domain.org.Organisation;
import ac.za.cput.adp3.xyzcongolmerate.domain.user.User;
import ac.za.cput.adp3.xyzcongolmerate.domain.user.UserRole;
import ac.za.cput.adp3.xyzcongolmerate.factory.misc.RoleFactory;
import ac.za.cput.adp3.xyzcongolmerate.factory.org.OrganisationFactory;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class UserRoleFactoryTest {


    @Test
    public void buildUserRole() {
        User endUser = UserFactory.buildUser("mzw@gmail.com", "Thandiswa", "Mzwakali");
        Organisation orgName = OrganisationFactory.buildOrganisation("IFA");
        Role cfo = RoleFactory.buildRole("Chairperson");

        UserRole userRole = UserRoleFactory.buildUserRole(orgName.getOrgCode(), endUser.getUserEmail(), cfo.getRoleId());

        Assert.assertNotNull(userRole);
    }
}