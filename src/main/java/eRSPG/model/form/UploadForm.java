package eRSPG.model.form;

import java.util.ArrayList;
import java.util.List;

import eRSPG.model.Proposal;
import org.springframework.web.multipart.MultipartFile;

import eRSPG.model.UploadFile;

public class UploadForm  extends BaseForm{
	private MultipartFile fileUpload;
	private String name;
	private byte[] bytes;

	@Override
	public void saveToProposal(Proposal proposal){

	}


	public byte[] getBytes() {
		return bytes;
	}

	public void setBytes(byte[] bytes) {
		this.bytes = bytes;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public MultipartFile getFileUpload() {
		return fileUpload;
	}

	public void setFileUpload(MultipartFile fileUpload) {
		this.fileUpload = fileUpload;
	}
	
	private UploadFile generateUploadFile()
	{
		UploadFile file = new UploadFile();
		//file.setFileName(fileName);
		return file;
		
	}
	
	public List<UploadFile> generateUploadFiles()
	{
		List<UploadFile> uploadList = new ArrayList<>();
		
		if( !(fileUpload == null))
		{
			UploadFile file = generateUploadFile();
			uploadList.add(file);
		}
		
		return uploadList;
	}
}
