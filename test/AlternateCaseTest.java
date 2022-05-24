import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AlternateCaseTest {

    private final AlternateCase alternateCase = new AlternateCase();

    @Test
    public void testNullStringAlternateCase() {

        String response = alternateCase.applyOperation("");
        assertEquals("", response);
    }

    @Test
    public void testStringAlternateCase() {

        String response = alternateCase.applyOperation("ASCII");
        assertEquals("aScIi", response);
    }

    @Test
    public void testNumberStringAlternateCase() {

        String response = alternateCase.applyOperation("42");
        assertEquals("42", response);
    }

    @Test
    public void testMixedStringAlternateCase() {

        String response = alternateCase.applyOperation("#include <iostream>");
        assertEquals("#iNcLuDe <IoStReAm>", response);
    }

    @Test
    public void testSentenceWithSymbolsStringAlternateCase() {

        String response = alternateCase.applyOperation("This example will start with lowercase and PPCG Rocks!!!");
        assertEquals("tHiS eXaMpLe WiLl StArT wItH lOwErCaSe AnD pPcG rOcKs!!!", response);
    }
}
