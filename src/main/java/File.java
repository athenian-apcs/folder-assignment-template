/**
 * Write a description of class File here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class File implements FileItem {
    private String fileName;
    private int size;

    public File(String fileName, int size) {
        this.fileName = fileName;
        this.size = size;
    }

    public int getCount() {
        return 1;
    }

    @Override
    public String toString() {
        return this.fileName + ": " + this.size;
    }
}