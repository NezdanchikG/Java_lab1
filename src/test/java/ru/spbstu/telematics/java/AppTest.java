import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class AppTest {

    @Test
    void testReadFileAndPrintContent() throws IOException {
        // Arrange
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        // Act
        App.main(new String[]{});

        // Assert
        String expectedOutput = "Your expected content from the 'input.txt' file"; // Замените на ожидаемое содержимое файла
        assertEquals(expectedOutput, outputStream.toString().trim());
        
        // Clean up
        System.setOut(System.out);
    }

    @Test
    void testFileNotFound() {
        // Arrange
        String nonExistentFilePath = "nonexistent.txt";

        // Act and Assert
        assertThrows(IOException.class, () -> App.main(new String[]{nonExistentFilePath}));
    }
}
