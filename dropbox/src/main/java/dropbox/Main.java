package dropbox;

import model.DropboxDirectory;
import model.DropboxFile;
import model.MetaCreator;
import com.dropbox.core.DbxException;
import com.dropbox.core.DbxRequestConfig;
import com.dropbox.core.v2.DbxClientV2;
import com.dropbox.core.v2.files.ListFolderResult;
import com.dropbox.core.v2.files.Metadata;
import com.dropbox.core.v2.users.FullAccount;

import exceptions.directory.CreateDirectoryExceptions;
import exceptions.directory.DeleteDirectoryExceptions;
import exceptions.directory.SearchDirectoryExceptions;
import exceptions.file.DeleteFileExeption;
import exceptions.file.UploadFileExeption;

public class Main {
    private static final String ACCESS_TOKEN = "8AcMbJiKViAAAAAAAAAADUXBL3xJ67ZwtLJa3NBEJRVooHCeoIlAWbXH1bsf6QZq";

    public static void main(String args[]) throws DbxException, CreateDirectoryExceptions, DeleteDirectoryExceptions, SearchDirectoryExceptions, DeleteFileExeption {
//        // Create Dropbox client
//        DbxRequestConfig config = DbxRequestConfig.newBuilder("dropbox/java-tutorial").build();
//        DbxClientV2 client = new DbxClientV2(config, ACCESS_TOKEN);
//        
//     // Get current account info
//        FullAccount account = client.users().getCurrentAccount();
//        System.out.println(account.getName().getDisplayName());
//        
//     // Get files and folder metadata from Dropbox root directory
//        ListFolderResult result = client.files().listFolder("");
//        while (true) {
//            for (Metadata metadata : result.getEntries()) {
//                System.out.println(metadata.getPathLower());
//            }
//
//            if (!result.getHasMore()) {
//                break;
//            }
//           
//            result = client.files().listFolderContinue(result.getCursor());
//        }
    	
    	
	
    	// test prvi storidz
//    	DropboxDirectory dropbox = new DropboxDirectory(ACCESS_TOKEN);
//    	DropboxFile dropboxFile = new DropboxFile(dropbox.getClient());
//    	try {
//			dropboxFile.upload("users.json", "/prviStoridz/users.json");
//		} catch (UploadFileExeption e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
    	// kraj testa
    
    	//dropbox.create("/test",null);
    	//dropbox.delete("/vladatest");
    	//dropbox.download("/test", "Downloaded.zip");
    	//dropbox.listAllinDirectory("/test");
    	//dropboxFile.delete("/test");
    	
    	Connection connection = new Connection();
    	connection.createNewStorage("/tesdds");
    	connection.dropbox.listAllinDirectory("");
    	//System.out.println(connection.currentPath);
    	
   
   }
    	
}