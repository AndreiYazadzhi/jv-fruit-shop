package core.basesyntax;

import core.basesyntax.service.FileReader;
import core.basesyntax.service.FileWriter;
import core.basesyntax.service.impl.ReadFromCsvFileImpl;
import core.basesyntax.service.impl.WriteToCsvFileImpl;
import java.util.List;
import org.junit.Test;

public class FileWriterTest {

    @Test
    public void testWritingToFile_Ok() {
        FileWriter writer = new WriteToCsvFileImpl();
        writer.writeToFile("Expected report", "ExpectedReport");
        FileReader reader = new ReadFromCsvFileImpl();
        List<String> actualReport = reader.read("expectedReport");
        List<String> expectedReport = List.of("Expected report!");
    }
}