package assignment6;
import java.io.File;
import java.util.Scanner;

class FileType {
	String getFileType(File f) {
		String fileName = f.getName();
	      int dotIndex = fileName.lastIndexOf('.');
	      if (dotIndex == -1) {
	          return "unknown";
	      }
	      String ext = fileName.substring(dotIndex + 1).toLowerCase();
	      switch (ext) {
	          case "txt":
	              return "text file";
	          case "jpg":
	          case "jpeg":
	          case "png":
	              return "image file";
	          case "pdf":
	              return "PDF file";
	          case "doc":
	          case "docx":
	              return "Word document";
	          case "mp3":
	        	  return "Audio file";
	          default:
	              return "unknown";
	      }
	}
}

public class FileInfo {
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter file name with path: ");
      String fileName = sc.nextLine();
      FileType ft = new FileType();
      File f = new File(fileName);

      if (f.exists()) {
          System.out.println("File exists: " + f.getName());
          System.out.println("File is readable: " + f.canRead());
          System.out.println("File is writable: " + f.canWrite());
          System.out.println("File type: " + ft.getFileType(f) );
          System.out.println("File length (in bytes): " + f.length());
      } else {
          System.out.println("File does not exist: " + f.getName());
      }
      sc.close();
  }
}
