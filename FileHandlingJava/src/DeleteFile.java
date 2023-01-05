import java.io.File;
import java.util.Scanner;

public class DeleteFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the directory path: ");
        String dirPath = scanner.nextLine();
        System.out.print("Enter the file extension: ");
        String fileExtension = scanner.nextLine();

        File dir = new File(dirPath);
        File[] files = dir.listFiles((d, name) -> name.endsWith(fileExtension));

        for (File file : files) {
            if (file.delete()) {
                System.out.println(file.getName() + " was deleted successfully.");
            } else {
                System.out.println("Failed to delete " + file.getName());
            }
        }
    }
}
