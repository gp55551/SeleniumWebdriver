package SelenumRelated;

import java.io.File;
import java.io.FileFilter;
import java.util.Arrays;

import org.apache.commons.io.comparator.LastModifiedFileComparator;
import org.apache.commons.io.filefilter.WildcardFileFilter;

//import net.lingala.zip4j.core.ZipFile;
import net.lingala.zip4j.exception.ZipException;
import net.lingala.zip4j.model.ZipParameters;

public class ExtractZip {

	public static void main(String[] args) throws ZipException {
		// TODO Auto-generated method stub

		/*ZipFile zip = new ZipFile(new File("\\D:\\GauravLearnSpace\\GauravLearn\\pics.zip"));
		zip.extractAll("\\D:\\GauravLearnSpace\\GauravLearn\\zipExtractedFiles\\");
		System.out.println("extraction successful");
		
		ZipFile zip1 = new ZipFile(new File("\\D:\\GauravLearnSpace\\GauravLearn\\gaurav.zip"));
		*/
		takeLatestZipAndExtract();
		
	}
	
	public static void takeLatestZipAndExtract() throws ZipException
	{
		File fileFirst;
		File folder = new File("\\D:\\GauravLearnSpace\\GauravLearn");
		FileFilter fileFilter = new WildcardFileFilter("*.zip");
		File[] files = folder.listFiles(fileFilter);
		System.out.println("Just taking the latest zip file...");
		if (files.length > 0) {
			Arrays.sort(files, LastModifiedFileComparator.LASTMODIFIED_REVERSE);
			fileFirst = files[0];
			net.lingala.zip4j.ZipFile zip = new net.lingala.zip4j.ZipFile(fileFirst);
			zip.extractAll("\\D:\\GauravLearnSpace\\GauravLearn\\zipExtractedFiles\\");
			System.out.println("extraction successful");
				
		}
		
			
			
	}

}
