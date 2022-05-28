import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

class SimpleFileReader {
    public String readFileContentsOrNull(String path) {
        try {
            return Files.readString(Path.of(path));
        } catch (IOException e) {
            System.out.println("Невозможно прочитать файл с месячным отчётом." +
                    " Возможно, файл не находится в нужной директории.");
            return null;
        }
    }
}
// Класс, который осуществляет считывание файлом и раскидывает их по другим классам