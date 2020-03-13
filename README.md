# Folder Assignment

Continue building on the `FileItem` interface and `File` and `Folder` classes that we started working on in class.

Add following two methods to the FileItem interface:

```java
int getSize();
FileItem copy();
```

Then implement both methods in the File and Folder classes.

Here is the starter code from class:

* [FileItem.java](src/main/java/FileItem.java)
* [File.java](src/main/java/File.java)
* [Folder.java](src/main/java/Folder.java)

In the File class, the `getSize()` method should simply be a getter that 
returns the size of the file. However, the size of a Folder is more complicated. 
The starting size of a Folder should be 512; furthermore, we should add 128 
for each FileItem in the Folder, plus the actual size of all of the items in 
the folder. For example, let's say that we have a Folder called folder1 that 
contains 3 Files: file1 which is size 200, file2 which is size 300, and file3 
which is size 150. Then, the size of folder1 = 512 + 128*3 + 200 + 300 + 150 = 1546.

In the File class, the `copy()` method should return a new File with of the same 
size of the original file and with  a new fileName consisting of the 
String "_copy" appended to the end of fileName of the original file. For instance, 
if we were to copy a File with fileName "file1" and size 200, we would get a new 
File with fileName "file1_copy" and size 200.

In the Folder class, the `copy()` method should return a new Folder with the new folderName consisting of the String "_copy" appended to the end of folderName of the original Folder. In addition, the copy() method should be call on all FileItems in the folder, such that the contents of the folder is copied as well.

Example client code (code here):

```java
public static void main(String[] args) 
{
    Folder folder1 = new Folder("folder1");
    folder1.add(new File("file1", 200));
    folder1.add(new File("file2", 300));
    folder1.add(new File("file3", 150));
    
    // Test getSize() method
    System.out.println(folder1.getSize());
    
    Folder folder2 = new Folder("folder2");
    folder2.add(new File("file4", 200));
    folder2.add(folder1);
    
    // Test copy() method
    Folder folder3 = folder2.copy();
    System.out.println(folder3);
}
```

Example output:

```
1546
folder2_copy: [file4_copy: 200, folder1_copy: [file1_copy: 200, file2_copy: 300, file3_copy: 150]]
```