package fit2drive.data.members.datafile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.Table;

import org.hibernate.annotations.Type;

import fit2drive.data.entities.F2DEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Class to wrap an arbitrary file to be saved to a database using
 * Hibernate.
 */
@EqualsAndHashCode(callSuper=false)
@Data
@Entity
@Table(name="dataFile")
public class DataFile extends F2DEntity {
	
	/** Extension of the file. **/
	String extension;
	
	/** Name of the file. **/
	String fileName;
	
	public DataFile(){}
	
	@Lob
	@Type(type="org.hibernate.type.PrimitiveByteArrayBlobType")
	byte[] fileAsBytes;
	
	
	/**
	 * @param fileName
	 * @param extension
	 * @param pictureAsBytes
	 */
	public DataFile(
			String fileName,
			String extension,
			byte[] pictureAsBytes) {
		this.fileName = fileName;
		this.extension = extension;
		this.fileAsBytes = pictureAsBytes;
	}
	
	/**
	 * @param fileName
	 * @param extension
	 * @param file
	 */
	public DataFile(
			String fileName,
			String extension,
			File file) {
		
		this.fileName = fileName;
		this.extension = extension;
		this.setFile(file);
	}
	
	
	/**
	 * Method to set the byte array representing the file which
	 * can be serialized to a database.
	 * 
	 * @param file - file which is contained in the picture
	 */
	public void setFile(File file) {
		try {
			byte[] bFile = new byte[(int) file.length()];
			FileInputStream fileInputStream = new FileInputStream(file);
			//convert file into array of bytes
			fileInputStream.read(bFile);
			fileInputStream.close();
			this.setFileAsBytes(bFile);
		} catch (Exception e) {
			e.printStackTrace();
			throw new Error("Error in DataFile.setFile(File file)... could not write to file.");
		}
	}
	
	/**
	 * Method to write the contents of the byte array to a file.
	 * 
	 * @param file - file to write the contents to 
	 */
	public void writeToFile(File file) {
		byte[] bAvatar = this.getFileAsBytes();
		
		try{
			FileOutputStream fos = new FileOutputStream(file);
			fos.write(bAvatar);
			fos.close();
		}catch(Exception e){
			e.printStackTrace();
			throw new Error("Error in DataFile.writeToFile(File file)... could not write to file.");
		}
	}


	
}
