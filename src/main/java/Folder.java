import java.util.ArrayList;

/**
 * Write a description of class Folder here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Folder implements FileItem {
    private String folderName;
    private ArrayList<FileItem> items;

    public Folder(String folderName) {
        this.folderName = folderName;
        this.items = new ArrayList<FileItem>();
    }

    public void add(FileItem item) {
        this.items.add(item);
    }

    public int getCount() {
        int count = 1;

        for (FileItem item : items) {
            count += item.getCount();
        }

        return count;
    }

    @Override
    public String toString() {
        return this.folderName + ": " + this.items;
    }
}