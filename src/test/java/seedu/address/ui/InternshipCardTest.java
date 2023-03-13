package seedu.address.ui;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


import org.junit.jupiter.api.Test;

import seedu.address.testutil.TypicalInternships;

public class InternshipCardTest extends GuiUnitTest {
    @Test
    public void equals() {
        InternshipCard internshipCardAmazonOne = new InternshipCard(TypicalInternships.AMAZON, 1);
        InternshipCard internshipCardAmazonTwo = new InternshipCard(TypicalInternships.AMAZON, 2);
        InternshipCard internshipCardAmazonOneDuplicate = new InternshipCard(TypicalInternships.AMAZON, 1);
        //Same object
        assertTrue(internshipCardAmazonOne.equals(internshipCardAmazonOne));

        //Not an instance of internship card
        assertFalse(internshipCardAmazonOne.equals(TypicalInternships.AMAZON));

        //Same internship but different index should not be equal
        assertFalse(internshipCardAmazonOne.equals(internshipCardAmazonTwo));

        //Different objects but same internship and index
        assertTrue(internshipCardAmazonOne.equals(internshipCardAmazonOneDuplicate));
    }

}
